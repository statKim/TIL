import tensorflow as tf

tf.set_random_seed(777)  # for reproducibility

x_data = [1, 2, 3]
y_data = [1, 2, 3]

# W의 initial value 지정
W = tf.Variable(tf.random_normal([1]), name='weight')

# training 변수 지정(placeholder)
X = tf.placeholder(tf.float32)
Y = tf.placeholder(tf.float32)

# 기울기 없는 regression model 가정
hypothesis = X * W

# cost/loss function (MSE)
cost = tf.reduce_mean(tf.square(hypothesis - Y))

# Gradient Descent 알고리즘을 이용하여 minimize하는 방법!!!
# => 앞서 써왔던 tensorflow 기본 내장 optimize 함수를 풀어쓴 것임!!
# Minimize: Gradient Descent using derivative: W -= learning_rate * derivative
learning_rate = 0.1
gradient = tf.reduce_mean((W * X - Y) * X)
descent = W - learning_rate * gradient
update = W.assign(descent)  # 새로 계산된 descent를 W 변수에 저장하고(assign)하고 이 과정을 update 객체에 저장


sess = tf.Session()
sess.run(tf.global_variables_initializer())

for step in range(21):
    sess.run(update, feed_dict={X: x_data, Y: y_data})  # update 객체(tf graph)를 실행하면 전 과정들이 모두 실행됨
    print(step, sess.run(cost, feed_dict={X: x_data, Y: y_data}), sess.run(W)) 
    # sess.run(W)는 바로 위에서 initialize를 했기 때문에 맨 처음에 저장한 값이 아닌 fitting된 값의 W(weight)가 출력됨

'''
0 1.93919 [ 1.64462376]
1 0.551591 [ 1.34379935]
2 0.156897 [ 1.18335962]
3 0.0446285 [ 1.09779179]
4 0.0126943 [ 1.05215561]
5 0.00361082 [ 1.0278163]
6 0.00102708 [ 1.01483536]
7 0.000292144 [ 1.00791216]
8 8.30968e-05 [ 1.00421977]
9 2.36361e-05 [ 1.00225055]
10 6.72385e-06 [ 1.00120032]
11 1.91239e-06 [ 1.00064015]
12 5.43968e-07 [ 1.00034142]
13 1.54591e-07 [ 1.00018203]
14 4.39416e-08 [ 1.00009704]
15 1.24913e-08 [ 1.00005174]
16 3.5322e-09 [ 1.00002754]
17 9.99824e-10 [ 1.00001466]
18 2.88878e-10 [ 1.00000787]
19 8.02487e-11 [ 1.00000417]
20 2.34053e-11 [ 1.00000226]
'''