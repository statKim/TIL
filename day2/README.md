# SaaS (Software as a Service)

> python - Flask
>
> Js - expressJS
>
> Ruby - sinatra

> JSP, Spring은 소형 project에 부적합 => python의 Flask를 비롯한 경량형 Framework 이용
>
>  - '핵심'만 '짧은 코드'로 개발!!



* ORM(Object Relational Mapping)
  * DB의 단점 : DB마다 다른 SQL문의 차이 & 프로그래밍언어와 SQL문이 섞인 코드 작성
  * ex) SQLArchemy
  * DevOps - 개발(developer) + 운영(operation;서버)  => 현재의 개발자 영역!!
    * Cloud 서버의 등장으로 서버이용 쉬워짐(ex. C9)

- PaaS (Platform as a Service)
  - ex) Heroku
- IaaS (Infrastructure as a Service)
- AWS (Amazon Web Service) - cloud9(c9)
- APIs - 다양한 API 사용할 것!
  - RESTful API

* git
  * github pages		
  * bootstrap theme



### git Bash를 이용하여 github에 업로드 하는 방법!

- 순서

  >cd 폴더명 # 폴더 이동!!
  
  >git init
  
  >ls -al
  
  >git status
  
  >git add 파일명 #staging area에 add, 전체 add 때는 . 찍으면 됨(git add .)
  
  >git status # 상태 확인
  
  >git commit -m "first commit" # save(snap shot 찍는 단계)
  
  >git status # 다시 상태 확인
  
  >git log # history 확인
  
  >push => 만든 repository에서 push 부분 코드 사용
 
  >git remote add origin https://github.com/statKim/statKim.github.io.git  # 원격저장소 추가
  
  >git remote -v # 원격저장소 확인
  
  >git push -u origin master # git에 push
  
  >- 수정된 부분 확인 가능(초록색 부분)
  
  >   git diff



- telegram

- Telegram Bot API
- chrome 확장프로그램 - json viewer 추가 설정시 json 파일 볼때 정리된 형태로 볼 수 있음

- Cron / Heroku

  > 시간 설정해놓고 반복하는 것
  >
  > ex) 2018년 8월 28일 5시에 메세지 보낼때
