######################
##### R & Oracle 연동
######################

# 설치시 순서가 중요! => 순서 틀릴 시 에러
install.packages("rJava")
install.packages("DBI")
install.packages("RJDBC")

# 순서대로 import
library(rJava)
library(DBI)
library(RJDBC) # rJava에 의존적


## Oracle DB 연동(Oracle 11g)
# driver 객체 생성
drv <- JDBC("oracle.jdbc.driver.OracleDriver", "C:\\oraclexe\\app\\oracle\\product\\11.2.0\\server\\jdbc\\lib\\ojdbc6.jar")

# connection 객체 생성(DB connect)
# conn <- dbConnect(drv, "jdbc:oracle:thin:@//(아이피):(포트번호)/(SID)", "(접속 아이디)", "(접속 비밀번호)")
conn <- dbConnect(drv, "jdbc:oracle:thin:@//127.0.0.1:1521/XE", "SCOTT", "TIGER")

# SQL query 날려서 결과 가져오기
query <- "SELECT * FROMM EMP"	# 여기서는 ";"를 하면 안됨!
result <- dbGetQuery(conn, query)
result

# DB disconnect
dbDisconnect(conn)
