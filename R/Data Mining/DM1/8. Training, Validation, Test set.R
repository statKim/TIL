##########################################################
### Chapter 8. Training set, Validation set, and Test set
##########################################################

######################################
### Validation set(hold-out) approach
######################################
library(ISLR)
str(Auto)
n <- dim(Auto)[1]
set.seed(1)
train <- sample(1:n,n/2)
train

#Plot validation set approach
for (j in 1:10){
set.seed(10*j)
train <- sample(392,196)
vs.error <- rep(0,10)
for (i in 1:10){
	fit <- lm(mpg~poly(horsepower,i),data=Auto,subset=train)
	vs.error[i] <- mean((Auto$mpg[-train]-predict(fit,Auto[-train,]))^2)
	}
	if (j<2) {
  	plot(vs.error, type="l", ylim=c(10,30), ylab="MSE", xlab="degrees of polynomial")
	} else {lines(vs.error, type="l", col=j)}
	}

for (j in 1:10){
	set.seed(10*j)
	train <- sample(392,196)
	vs.error <- rep(0,10)
	for (i in 1:10){
		fit <- lm(mpg~poly(horsepower,i),data=Auto,subset=train)
		vs.error[i] <- mean((Auto$mpg[-train]-predict(fit,Auto[-train,]))^2)
		}
	if (j<2) {
  	plot(vs.error, type="l", ylim=c(10,30), ylab="MSE", xlab="degrees of polynomial")
	} else {lines(vs.error, type="l", col=j)}
	}


###################
### LOOCV
###################

# Leave-One-Out Cross-Validation
library(ISLR)
glm.fit <- glm(mpg~horsepower,data=Auto)
coef(glm.fit)
lm.fit <- lm(mpg~horsepower,data=Auto)
coef(lm.fit)
mean(((Auto$mpg-fitted(lm.fit))/(1-influence(lm.fit)$hat))^2)
library(boot)
glm.fit <- glm(mpg~horsepower,data=Auto)
cv.err <- cv.glm(Auto,glm.fit)
cv.err$delta
cv.error <- rep(0,10)
for (i in 1:10){
	glm.fit <- glm(mpg~poly(horsepower,i),data=Auto)
 	cv.error[i] <- cv.glm(Auto,glm.fit)$delta[1]
 	}
cv.error

plot(c(1:10),cv.error,type="o",xlab="Index",col="darkcyan")

#######################
### k-fold CV
#######################

# k-Fold Cross-Validation for linear model 
set.seed(17)
k <- 10
kfcv.error <- rep(0,10)
for (i in 1:k){
 	glm.fit <- glm(mpg~poly(horsepower,i),data=Auto)
 	kfcv.error[i] <- cv.glm(Auto,glm.fit,K=k)$delta[1]
 	}
kfcv.error
plot(kfcv.error,type="o")

#mamual cv
k <- 10
n <- dim(Auto)[1]
folds <- sample(1:k,n,replace=T,prob=rep(1/k,k)) 

#OR
ind <- (1:n)%%k+1
folds <- sample(ind,n)
kmse <- matrix(0,ncol=5,nrow=k)
for (i in 1:k){
	for (j in 1:5){
		fit <- lm(mpg~poly(horsepower,j),data=Auto[folds!=i,])
		pred <- predict(fit,newdata=Auto[folds==i,])
		kmse[i,j] <- mean((pred-Auto$mpg[folds==i])^2)	
		}
	}
apply(kmse,2,mean)

plot(c(1:10),cv.error,type="o",xlab="Index",col="darkcyan")
m <- 10
for (j in 1:m){
	set.seed(17*j)
	k <- 10
	kfcv.error <- rep(0,10)
	for (i in 1:k){
 		glm.fit <- glm(mpg~poly(horsepower,i),data=Auto)
 		kfcv.error[i] <- cv.glm(Auto,glm.fit,K=k)$delta[1]
 		}
	#kfcv.error
	if (j==1) {plot(kfcv.error,type="o")}
	else {points(c(1:10),kfcv.error,type="o",col=j)}
	}



