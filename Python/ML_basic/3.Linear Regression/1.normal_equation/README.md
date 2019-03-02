# Normal equation을 이용하여 Linear Regression solution 구하기



## Linear regression fit하는 함수

- 내가 짠 코드

```python
def fit(self, X, y):
    from numpy.linalg import inv
    if self.fit_intercept == True:
        self._new_X = np.hstack((np.ones(X.shape[0]).reshape(-1,1), X))
        beta_hat = inv(self._new_X.T.dot(self._new_X)).dot(self._new_X.T).dot(y)
        self._intercept = beta_hat[0]
        self._coef = beta_hat[1:]
    elif self.fit_intercept == False:
        self._new_X = X
        self._coef = inv(self._new_X.T.dot(self._new_X)).dot(self._new_X.T).dot(y)
    return self
```

- 정답 코드

```python
def fit(self, X, y):
    self._new_X = np.array(X)
    y = y.reshape(-1,1)

    if self.fit_intercept:
        intercept_vector = np.ones([len(self._new_X), 1])
        self._new_X = np.concatenate(
                        (intercept_vector, self._new_X), axis=1)

    weights = np.linalg.inv(
                self._new_X.T.dot(self._new_X)).dot(self._new_X.T.dot(y)).flatten()

    if self.fit_intercept:
        self._intercept = weights[0]
        self._coef = weights[1:]
    else:
        self._coef = weights
```



## Predict 함수

- 내가 짠 코드

```python
def predict(self, X):
    self._mu_X = X.mean(axis=0)
    self._std_X = X.std(axis=0)

    if self.normalize == True:
        X = (X - self._mu_X) / self._std_X        

    if self.fit_intercept == True:
        X = np.hstack((np.ones(X.shape[0]).reshape(-1,1), X))

    beta_hat = np.hstack((self._intercept, self._coef))
    y = X.dot(beta_hat)
    return y
```

- 정답 코드

```python
def predict(self, X): 
    test_X = np.array(X)

    if self.fit_intercept:
        intercept_vector = np.ones([len(self._new_X), 1])
        test_X = np.concatenate(
                    (intercept_vector, self._new_X), axis=1)

        weights = np.concatenate(([self._intercept], self._coef), axis=0)
    else:
        weights = self._coef
    return test_X.dot(weights)   
```

