####################################
### Chapter 6. Supervised Learning
####################################

# 1차와 2차 regression 비교
library(ISLR)
fit <- lm(mpg~horsepower,data=Auto)
summary(fit)
fit2 <- lm(mpg~poly(horsepower,2,raw=T),data=Auto)
summary(fit2)
with(Auto,plot(horsepower,mpg))
abline(fit,col=2)
curve(coef(fit2)[1]+coef(fit2)[2]*x+coef(fit2)[3]*x^2,add=T,col=3)
plot(fit,1) # residual plot

# kNN regression
library(ISLR)
library(caret)
fit <- knnreg(data.frame(horsepower=Auto$horsepower),Auto$mpg,k=10)
xt <- seq(46,230,by=0.001)
yhat <- predict(fit,data.frame(horsepower=xt))
plot(xt,yhat,type="l",col="red")
with(Auto,points(horsepower,mpg))