import requests
import json

#url = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=1ce2fa0cc74c89d0a0bc48a61a2d989f&targetDt=20180827"
url = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json"
key = "1ce2fa0cc74c89d0a0bc48a61a2d989f"
date = "20180827"
res = requests.get(url + "?key={}&targetDt={}".format(key,date))
data = json.loads(res.text)
#print(data)


movies = {} # key 값은 영화이름, value 값은 순위
#print(data["boxOfficeResult"]["dailyBoxOfficeList"][0]["movieNm"])
movie_list = data["boxOfficeResult"]["dailyBoxOfficeList"] # 리스트 형태로 되어 있는 것만 사용하기 편리하게 만들어줌
for i in movie_list:
    movies[i["movieNm"]] = i["rank"]
    #movies[int(i["rank"])] = i["movieNm"]
#print(sorted(movies))
print(movies)

# boxOfficeResult
# dailyBoxOfficeList
# len(dailyBoxOfficeList)
# rank & movieNm
