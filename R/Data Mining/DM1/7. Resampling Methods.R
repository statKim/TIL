####################################
### Chapter 7. Resampling Methods
####################################

## Non-parametric Bootstrap
library(boot)
# confidence intervals for the city data
ratio <- function(d, w) sum(d$x * w)/sum(d$u * w)
city.boot <- boot(city, ratio, R = 999, stype = "w", sim = "ordinary")
boot.ci(city.boot, conf = c(0.90, 0.95),
        type = c("norm", "basic", "perc", "bca"))

# Nonparametric confidence intervals for mean failure time 
# of the air-conditioning data as in Example 5.4 of Davison
# and Hinkley (1997)
mean.fun <- function(d, i) 
{    m <- mean(d$hours[i])
     n <- length(i)
     v <- (n-1)*var(d$hours[i])/n^2
     c(m, v)
}
air.boot <- boot(aircondit, mean.fun, R = 999)
boot.ci(air.boot, type = c("norm", "basic", "perc", "stud"))


library(ISLR)
library(boot)
alpha.fn=function(data,index){
 X=data$X[index]
 Y=data$Y[index]
 return((var(Y)-cov(X,Y))/(var(X)+var(Y)-2*cov(X,Y)))
 }
alpha.fn(Portfolio,1:100)
set.seed(1)
alpha.fn(Portfolio,sample(100,100,replace=T))
boot(Portfolio,alpha.fn,R=1000)

## Parametric Bootstrap
library(mclust)
n<-100
x<-rnorm(n)
B<-1000
mu_mle<-mean(x)
s_mle<-sqrt(((n-1)/n)*var(x))
Cloglik<-numeric(B)
loglik_data<-2*(Mclust(x,2)$loglik-Mclust(x,1)$loglik)
for (i in 1:B){
	xb<-rnorm(n,mean=mu_mle,s=s_mle)
	Cloglik[i]<-2*(Mclust(xb,2)$loglik-Mclust(xb,1)$loglik)
}

sum(Cloglik>=loglik_data)/(B+1)

pro<-c(0.3,0.7)
mu<-c(-1,1)
s<-c(0.5,0.5)
z<-sample(1:2,n,replace=T,prob=pro)
x<-rnorm(n,mean=mu[z],sd=s[z])

B<-1000
mu_mle<-mean(x)
s_mle<-sqrt(((n-1)/n)*var(x))
Cloglik<-numeric(B)
loglik_data<-2*(Mclust(x,2)$loglik-Mclust(x,1)$loglik)
for (i in 1:B){
	xb<-rnorm(n,mean=mu_mle,s=s_mle)
	Cloglik[i]<-2*(Mclust(xb,2)$loglik-Mclust(xb,1)$loglik)
}

sum(Cloglik>=loglik_data)/(B+1)

