#### PCA
dim(USArrests)
head(USArrests)
## using prcomp function

pcfit <- prcomp(USArrests, scale=TRUE)
pcfit$rotation   ## PC loadings
pcfit$x   ##   PCs = data_c%*%pcfit$rotation  , (Make.Z(as.matrix(USArrests) )%*%pcfit$rotation )
pcfit$sdev ## square root of lambda
pve <- pcfit$sdev/sum(pcfit$sdev)*100
cumsum(pve)
biplot(pcfit, scale=0)
screeplot(pcfit, type='lines')

## using svd 

data_c <- scale(USArrests, center = TRUE, scale = TRUE)
pc_loading <- svd(cov(data_c))$u   ## PC loadings  
pc <- data_c %*% pc_loading   ## PC
lambda <- svd(cov(data_c))$d  ##square of sdev of prcomp


################### PCR####################################################

library(pls)
library(ISLR)
head(Hitters)
Hitters <- na.omit(Hitters)

set.seed(2)
pcr.fit <- pcr(Salary~., data=Hitters, scale=TRUE, validation="CV")
summary(pcr.fit)
 
which.min(MSEP(pcr.fit)$val[1,1,])  ## CV prediction ERROR according to number of of PC
validationplot(pcr.fit, val.type="MSEP")


set.seed(20)
train <- sample(c(TRUE, FALSE), nrow(Hitters), rep=T)
test <- (!train)
pcr.fit <- pcr(Salary~., data=Hitters, subset=train, scale=TRUE, validation="CV")
validationplot(pcr.fit, val.type="MSEP")
which.min(MSEP(pcr.fit)$val[1,1,])
x <- model.matrix(Salary~., Hitters)[,-1]
pcr.pred <- predict(pcr.fit, x[test,], ncomp=6)

y.test <- Hitters$Salary[test]
mean((pcr.pred-y.test)^2)