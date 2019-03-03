# Crawling Error 바로잡기!!



## 1. requests 객체의 인코딩 문제

- **text**메소드를 사용했을 때 한글이 깨지는 문제가 발생

![](images/encoding1.png)

#### => content 메소드 사용!!

![](images/encoding2.png)