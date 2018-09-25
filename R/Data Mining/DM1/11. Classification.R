#################################
### Chapter 11. Classification
#################################

library(MASS)
fit2 <- qda(Species~., data=iris[train,])
fit2
pred2 <- predict(fit2, newdata=iris[-train,])
pred2	# post. prob 구해줌(classification 결과도 포함) 

mean(pred2$class != iris$Species[-train])	# classification 결과(틀린비율)
cbind(pred2$class, iris$Species[-train])
table(pred=pred2$class, true=iris$Species[-train])	# confusion matrix

##########################
## 변수를 categorical로 변환
##########################

n<-dim(iris)[1]
fsl<-rep("VL",n)
fsl[iris[,1]<=6.4]<-"L"
fsl[iris[,1]<=5.8]<-"S"
fsl[iris[,1]<=5.1]<-"VS"
fsl<-factor(fsl)

fsw<-rep("L",n)
fsw[iris[,2]<=3.3]<-"M"
fsw[iris[,2]<=2.8]<-"S"
fsw<-factor(fsw)

irisf.train <- data.frame(fsl=fsl[train],fsw=fsw[train],Y=iris[train,5])
irisf.test <- data.frame(fsl=fsl[-train],fsw=fsw[-train],Y=iris[-train,5])

# Logistic regression("glm"은 response가 binary인 경우만 사용 가능)
library(nnet)
fit3 <- multinom(Y~fsl*fsw, data=irisf.train) # multinomial logistic regression
summary(fit3)
pred3 <- predict(fit3, newdata=irisf.test)
pred3
mean(pred3 != irisf.test$Y)
table(pred=pred3, true=irisf.test$Y)

#######################
#### Naive Bayes
#######################

library(e1071)
fit <- naiveBayes(Species~.,data=iris.train)
pred.iris <- predict(fit,iris.test)
iris.test[,5]
table(pred=pred.iris,true=iris.test[,5])
mean(pred.iris!=iris.test[,5])

library(naivebayes)
fit1 <- naive_bayes(Y~.,data=irisf.train)
pred.irisf <- predict(fit1,irisf.test)
table(pred=pred.irisf,true=irisf.test[,3])
mean(pred.irisf!=irisf.test[,3])

#########################
#### LDA & QDA
#########################

library(MASS)
iris12 <- iris[,c(1,2,5)]
attach(iris12)

plot(iris12,col=iris12[,3])
plot(Sepal.Length,Sepal.Width,col=iris12[,3])

n <- dim(iris12)[1]
set.seed(1234)
train <- sample(n,n/2)

#LDA
fit <- lda(Species~.,data=iris12,subset=train)
pred.lda <- predict(fit,iris12[-train,])$class
table(pred.lda,iris12[-train,3])
mean(pred.lda!=iris12[-train,3])

#QDA
fit2 <- qda(Species~.,data=iris12,subset=train)
pred.qda <- predict(fit2,iris12[-train,])$class
table(pred.qda,iris12[-train,3])
mean(pred.qda!=iris12[-train,3])

#LOOCV
fitloocv <- lda(Species~.,data=iris12,cv=T)
predloocv <- predict(fitloocv,iris12)$class
table(predloocv,iris12[,3])
mean(predloocv!=iris12[,3])

fit2loocv <- qda(Species~.,data=iris12,cv=T)
pred2loocv <- predict(fit2loocv,iris12)$class
table(pred2loocv,iris12[,3])
mean(pred2loocv!=iris12[,3])

#K-fold CV
K <- 5
ind <- (1:n)%%K+1
set.seed(1234)
folds <- sample(ind,n)
predcv <- character(n)
for (k in 1:K){
	fit<-lda(Species~.,data=iris12,subset=which(ind!=k))
	predcv[ind==k]<-as.character(predict(fit,iris12[ind==k,])$class)
}
table(predcv,iris12[,3])
mean(predcv!=iris12[,3])
detach(iris12)

with(iris12,plot(Sepal.Length,Sepal.Width,col=iris12[,3]))

###################
### Logistics
###################

irisb <- iris[iris$Species!="setosa",c(1,2,5)]
plot(irisb[,1:2],col=irisb[,3])

