########################################################### 
## PCA (Principal Component Analysis) 
## User Defined Function 
## - finding PC k which Cumulative Proportion is over 0.9 
###########################################################
pca <- function(dataset){ 
  pc = prcomp(dataset, scale = TRUE) 
  
  k = 0 
  R = 0 
  
  while(R < 0.9) { 
  k = k + 1 
  R = sum(pc[[1]][1:k]^2)/sum(pc[[1]]^2) 
  
  cat("When number of Principal Component(k) is ", k, 
  ", Cumulative Proportion(R) is ", R, "\n", "\n", sep="") 
  } 
  
  SelectedDataSet = pc[[5]][,1:k] 
  return(SelectedDataSet) 
 } 
  
 pca(data) 
