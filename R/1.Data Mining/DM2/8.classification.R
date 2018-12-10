############ ch8 . classification


library(titanic)

data(titanic_train)

## Missing values imputation(결측값 임의로 지정 => 단순히 예제를 돌려보기 위함)
titanic_train$Embarked[titanic_train$Embarked==""] <- "S"
titanic_train$Age[is.na(titanic_train$Age)] <- median(titanic_train$Age, na.rm=T)

titanic_data <- titanic_train[, -which(names(titanic_train) %in% c('Name', 'Ticket','Cabin','PassengerId'))]

for (i in c("Survived","Pclass","Sex","Embarked")) {
  titanic_data[,i] <- as.factor(titanic_data[,i])
}

train <- titanic_data[1:667,]
test <- titanic_data[668:891,]


## Logistic Regression
start.time <- Sys.time()  # 분석 돌리는데 걸리는 시간 출력하기 위해
LRegression <- glm(formula=Survived~., family=binomial, data=train) # logistic regression
LRegression_pred <- predict(LRegression, type='response', newdata=test) # post.prob
LRegression_pred <- ifelse(LRegression_pred > 0.5, 1, 0)
end.time <- Sys.time()
time.takenLR <- end.time - start.time
time.takenLR
summary(LRegression)
table(LRegression_pred, test$Survived)  # confusion matrix


## Linear SVM
library(e1071)
start.time <- Sys.time()
SVM <- svm(formula=as.factor(Survived)~., data=train, kernel='linear') 
SVM_pred <- predict(SVM, newdata=test)
end.time <- Sys.time()
time.takenSVM <- end.time - start.time
time.takenSVM
table(LRegression_pred, test$Survived)


## KNN
library(class)
training_set_cleanKNN <- as.data.frame(train)
validation_set_cleanKNN <- as.data.frame(test)
training_set_cleanKNN$Sex <- sapply(as.character(training_set_cleanKNN$Sex), switch, 'male'=0, 'female'=1)
validation_set_cleanKNN$Sex <- sapply(as.character(validation_set_cleanKNN$Sex), switch, 'male'=0, 'female'=1)
training_set_cleanKNN$Embarked <- sapply(as.character(training_set_cleanKNN$Embarked), switch, 'C'=0, 'Q'=1, 'S'=2)
validation_set_cleanKNN$Embarked <- sapply(as.character(validation_set_cleanKNN$Embarked), switch, 'C'=0, 'Q'=1, 'S'=2)
# set integeres as factors
training_set_cleanKNN$Sex <- as.factor(training_set_cleanKNN$Sex)
validation_set_cleanKNN$Sex <- as.factor(validation_set_cleanKNN$Sex)
training_set_cleanKNN$Embarked <- as.factor(training_set_cleanKNN$Embarked)
validation_set_cleanKNN$Embarked <- as.factor(validation_set_cleanKNN$Embarked)


start.time <- Sys.time()
library(caret)
trControl <- trainControl(method="cv", number=10)
cv.fit <- train(Survived ~ ., method="knn", tuneGrid=expand.grid(k=1:10), trControl=trControl,
                metric="Accuracy",  data=training_set_cleanKNN)
cv.fit
KNN_pred <- knn(train=training_set_cleanKNN[, -1], test=validation_set_cleanKNN[, -1],
                cl=training_set_cleanKNN[, 1], k=8, prob=TRUE)
end.time <- Sys.time()
time.takenKNN <- end.time - start.time
time.takenKNN
table(KNN_pred, test$Survived)
