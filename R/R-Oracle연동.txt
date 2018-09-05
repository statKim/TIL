######################
##### R & Oracle 연동
######################

install.packages("rJava")
install.packages("DBI")
install.packages("RJDBC")

#제일 먼저 로딩
library(rJava)
#Sys.setenv(JAVA_HOME='C:\\Program Files\\Java\\jre1.8.0_161')
library(DBI)
#rJava에 의존적이기 때문에, rJava 먼저 로딩해야 한다.
library(RJDBC) 


##Oracle 연동(Oracle 11g)
#driver
drv <- JDBC("oracle.jdbc.driver.OracleDriver","C:\\oraclexe\\app\\oracle\\product\\11.2.0\\server\\jdbc\\lib\\ojdbc6.jar")

##DB 연동
#connection 객체 생성
conn <- dbConnect(drv, "jdbc:oracle:thin:@//(아이피):(포트번호)/(SID)", "(접속 아이디)", "(접속 비밀번호)")
#쿼리 입력
rst <- dbGetQuery(conn, "SELECT * FROM board")
#출력
rst