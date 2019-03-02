########################################################################
################## Chapter 3. Sampling ########################
########################################################################

## 1. training set and test set

library(ISLR)
set.seed(2)
train <- sample(nrow(Auto),196) # 1~392에서 196개의 난수 생성

lm.fit <- lm(mpg~horsepower, data=Auto, subset=train)
lm.fit2 <- lm(mpg~poly(horsepower ,2), data=Auto, subset=train)
lm.fit3 <- lm(mpg~poly(horsepower ,3), data=Auto, subset=train)

## test MSE
attach(Auto)
test_mse <- vector() # 비어있는 vector 생성
	# 참고 - predict() 옵션에 test set(또는 predict할 data) 안넣으면 
	# fit할 때 쓰인 training set으로 predict함
test_mse[1] <- mean((mpg-predict(lm.fit,Auto))[-train]^2)
test_mse[2] <- mean((mpg-predict(lm.fit2,Auto))[-train]^2)
test_mse[3]<- mean((mpg-predict(lm.fit3,Auto))[-train]^2)

plot(test_mse, xlab='flexibility', ylab='MSE', pch=15,col=2, cex=2, ylim=c(15, 30))

## training MSE
train_mse <- vector()
train_mse[1] <- mean((mpg-predict(lm.fit,Auto))[train]^2)
train_mse[2] <- mean((mpg-predict(lm.fit2,Auto))[train]^2)
train_mse[3] <- mean((mpg-predict(lm.fit3,Auto))[train]^2)

points(train_mse, pch=15, col=3, cex=2)

legend('topright',c('training','test'), pch=15, col=c(2,3))



## 2. LOOCV
error <- vector()

for(i in 1:nrow(Auto)){
  train <- Auto[-i,] # i번째 data 제외한 data
  lm.fit <- lm(mpg~horsepower, data=train)
  yhat <- predict(lm.fit, Auto[i,])
  error[i] <- (Auto$mpg[i]-yhat)^2
}

mean(error) # testMSE using LOOCV

# cv.glm을 사용한 cv error 구하기(단, 반드시 glm 사용해야 함!!)
library(boot)
glm.fit <- glm(mpg~horsepower, data=Auto)
cv.err <- cv.glm(Auto, glm.fit)
cv.err$delta[1] # cv.err$delta의 결과는 2개, 2번째 값은 보정한 값(modified value)


## 3. K-fold CV

library(boot)
set.seed(17)
glm.fit <- glm(mpg~horsepower, data=Auto)
cv.err <- cv.glm(Auto, glm.fit, K=10) # 10-fold CV (k=n => LOOCV(default))
cv.err$delta[1]

MSE_k <- vector()
n <- nrow(Auto)
K <- 10
set.seed(17)
kfold <- sample(rep(1:K, ceiling(n/K)), n)
table(kfold) # 각 fold마다 배정된 값의 개수

for(k in 1:10){
  train <- Auto[which(kfold!=k),] # which(조건) : T/F 반환
  test <- Auto[which(kfold==k),]
  lm.fit <- lm(mpg~horsepower ,data=train)
  yhat <- predict(lm.fit, test)
  MSE_k[k] <- sum((test$mpg-yhat)^2)/nrow(test)
}
((MSE_k)%*%table(kfold))/n # testMSE(각 개수별로 가중치를 둔 testMSE)
mean(MSE_k) # 단순하게 나온 값 mean

## 4. bootstrap
# lm의 coef를 반환해주는 사용자 정의 함수
boot.fn <- function(data,index){
  coef <- coef(lm(mpg~horsepower, data=data, subset=index))
  return(coef)
}

boot.fn(Auto, 1:392)

# boot(data, fn, ?) : fn의 경우는 내가 정의!!(estimate할 para)
boot(Auto, boot.fn, 1000) # 1000개의 bootstrap sample 사용, lm의 coef를 estimate



##############################
#####  wrong way to apply CV 
##### - 즉, cor 높은 변수 뽑을 때부터 CV를 사용하여 계속 10개의 변수가 바뀌게 해야하지만
#####	  여기서 하고 있는 것은 처음에 cor 높은 10개 뽑은 후에 그 변수들만을 가지고 CV를 사용하여 MSE 계산
#####	  즉, 틀린 방법!!!!!!!
##############################

## 틀린 방법
y <- rnorm(50)
x <- matrix(rnorm(50*5000), nrow=50, ncol=5000) # 50x5000의 matrix 생성(normal dist에서 뽑음)

cor_result <- vector()
for(i in 1:ncol(x)){
  cor_result[i] <- cor(y, x[,i])
}
newx <- x[, order(cor_result, decreasing=T)[1:10]] # cor이 큰 것 10개를 newx에 저장(50 x 10)
data <- data.frame(y=y, newx=newx) # cor 높은 10개의 변수만 포함
head(data)

library(boot)
glm.fit <- glm(y~., data, family='gaussian')
cv.err <- cv.glm(data=data, glmfit=glm.fit, K=5) # 5-fold CV
cv.err$delta[1]

### 맞는 방법!!!
# 10-fold CV
MSE_k <- vector()
data <- data.frame(y=y, x=x) # 전체 데이터 (50 x 5001)
n <- nrow(data)
K <- 10
kfold <- sample(rep(1:K, ceiling(n/K)), n) # ceiling(d) : d를 올림( ex) ceiling(6.2)=7 )

for(k in 1:10){
  train <- data[which(kfold!=k),]
  test <- data[which(kfold==k),]

  # 각 fold마다 cor 높은 변수 10개를 뽑음
  cor_result <- vector()
  for(i in 1:ncol(train)){
    cor_result[i] <- cor(train$y, train[,i])
  }
  newx <- train[,-1][, order(cor_result, decreasing=T)[1:10]]
  data2 <- data.frame(y=train$y, newx=newx)

  lm.fit <- lm(y~., data=data2)
  # yhat = X %*% Beta_hat (regression); 여기서 첫번째 열은 intercept여서 모든 원소가 1
  yhat <- as.matrix(cbind(1, test[,-1][, order(cor_result, decreasing=T)[1:10]])) %*% lm.fit$coefficients
  MSE_k[k] <- sum( (test$y-yhat)^2 )/nrow(test)
}
((MSE_k)%*%table(kfold))/n # testMSE
