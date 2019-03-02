############################
### Chatper 2
############################

library(MASS)
library(ISLR)

head(Boston)
dim(Boston)
pairs(Boston) # plot(Boston)과 같음(scatter plot)

##simple regression
lm.fit <- lm(medv~lstat, data=Boston)
summary(lm.fit)
names(lm.fit)
confint(lm.fit)
coef(lm.fit)
predict(lm.fit, data.frame(lstat=c(5,10,15)), interval='confidence')

attach(Boston)
plot(lstat, medv)
abline(lm.fit, col=2) # fitted line

# residual plot
par(mfrow=c(1,3))
plot(predict(lm.fit), residuals(lm.fit))
abline(h=0)
plot(predict(lm.fit), rstandard(lm.fit))	# rstandard() : scale 보정한 residual
abline(h=0)
plot(hatvalues(lm.fit)) # leverage 찾기(hatvalues??)
identify(hatvalues(lm.fit))


##multiple regression
lm.fit <- lm(medv~lstat+age, data=Boston)
summary(lm.fit)
lm.fit <- lm(medv~., data=Boston)
summary(lm.fit)
summary(lm.fit)$sigma # sigma(epsilon의 표준편차)
library(car)
vif(lm.fit) # VIF > 10  => multicolinearity high!!

lm.fit1 <- update(lm.fit, ~.-age) # update()로 lm.fit에서 age 변수 제거
summary(lm.fit1)
summary(lm(medv~lstat*age))

# 2개의 모델 비교!!(lstat^2이 있는 모형과 없는 모형)
lm.fit <- lm(medv~lstat)
lm.fit2 <- lm(medv~lstat + I(lstat^2)) # I(x)는 I(x) 자체를 새로운 독립변수로 보게 하는 함수
	# 비교!!! (I() 있는 경우와 없는 경우)
	lm.fit2 <- lm(medv~lstat + I(lstat^2))
	summary(lm.fit2)
	lm.fit2 <- lm(medv~lstat + lstat^2)
	summary(lm.fit2)
anova(lm.fit, lm.fit2) # 2개의 모형 비교
lm.fit5 <- (lm(medv~poly(lstat, 5))) # poly()를 사용, 5차항까지 포함
summary(lm.fit5)


## quantative predictors
# usinng Carseats data
head(Carseats)
str(Carseats)
# interaction은 "*" or ":"으로 표현 가능
lm.fit <- lm(Sales~. + Income*Advertising + Price:Age, data=Carseats)
summary(lm.fit)
contrasts(Carseats$ShelveLoc) # dummy variable의 level (즉, Bad가 default)
