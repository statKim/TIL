## svm

# generating data
set.seed(2)
x <- matrix(rnorm(20*2,0,2), ncol=2)
y <- c(rep(-1,10), rep(1,10))
x[y==1,] <- x[y==1,] + 1
y[which(x[,2]>0)] <- -1
y[which(x[,2]<0.5)] <- 1
plot(x[,2], x[,1], col=(3-y))
dat <- data.frame(x=x, y=as.factor(y))

# svm fitting
library(e1071)
svmfit <- svm(y~., data=dat, kernel="linear", cost=10, scale=FALSE)  
# svm plot을 그리면 x2가 x축, x1이 y축으로 그려짐!! => 주의할것!!,  X:support vector, O:non-support vector
plot(svmfit, dat, ylim=c(-4,5), xlim=c(-6,5))	
table(y, svmfit$fitted)
summary(svmfit)

svmfit <- svm(y~., data=dat, kernel="linear", cost=0.01, scale=FALSE) ## cost is lambda (tradeoff between margin & contraint)
plot(svmfit, dat, ylim=c(-4,5), xlim=c(-6,5))
table(y, svmfit$fitted)
summary(svmfit)
# perfectly separable인 경우에는 labmda(cost)의 최적화는 의미 없음)

# hyper parameter(cost(lambda)를 최적화) - tune() : svm 뿐 아니라 다른 ML 방법에도 적용 가능!!
tune.out <- tune(svm, y~., data=dat, kernel="linear", ranges=list(cost=c(0.001, 0.01, 0.1, 1, 5, 10, 100)))
summary(tune.out)
bestmod <- tune.out$best.model	# cost(lambda) = 100 일 때 performance good
summary(bestmod)


## multiclass - 3 classes

# generating data
set.seed(1)
x <- matrix(rnorm(200*2), ncol=2)
x[1:100,] <- x[1:100,] + 2
x[101:150,] <- x[101:150,] - 2
y <- c(rep(1,150), rep(2,50))
x <- rbind(x, matrix(rnorm(50*2), ncol=2))
y <- c(y, rep(0,50))
x[y==0,2] <- x[y==0,2] + 2
dat <- data.frame(x=x, y=as.factor(y))
par(mfrow=c(1,1))
plot(x, col=(y+1))

# multiclass svm fitting
library(e1071)
svmfit <- svm(y~., data=dat, kernel="radial", cost=10, gamma=1)
plot(svmfit, dat)
table(y, svmfit$fitted)

svmfit <- svm(y~., data=dat, kernel="radial", cost=10, scale=FALSE)  
plot(svmfit, dat, ylim=c(-4,5), xlim=c(-6,5))
table(y, svmfit$fitted)
summary(svmfit)

# cost(lambda)가 너무 작아서 대부분이 support vector가 된다!!!
svmfit <- svm(y~., data=dat, kernel="radial", cost=0.01, scale=FALSE) ## cost is lambda (tradeoff between margin & contraint)
plot(svmfit, dat, ylim=c(-4,5), xlim=c(-6,5))
table(y, svmfit$fitted)