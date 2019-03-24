import requests
import pandas as pd
from time import sleep
import os
        
# daily 날씨 데이터를 가져오는 함수
def get_daily_weather(self, start_date, end_date, path):
    location = pd.read_csv("location_index.csv")
    api_key = open("api_key").readlines()[0].strip()   # API key
    url_format = "http://data.kma.go.kr/apiData/getData?type=json&dataCd=ASOS&dateCd=DAY&startDt={start_date}&endDt={end_date}&stnIds={snt_id}&schListCnt=999&pageIndex={page_index}&apiKey={api_key}"
    headers = {'content-type': 'application/json;charset=utf-8'}

    for location_id in location["지점"]:
        print("{}지점입니다".format(location_id))
        for page in range(1,5,1):   # 1페이지에 999개, 총 4페이지까지 확인!
            url = url_format.format(api_key=api_key, start_date=start_date, end_date=end_date, snt_id=str(location_id), page_index=page)
            # 서버시간 초과로 인한 에러시 재실행
            try:
                response = requests.get(url, headers=headers, verify=False)
            exception:
                response = requests.get(url, headers=headers, verify=False)
            print("{}페이지입니다".format(page))
            if page == 1:
                result = pd.DataFrame(response.json()[-1]["info"])
                if len(result) == 0:
                    print("해당 지점의 데이터가 존재하지 않습니다")
                    break
            else:
                result = pd.concat([result, pd.DataFrame(response.json()[-1]["info"])], sort=False)

            # API 과부하 방지를 위해 1초 쉬었다 시작
            sleep(1)

        if len(result) != 0:
            result.to_csv("{}/weather_{}.csv".format(path, location_id), index=False, encoding="utf-8")
            print("weather_{}.csv 저장 완료!".format(location_id))

        # API 과부하 방지를 위해 2초 쉬었다 시작
        sleep(2)
        

# daily 데이터가 존재하는 지점에 대한 timely 데이터를 가져와 월별 평균기온을 저장하는 함수
def get_average_temp(start_date, end_date, path, path_save):
    location = pd.read_csv("location_index.csv")
    os_list = os.listdir(path)
    os_list = [ i.split("_")[1].split(".")[0] for i in os_list ]
    
    api_key = open("api_key").readlines()[0].strip()
    url_format = "http://data.kma.go.kr/apiData/getData?type=json&dataCd=ASOS&dateCd=HR&startDt={start_date}&startHh=00&endDt={end_date}&endHh=23&stnIds={snt_id}&schListCnt=999&pageIndex={page_index}&apiKey={api_key}"
    headers = {'content-type': 'application/json;charset=utf-8'}

    # for location_id in location["지점"][1:3]:
    for location_id in os_list:    
        print("{}지점입니다".format(location_id))
        for page in range(1,89,1):   # 1페이지에 999개, 총 88페이지까지 확인!
            print("{}페이지입니다".format(page))
            url = url_format.format(api_key=api_key, start_date=start_date, end_date=end_date, snt_id=str(location_id), page_index=page)

            try:
                response = requests.get(url, headers=headers, verify=False)
            except:
                sleep(3)
                response = requests.get(url, headers=headers, verify=False)

            if page == 1:
                result = pd.DataFrame(response.json()[-1]["info"])
                if len(result) == 0:
                    print("해당 지점의 데이터가 존재하지 않습니다")
                    break
                else:
                    result = result[["TM","TA"]]
            else:
                try:
                    result = pd.concat([ result, pd.DataFrame(response.json()[-1]["info"])[["TM","TA"]] ], sort=False)
                except:
                    break

    #         if page % 10 == 0:
    #             print("{}페이지입니다".format(page))

            # API 과부하 방지를 위해 1초 쉬었다 시작
            sleep(1)

        if len(result) != 0:
            result["YYYYMM"] = result["TM"].map(lambda x : "".join(x.split("-")[:2]))
            grouped = result.groupby("YYYYMM")
            result = pd.concat([grouped["YYYYMM"].max(),
                                grouped["TA"].mean()],
                               axis=1,
                               keys=["연월","평균기온"])
            result.to_csv("{}/timely_weather_{}.csv".format(path_save, location_id), index=False, encoding="utf-8")
            print("timely_weather_{}.csv 저장 완료!".format(location_id))

        # API 과부하 방지를 위해 2초 쉬었다 시작
        sleep(2)    

        
