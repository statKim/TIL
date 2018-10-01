# placeholder 사용
import tensorflow as tf
tf.set_random_seed(777)  

# training data
x_train = [1, 2, 3]
y_train = [1, 2, 3]

# initial value를 standard normal dist에서 하나씩 뽑음
W = tf.Variable(tf.random_normal([1]), name='weight')
b = tf.Variable(tf.random_normal([1]), name='bias')

# placeholder를 이용하여 나중에 feed_dict를 이용하여 data 입력할 것임!!
# 참고 : http://stackoverflow.com/questions/36693740/
X = tf.placeholder(tf.float32, shape=[None])
Y = tf.placeholder(tf.float32, shape=[None])

# y_hat
hypothesis = X * W + b

# cost/loss function(mse)
cost = tf.reduce_mean(tf.square(hypothesis - Y))

# Minimize(Gradient Descent)
optimizer = tf.train.GradientDescentOptimizer(learning_rate=0.01)
train = optimizer.minimize(cost)

# Session 실행
sess = tf.Session()
# tf variable 초기화
sess.run(tf.global_variables_initializer())

# Fit
for step in range(2001):
    # 코드 한 줄이 너무 길어질 때 "\"(역슬래시)를 하고 다음 줄에 계속 쓸 수 있음!!
    # sess.run()을 한 결과를 각각 cost_val, W_val, b_val, _ 에 저장!!('_'변수는 그닥 중요하지 않아서 이런 이름의 변수명 사용)
    cost_val, W_val, b_val, _ = \
        sess.run([cost, W, b, train],
                 feed_dict={X: x_train, Y: y_train})    # feed_dict로 placeholder 변수에 training data 넣어줌!!
    if step % 20 == 0:
        print(step, cost_val, W_val, b_val)

# Learns best fit W:[ 1.],  b:[ 0]
'''
...
1980 1.32962e-05 [ 1.00423515] [-0.00962736]
2000 1.20761e-05 [ 1.00403607] [-0.00917497]
'''

# predict
print(sess.run(hypothesis, feed_dict={X: [5]}))
print(sess.run(hypothesis, feed_dict={X: [2.5]}))
print(sess.run(hypothesis, feed_dict={X: [1.5, 3.5]}))  # 2개의 value로 predict => 2개의 predict 결과 나옴!!!

'''
[ 5.0110054]
[ 2.50091505]
[ 1.49687922  3.50495124]
'''


# 새로운 데이터로 fit
for step in range(2001):
    cost_val, W_val, b_val, _ = \
        sess.run([cost, W, b, train],
                 feed_dict={X: [1, 2, 3, 4, 5],
                            Y: [2.1, 3.1, 4.1, 5.1, 6.1]})
    if step % 20 == 0:
        print(step, cost_val, W_val, b_val)

# predict
print(sess.run(hypothesis, feed_dict={X: [5]}))
print(sess.run(hypothesis, feed_dict={X: [2.5]}))
print(sess.run(hypothesis, feed_dict={X: [1.5, 3.5]}))

'''
1960 3.32396e-07 [ 1.00037301] [ 1.09865296]
1980 2.90429e-07 [ 1.00034881] [ 1.09874094]
2000 2.5373e-07 [ 1.00032604] [ 1.09882331]
[ 6.10045338]
[ 3.59963846]
[ 2.59931231  4.59996414]
'''