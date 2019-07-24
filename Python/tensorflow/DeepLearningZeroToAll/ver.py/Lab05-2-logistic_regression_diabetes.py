# Lab 5 Logistic Regression Classifier
import tensorflow as tf
import numpy as np
tf.set_random_seed(777)  # seed 지정

# 데이터 read
xy = np.loadtxt('data-03-diabetes.csv', delimiter=',', dtype=np.float32)
x_data = xy[:, 0:-1]    # predictor
y_data = xy[:, [-1]]    # response

print(x_data.shape, y_data.shape)   # (759, 8) (759, 1)

# placeholder 변수 지정
X = tf.placeholder(tf.float32, shape=[None, 8])
Y = tf.placeholder(tf.float32, shape=[None, 1])

W = tf.Variable(tf.random_normal([8, 1]), name='weight')
b = tf.Variable(tf.random_normal([1]), name='bias')

# logistic regression model(post.prob에 modeling)
hypothesis = tf.sigmoid(tf.matmul(X, W) + b)

# cost/loss function
cost = -tf.reduce_mean(Y * tf.log(hypothesis) + (1 - Y) *
                       tf.log(1 - hypothesis))

# Minimize
train = tf.train.GradientDescentOptimizer(learning_rate=0.01).minimize(cost)

# Accuracy 계산
# post.prob > 0.5 => 1
# post.prob < 0.5 => 0
predicted = tf.cast(hypothesis > 0.5, dtype=tf.float32)
# predicted == Y (True)이면 1
# predicted != Y (False)이면 0
accuracy = tf.reduce_mean(tf.cast(tf.equal(predicted, Y), dtype=tf.float32))

# Session 만들고 실행
with tf.Session() as sess:
    # 변수 초기화
    sess.run(tf.global_variables_initializer())

    for step in range(10001):
        cost_val, _ = sess.run([cost, train], feed_dict={X: x_data, Y: y_data})
        if step % 200 == 0:
            print(step, cost_val)

    # training된 model로 predict, accuracy 계산
    h, c, a = sess.run([hypothesis, predicted, accuracy],
                       feed_dict={X: x_data, Y: y_data})
    print("\nHypothesis: ", h, "\nCorrect (Y): ", c, "\nAccuracy: ", a)

'''
0 0.82794
200 0.755181
400 0.726355
600 0.705179
800 0.686631
...
9600 0.492056
9800 0.491396
10000 0.490767

...

 [ 1.]
 [ 1.]
 [ 1.]]
Accuracy:  0.762846
'''
