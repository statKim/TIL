#################################
### Chapter 12. Ensemble Methods
#################################

###########################
## Bagging & Random forest
###########################
setwd("C:/Users/김현성/Desktop/수업 자료/데이터마이닝(Data Mining)")
hdata <- read.csv("Heart.csv",header=T)
str(hdata)
hdata <- na.omit(hdata[,-1])
n <- dim(hdata)[1]

# Bagging
library(randomForest)
set.seed(10)
train <- sample(n,n/2)
set.seed(1)
bag.h <- randomForest(AHD~.,data=hdata,subset=train,mtry=13,importance=T)
bag.h
yhat.bag <- predict(bag.h,newdata=hdata[-train,])
mean(yhat.bag!=hdata$AHD[-train])
importance(bag.h)
varImpPlot(bag.h)

# Random forest
set.seed(1)
rf.h <- randomForest(AHD~.,data=hdata,subset=train,mtry=4,importance=T)
rf.h
yhat.rf <- predict(rf.h,newdata=hdata[-train,])
mean(yhat.rf!=hdata$AHD[-train])
importance(rf.h)
varImpPlot(rf.h)

## Boston Data에 적용(Regression problem)
library(MASS)
n <- dim(Boston)[1]
set.seed(1)
train <- sample(n,n/2)
boston.test <- Boston$medv[-train]
set.seed(1)

# bagging
bag.boston <- randomForest(medv~.,data=Boston,subset=train,mtry=13,importance=TRUE)
bag.boston
yhat.bag <- predict(bag.boston,newdata=Boston[-train,])
plot(yhat.bag, boston.test)
abline(0,1)
mean((yhat.bag-boston.test)^2)

bag.boston <- randomForest(medv~.,data=Boston,subset=train,mtry=13,ntree=25)
yhat.bag <- predict(bag.boston,newdata=Boston[-train,])
mean((yhat.bag-boston.test)^2)

# random forest
set.seed(1)
rf.boston <- randomForest(medv~.,data=Boston,subset=train,mtry=6,importance=TRUE)
yhat.rf <- predict(rf.boston,newdata=Boston[-train,])
mean((yhat.rf-boston.test)^2)
importance(rf.boston)
varImpPlot(rf.boston)

####################
### Boosting
####################
library(ISLR)
data(Default)
str(Default)

n<-dim(Default)[1]
set.seed(1)
train<-sample(1:n,n/2)

Default$y<-rep(0,dim(Default)[1])
Default$y[Default$default=="Yes"]<-1
dft.train<-Default[train,-1]
dft.test<-Default[-train,-1]
library(gbm)

fit<-gbm(y~.,data=dft.train,distribution="adaboost",shrinkage=1,n.tree=500,interaction.depth=4)
pred<-predict(fit,dft.test,n.tree=500)
library(caret)
confusionMatrix(factor(0.5*(sign(pred)+1)),factor(dft.test$y),positive="1")