# 지점별 monthly 데이터 생성하는 함수
def get_monthly_weather(daily_path, timely_path, save_path):
    var_index = pd.read_csv("var_index.csv")   # 최종 데이터에 필요한 변수 목록
    os_list = os.listdir(daily_path)
    os_list = [ i.split("_")[1].split(".")[0] for i in os_list ]

    for location_id in os_list:
        file_1 = "{}/weather_{}.csv".format(daily_path, location_id)
        file_2 = "{}/timely_weather_{}.csv".format(timely_path, location_id)
        data_all = pd.read_csv(file_1, encoding="utf-8", engine="python")
        data_temp = pd.read_csv(file_2, encoding="utf-8", engine="python")

        # 일별 데이터를 월별로 전처리
        data_all = data_all.loc[ :,[ ind.upper() for ind in var_index["var_eng"].tolist() ] ]   # 변수 list를 대문자로 변환
        data_all["YYYYMM"] = data_all["TM"].map(lambda x: "".join(x.split("-")[:2]))
        data_all["시/도"] = data_all["STN_ID"].map(lambda x: location[location["지점"] == x]["시/도"].values[0])

        grouped = data_all.groupby("YYYYMM")
        data_all = pd.concat([grouped["YYYYMM"].max(),       # 연월
                              grouped["시/도"].max(),        # 시/도
                              grouped["STN_ID"].max(),       # 지점 
                              grouped["STN_NM"].max(),       # 지점명
                              grouped["MAX_TA"].max(),       # 최고기온
                              grouped["MIN_TA"].min(),       # 최저기온
                              grouped["MAX_TA"].mean(),      # 평균 최고기온
                              grouped["MIN_TA"].mean(),      # 평균 최저기온               
                              grouped["HR1_MAX_RN"].max(),   # 1시간 최고 강수량
                              grouped["SUM_RN"].sum(),       # 월 합 강수량
                              grouped["SUM_RN"].max(),       # 일 최다 강수량
                              grouped["AVG_RHM"].mean(),     # 평균 상대습도
                              grouped["DD_MEFS"].max(),      # 월 최심신적설
                              grouped["DD_MES"].max(),       # 월 최심적설
                              grouped["SUM_FOG_DUR"].max()   # 월 최대 안개 계속시간
                            ],
                            axis=1,
                            keys=["연월","시/도","지점","지점명","최고기온","최저기온","평균 최고기온","평균 최저기온","1시간 최고 강수량",
                                  "월 합 강수량","일 최다 강수량","평균상대습도","월 최심신적설","월 최심적설","월 최대 안개 계속시간"])

        # 전처리한 데이터와 평균기온 데이터 merge
        result = pd.concat([data_all, data_temp["평균기온"]], axis=1)

        # 최종 데이터 csv파일로 저장
        result.to_csv("{}/monthly_weather_{}.csv".format(save_path, location_id), index=False, encoding="utf-8")    
        

#
def ddd():
    # 시/도에 해당하는 지점들의 데이터를 모아서 합치기
    for city in location["시/도"].unique():    
        print(city)
        file_list = location[location["시/도"] == city]["지점"].tolist()

        for ind, file in enumerate(file_list):
            # 만약 시/도에 포함되지만 월별 데이터가 존재하지 않으면 에러가 떠도 그냥 넘어가도록 함
            try:
                if ind == 0:
                    data = pd.read_csv("data/monthly_weather_{}.csv".format(file), encoding="utf-8", engine="python")
                else:
                    data = pd.concat([data, pd.read_csv("data/monthly_weather_{}.csv".format(file), encoding="utf-8", engine="python")], axis=0)
            except:
                continue

        # 시/도 별로 groupby해서 각 변수에 average 취함
        grouped = data.groupby("연월")
        data = pd.concat([grouped["연월"].max(),
    #                       grouped["시/도"].max(),   # 문자열이라 max() 적용 불가....
                          grouped["평균기온"].mean(),
                          grouped["최고기온"].mean(),
                          grouped["평균 최고기온"].mean(),
                          grouped["최저기온"].mean(),
                          grouped["평균 최저기온"].mean(),
                          grouped["1시간 최고 강수량"].mean(),
                          grouped["월 합 강수량"].mean(),
                          grouped["일 최다 강수량"].mean(),
                          grouped["평균상대습도"].mean(),
                          grouped["월 최심신적설"].mean(),
                          grouped["월 최심적설"].mean(),
                          grouped["월 최대 안개 계속시간"].mean()
                         ], axis=1)
        data["시/도"] = city
        data = data[ ["연월","시/도","평균기온","최고기온","최저기온","평균 최고기온","평균 최저기온","1시간 최고 강수량",  \
                      "월 합 강수량","일 최다 강수량","평균상대습도","월 최심신적설","월 최심적설","월 최대 안개 계속시간" ] ]        
        print(data.shape)    
        print(pd.isna(data["평균기온"]).sum())

        # 최종 데이터 csv파일로 저장
        data.to_csv("data/monthly_weather_{}.csv".format(city), index=False, encoding="utf-8")