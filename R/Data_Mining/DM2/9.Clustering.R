############ ch9 . clustering


library(ISLR)
nci.labs <- NCI60$labs 
nci.data <- NCI60$data
table(nci.labs)

pr.out <- prcomp(nci.data, scale=TRUE)

# 그래프 색 지정위한 사용자 지정 함수 정의
Cols <- function(vec) {
  cols <- rainbow(length(unique(vec)))
  return(cols[as.numeric(as.factor(vec))]) 
}

par(mfrow=c(1,2))
plot(pr.out$x[,1:2], col=Cols(nci.labs), pch=19,  xlab="Z1", ylab="Z2")
plot(pr.out$x[,c(1,3)], col=Cols(nci.labs), pch=19, xlab="Z1", ylab="Z3")

## Hierachical clustering
par(mfrow=c(1,3))
data.dist <- dist(nci.data) # distance matrix
plot(hclust(data.dist), labels=nci.labs, main="Complete Linkage", xlab="", sub="", ylab="")
plot(hclust(data.dist, method="average"), labels=nci.labs, main="Average Linkage", xlab="", sub="", ylab="")
plot(hclust(data.dist, method="single"), labels=nci.labs, main="Single Linkage", xlab="", sub="", ylab="")

hc.out <- hclust(dist(nci.data))
hc.clusters <- cutree(hc.out,4) # 4개의 clusters로 쪼개기
table(hc.clusters,nci.labs)
rect.hclust(hc.out, k=4, border="red")  # 쪼개진 cluster 부분을 사각형으로 표시



## kmeans
set.seed (12)
km.out <- kmeans(nci.data, 4)
km.clusters <- km.out$cluster
km.clusters

 
## PCA -> clustering
hc.out <- hclust(dist(pr.out$x[,1:5]))
plot(hc.out, labels=nci.labs, main="Hier. Clust. on First  Five Score Vectors ")


## pam 
library(cluster)
pam_result <- pam(nci.data, 4)
pam_result$clustering
dim(pam_result$medoids)
table(pam_result$clustering, km.clusters)
