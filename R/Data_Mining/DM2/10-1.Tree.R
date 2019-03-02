############################################################
######################## Tree based method ################
############################################################

#################### 1 . classification ################

library(tree)
library(ISLR)
attach(Carseats)
High <- ifelse(Sales<=8,"No","Yes")
Carseats <- data.frame(Carseats, High)
head(Carseats)

tree.carseats <- tree(High~.-Sales, Carseats, split='gini') ## default : deviance (entropy)
summary(tree.carseats)
plot(tree.carseats )
text(tree.carseats, pretty=0)   ## LEFT : Bad, Medium   vs RIGHT  :GOOD
tree.carseats
#length(High[ShelveLoc!='Good'])   # Num of Bad or Medium = 315  
#prop.table(table(High[ShelveLoc!='Good']))  # No >Yes


set.seed(2)
train <- sample(1:nrow(Carseats), 200)
Carseats.test <- Carseats[-train ,]
High.test <- High[-train]
tree.carseats <- tree(High~.-Sales, Carseats, subset=train)
tree.pred <- predict(tree.carseats, Carseats.test, type="class")
table(tree.pred, High.test)
sum(diag(table(tree.pred, High.test))) / length(High.test)



## pruing

set.seed(3)
cv.carseats <- cv.tree(tree.carseats, FUN=prune.misclass) ## Fun can be deviance 
cv.carseats
prune.carseats <- prune.misclass(tree.carseats, best=cv.carseats$size[which.min(cv.carseats$dev)])
plot(prune.carseats)
text(prune.carseats, pretty=0)
tree.pred <- predict(prune.carseats, Carseats.test, type="class")
table(tree.pred, High.test)
sum(diag(table(tree.pred, High.test))) / length(High.test)



#################### 2 . regression ################

library(MASS)
set.seed(1)
train <- sample(1:nrow(Boston), nrow(Boston)/2)
tree.boston <- tree(medv~., Boston, subset=train) ## split defalut is deviance (= RSS)
summary(tree.boston)
plot(tree.boston)
text(tree.boston, pretty=0)

cv.boston <- cv.tree(tree.boston)
plot(cv.boston$size, cv.boston$dev, type='b')

prune.boston <- prune.tree(tree.boston, best=7)
plot(prune.boston)
text(prune.boston, pretty=0)
 
 
yhat <- predict(tree.boston, newdata=Boston[-train,])
boston.test <- Boston[-train, "medv"]
plot(yhat, boston.test)
abline(0,1)
mean((yhat-boston.test)^2)
