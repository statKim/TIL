import tensorflow as tf

tf.set_random_seed(777)

# training set
X = [1, 2, 3]
Y = [1, 2, 3]

# 잘못된 weight 값을 initial value로 지정
W = tf.Variable(5.0)

# Linear regression model(y_hat) without intercept term
hypothesis = X * W

# cost/loss function(MSE)
cost = tf.reduce_mean(tf.square(hypothesis - Y))

# Minimize: Gradient Descent(tf 내장 함수)
optimizer = tf.train.GradientDescentOptimizer(learning_rate=0.1)
train = optimizer.minimize(cost)

# Session 객체 생성
sess = tf.Session()
# tf 변수 초기화
sess.run(tf.global_variables_initializer())

# 100번 최적화시킴
for step in range(100):
    print(step, sess.run(W))
    sess.run(train)     # 0.1의 learning rate으로 다시 optimize 해줌

'''
0 5.0
1 1.26667
2 1.01778
3 1.00119
4 1.00008
...
96 1.0
97 1.0
98 1.0
99 1.0
'''

### 참고 
## 최적화할 때 횟수에 따른 W의 변화 plot
# step_list = []
# W_list = []
# 
# # 100번 최적화시킴
# for step in range(100):
#     step_list.append(step)
#     W_list.append(sess.run(W))
#     #print(step, sess.run(W))
#     sess.run(train)     # 0.1의 learning rate으로 다시 optimize 해줌
# 
# import matplotlib.pyplot as plt
# plt.plot(step_list, W_list)
# plt.show()