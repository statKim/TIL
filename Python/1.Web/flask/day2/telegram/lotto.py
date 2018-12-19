import random
import requests
import json

lotto = random.sample(range(1,46), 6)

url = "http://www.nlotto.co.kr/common.do?method=getLottoNumber&drwNo="
drwNo = "821"
res = requests.get(url + drwNo)
#print(res.text) # text 형태임!!!

# json을 dict로 parsing
a = json.loads(res.text)
# res.text 안에는 로또번호가 들어있음
#print(a)
#print(a["bnusNo"])

# 가져온 json 파일에서 로또번호만 뽑아서 winner 리스트에 저장
# ind = ["drwtNo1", "drwtNo2", "drwtNo3", "drwtNo4", "drwtNo5", "drwtNo6"]
# winner = []
# for i in ind:
#     winner.append(a[i])
# print(winner)
winner = [a["drwtNo{}".format(i)] for i in range(1,7)]

print(winner)
print(lotto)

# 로또번호 맞은 개수 확인
count = 0
for i in winner:
    for j in lotto:
        if i==j:
            count = count + 1
print(count)

# 굳이 한 줄로 했을때...
x = len([num for num in winner if num in lotto])
x = len(set(winner) & set(lotto)) # set으로 바꿔서 교집합 구해서 그것의 len() 사용
print(x)

# # 1000만번 반복했을 때 1등 몇 번 나오는지 확인
# count = 0
# for i in range(10000000):
#     lotto = random.sample(range(1,46), 6)
#     if len(set(winner) & set(lotto)) == 6:
#         count = count + 1
# print(count)