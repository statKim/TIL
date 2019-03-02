library(ISLR)
attach(Wage)

## polynomial regression
fit <- lm(wage~poly(age,4), data=Wage) 
coef(summary(fit))
cov(fit$model)

fit2 <- lm(wage~poly(age, 4, raw=T), data=Wage) ##lm(wage~age+I(age^2)+I(age^3)+I(age^4),data=Wage)
coef(summary(fit2))
cov(fit2$model)

agelims <- range(age) # 18 ~ 80
age.grid <- seq(from=agelims[1], to=agelims[2])
preds <- predict(fit, newdata=list(age=age.grid), se=TRUE)
se.bands <- cbind(preds$fit+2*preds$se.fit, preds$fit-2*preds$se.fit) # confidence interval

par(mfrow=c(1,2))
plot(age, wage, cex=.5, col="darkgrey")
lines(age.grid, preds$fit, lwd=2, col="blue")
matlines(age.grid, se.bands, lwd=1, col="blue", lty=3)  # matrix 형태를 각각 line 그려줌!!
 
 
## step function
table(cut(age, 4))
fit <- lm(wage~cut(age, 4), data=Wage) 
coef(summary(fit))
#age.grid=seq(from=agelims[1],to=agelims[2], by=0.01)
preds <- predict(fit, newdata=list(age=age.grid), se=TRUE)
se.bands <- cbind(preds$fit+2*preds$se.fit, preds$fit-2*preds$se.fit ) # CI

plot(age, wage, cex=.5, col="darkgrey")
lines(age.grid, preds$fit, lwd=2, col="blue")
matlines(age.grid, se.bands, lwd=1, col="blue", lty=3)
 
 
 
## spline
 
library(splines)

# cubic spline
fit <- lm(wage~bs(age, knots=c(25,40,60)), data=Wage) ## cubic spline
pred <- predict(fit, newdata=list(age=age.grid), se=T)

plot(age,wage,col="gray")
lines(age.grid,pred$fit,lwd=2)
lines(age.grid,pred$fit+2*pred$se ,lty="dashed")
lines(age.grid,pred$fit-2*pred$se ,lty="dashed")

# natural spline
fit2 <- lm(wage~ns(age, df=4), data=Wage) ## natural spline
pred2 <- predict(fit2, newdata=list(age=age.grid), se=T) 
lines(age.grid, pred2$fit, col="red", lwd=2)
lines(age.grid, pred2$fit+2*pred2$se, lty="dashed", col=2)
lines(age.grid, pred2$fit-2*pred2$se, lty="dashed", col=2)

# smoothing spline => solution : natural spline
plot(age, wage, xlim=agelims, cex=.5, col="darkgrey")
fit2 <- smooth.spline(age, wage, cv=T)
lines(fit2, col="blue", lwd=2)
   
   
## local regression
fit <- loess(wage~age, span=.1, data=Wage)
fit2 <- loess(wage~age, span=.9, data=Wage)
  
agelims <- range(age)	# age의 범위를 보여줌(최소값,최대값)
age.grid <- seq(from=agelims[1], to=agelims[2])
plot(age, wage, xlim=agelims, cex=.5, col="darkgrey")
title("Local Regression")
lines(age.grid, predict(fit, data.frame(age=age.grid)), col="red", lwd=2)
lines(age.grid, predict(fit2, data.frame(age=age.grid)), col="blue", lwd=2)
legend("topright", legend=c("Span=0.1", "Span=0.9"), col=c("red","blue"), lty=1, lwd=2, cex=.8)
   
## gam
library(splines)
library(gam)
gam1 <- lm(wage~ns(year,4)+ns(age,5)+education, data=Wage)
gam.m2 <- gam(wage~s(year,df=4)+lo(age,span=0.7)+education, data=Wage)
gam.m3 <- gam(wage~s(year,4)+s(age,5)+education, data=Wage)
  
par(mfrow=c(3,3))
plot(gam.m2, se=TRUE, col="blue")
plot.Gam(gam1, se=TRUE, col="red")
plot(gam.m3, se=TRUE, col="green") 
  
  
gam.lr <- gam(I(wage>250)~year+s(age,df=5)+education, family=binomial, data=Wage)
par(mfrow=c(2,3))
plot(gam.lr, se=T, col="green")
  
gam.lr.s <- gam(I(wage>250)~year+s(age,df=5)+education, family=binomial, data=Wage, subset=(education!="1. < HS Grad"))
plot(gam.lr.s, se=T, col="red")