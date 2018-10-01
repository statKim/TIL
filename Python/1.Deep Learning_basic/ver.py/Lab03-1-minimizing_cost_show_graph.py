# Lab 3 Minimizing Cost
import tensorflow as tf
import matplotlib.pyplot as plt

tf.set_random_seed(777)  # seed 지정

X = [1, 2, 3]
Y = [1, 2, 3]

# beta_hat
W = tf.placeholder(tf.float32)

# y_hat (intercept term 없다고 가정)
hypothesis = X * W

# cost/loss function (MSE)
cost = tf.reduce_mean(tf.square(hypothesis - Y))

# session 실행
sess = tf.Session()

# plotting할 변수 리스트로 만듬(나중에 append로 값 넣을것임)
W_history = []
cost_history = []

for i in range(-30, 50):
    curr_W = i * 0.1    # -3 ~ 5 사이의 값 (0.1의 간격); W(기울기)의 값을 지정!!
    curr_cost = sess.run(cost, feed_dict={W: curr_W})
    W_history.append(curr_W)
    cost_history.append(curr_cost)

# cost function을 그래프로 표현 (W의 값에 따른 cost의 변화)
plt.plot(W_history, cost_history)
plt.show()