irisb$Y <- rep(0,dim(irisb)[1])
irisb$Y[irisb$Species=="virginica"] <- 1
fit <- glm(Y~Sepal.Length,data=irisb,family=binomial)
summary(fit)
b <- c(coef(fit))
with(irisb,plot(Sepal.Length,Y))
curve(exp(b[1]+b[2]*x)/(1+exp(b[1]+b[2]*x)),col=2,add=T)

plot(irisb[,1:2],col=irisb[,3])
with(irisb,plot(Sepal.Length,Y))
curve(exp(b[1]+b[2]*x)/(1+exp(b[1]+b[2]*x)),col=2,add=T)

## Multiple logistic regression
library(ISLR)
head(Default)
str(Default)
fitb <- glm(default~balance,data=Default,family=binomial)
summary(fitb)
predict(fitb,data.frame(balance=c(1000,2000)),type="response")
fits <- glm(default~student,data=Default,family=binomial)
summary(fits)
predict(fits,data.frame(student=c("Yes","No")),type="response")
fit <- glm(default~.,data=Default,family=binomial)
summary(fit)
predict(fit,data.frame(student=c("Yes","No"),balance=rep(1500,2),income=rep(40000,2)),
type="response")

######################
### KNN
######################
library(class)
set.seed(1234)
n <- dim(iris)[1]
train <- sample(n,n/2)
error <- list()
for (i in 1:10){
	error[[i]]<-mean(knn(iris[train,1:4],iris[-train,1:4],iris[train,5],k=i)!=iris[-train,5])
}
unlist(error)

#LOOCV
error.cv <- list()
for (i in 1:10){
	error.cv[[i]]<-mean(knn.cv(iris[,1:4],iris[,5],k=i)!=iris[,5])
}
unlist(error.cv)

# iris data에 적용
for (j in 1:1){
set.seed(1234*j)
n<-dim(iris)[1]
train<-sample(n,n/2)
error<-list()
for (i in 1:10){
	error[[i]]<-mean(knn(iris[train,1:4],iris[-train,1:4],iris[train,5],k=i)!=iris[-train,5])
}
if (j==1) {plot(unlist(error),xlab="k",ylab="classification error",type="o",ylim=c(0,.1))}
else {points(c(1:10),unlist(error),col=j,type="o")}
}
plot(unlist(error.cv),xlab="k",ylab="classification error",type="o",ylim=c(0,.1))

##############################################
### CART(Classification And Regression Tree)
##############################################
library(tree)
setwd("C:/Users/김현성/Desktop/수업 자료/데이터마이닝(Data Mining)")
hdata <- read.csv("Heart.csv",header=T)
str(hdata)
hdata <- na.omit(hdata[,-1])
n <- dim(hdata)[1]
set.seed(12)
train <- sample(n,n/2)
htree <- tree(AHD~., hdata, subset=train)
plot(htree)
text(htree,pretty=T)
htree

predict(htree, newdata=hdata[-train,]) # post. prob
pred <- predict(htree, newdata=hdata[-train,], type="class")
table(pred, hdata$AHD[-train])
mean(pred != hdata$AHD[-train])

## pruning
cv.h <- cv.tree(htree,FUN=prune.misclass)
plot(cv.h$size,cv.h$dev,type="b")
prune.h <- prune.misclass(htree,best=6)
plot(prune.h)
text(prune.h)
prune.h

predp <- predict(prune.h, newdata=hdata[-train,], type="class")
predp
table(predp, hdata$AHD[-train])
mean(predp != hdata$AHD[-train])

## "rpart" packge(tree에서 나눌 때 20개보다 작아지면 stop(default가 20개))
library(rpart)
n <- dim(hdata)[1]
set.seed(10)
train <- sample(n,n/2)
hfit <- rpart(AHD~.,data=hdata,subset=train,method="class",control=rpart.control(minsplit=20))
plot(hfit,xpd = NA)
text(hfit,use.n=T,all=TRUE, cex=.7)

library(partykit)
a <- as.party(hfit)
plot(a)

hfit$cptable[which.min(hfit$cptable[,"xerror"]),"CP"] -> cp.opt
cp.opt
prune.h <- prune(hfit,cp=cp.opt)
ap<-as.party(prune.h)
plot(ap)
