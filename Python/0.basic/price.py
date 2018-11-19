from bs4 import BeautifulSoup
import urllib.request as req

# HTML 가져오기
url = "https://finance.naver.com/marketindex/"
res = req.urlopen(url)

# html 분석하기
'''
    html.parser
    BeautifulSoup 객체 생성시 html.parser라는 것을 적용
    기능 : 크롤링 하고자 하는 웹 페이지 문서 분석, 문법 오류 검증, 변환도 적용하게 해주는 기능
'''
soup = BeautifulSoup(res, "html.parser")

# 원하는 데이터 추출하기
price = soup.select_one("#exchangeList > li.on > a.head.usd > div > span.value").string
print(price)

# 파일 저장
f = open("C:/ITStudy/4.python/dataSet/price.csv", "w", encoding="utf-8")
f.write(price)
f.close()