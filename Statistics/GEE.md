## Generalized Estimating Equations (GEE)



- GLM으로 다루기 어려운 **repeated measured data**를 다룰 수 있는 분석방법 (Liang &  Zeger, 1986)
- Independence 가정이 있는 GLM에서 non-independence (or clustered)인 경우를 허용 (반복 측정된 데이터이기 때문에 observation 간에 correlation이 존재)
  - non-independence를 허용한 경우 2가지 방법이 존재
    - GLMM (Generalized Linear Mixed Model)
    - GEE (Generalized Estimating Equations)
- Generalized linear *marginal* model



#### Marginal model vs Conditional model

> Linear mixed model formula
> $$
> y = X\beta + Zu + e
> $$
> where $ Var(e) = \sigma^2I $, $Var(u)=G$.

- ##### Conditional model 

  - Get the marginal distribution to the conditional distribution $y|u$.

  $$
  y|u \sim N(X\beta+Zu, \sigma^2I) \text{ (conditional distribution)}\\
  y \sim N(X\beta, ZGZ^T+\sigma^2I) \text{ (marginal distribution)}
  $$

  - The covariance structure of $y$ : $V=ZGZ^T+\sigma^2I$

- ##### Marginal model

  - Directly construct the model, 
    $$
    y \sim (X\beta, V)
    $$
    by specifying directly a structure on $V$.





#### GLMM vs GEE (Binary response case)

- ##### GLMM

  - ###### subject-specific model (conditional model)

  $$
  \log \big( \frac{P(Y_{ij}=1)}{P(Y_{ij}=0)} | x_{ij},b_i \big) = \beta_0 + \beta_1 x_{ij} + b_i\\
  \text{where } b_i \text{ is the random component}
  $$

  - $\beta_1$에 대한 해석 : $x$가 1 단위 증가하면, 다른 random component가 고정되었을 때, *평균적으로*  $\log OR$이 $\beta_1$만큼 증가한다.
  - Ex) a 1 unit increase in BMI is associated with a Z-unit average increase in blood pressure, holding each random effect for individual constant.

- ##### GEE

  - ###### population-average model (marginal model)

  $$
  \log \big( \frac{P(Y_{ij}=1)}{P(Y_{ij}=0)} | x_{ij},b_i \big) = \beta_0 + \beta_1 x_{ij}
  $$
  
  - $\beta_1$에 대한 해석 : $x$가 1 단위 증가하면, *평균적으로* $\log OR$이 $\beta_1$만큼 증가한다.
  - Ex) a 1 unit increase in BMI is associated with a Z-unit average increase in blood pressure.


![Difference of GLMM vs GEE](https://i.stack.imgur.com/elkIH.png)



#### Reference

- [The difference of GEE and GLMM](https://stats.stackexchange.com/questions/17331/what-is-the-difference-between-generalized-estimating-equations-and-glmm)

- [Difference between GLM and GLMM](https://stats.stackexchange.com/questions/32419/difference-between-generalized-linear-models-generalized-linear-mixed-models)

- [GEE vs GLM vs GLMM](http://blog.naver.com/PostView.nhn?blogId=jae_won8716&logNo=220836076705&parentCategoryNo=&categoryNo=40&viewDate=&isShowPopularPosts=true&from=search)

- [Generalized Estimating Equations (gee) for glm–type data](http://staff.pubhealth.ku.dk/~pd/mixed-jan.2006/R-mixed-geeglm-Lecture.pdf)