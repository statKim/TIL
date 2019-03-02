#####################
#### R_DB 연동
#### 	1. 웹에서 받아온 데이터 db에 저장
####	2. 만들어놓은 model(.rData 파일) loading
####	3. db에서 input 값 가져옴
####	4. model로 predict
####	5. output값 db에 저장
#####################

load(file="C:\\ITStudy\\2.bigData\\Box_R\\HW4.RData")

library(rJava)
library(DBI)
library(RJDBC)

drv <- JDBC("oracle.jdbc.driver.OracleDriver", "C:\\oraclexe\\app\\oracle\\product\\11.2.0\\server\\jdbc\\lib\\ojdbc6.jar")

# 접속
conn <- dbConnect(drv, "jdbc:oracle:thin:@127.0.0.1:1521:xe", "KISUSER4", "1234")
conn




# 물론 insert문도 가능 => 모든 sql 쿼리문 사용 가능 => 에러가 뜨기는 함...

test <- dbGetQuery(conn, "select * from test")
test


### Random forest

#library(randomForest)

#yhat.rf <- predict(rf.mnist,newdata=mnist_test[1,])
#yhat.rf
#mean(yhat.rf!=mnist_test$y)

x <- 1:5
y <- c(3,4,5,2,8)

fit <- lm(y~x)
#summary(fit)
pred <- predict(fit, newdata = data.frame(x=test$X))
pred <- as.data.frame(pred)

output <- pred[1,1]
output

# test 결과 다시 db로 전달
query <- paste("UPDATE test SET y =", output, "where y is null")
query
dbGetQuery(conn, query)

#dbGetQuery(conn, "INSERT INTO TEST(X) VALUES (pred)")

# write.csv(yhat.rf, "C:\\ITStudy\\2.bigData\\Box_R\\result.csv", row.names=FALSE)

