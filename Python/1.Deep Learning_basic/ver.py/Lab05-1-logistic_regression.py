# Lab 5 Logistic Regression Classifier
import tensorflow as tf
tf.set_random_seed(777)  # seed 지정

# 2개의 predictor
x_data = [[1, 2],
          [2, 3],
          [3, 1],
          [4, 3],
          [5, 3],
          [6, 2]]
# y = 0 or 1 (categorical var)
y_data = [[0],
          [0],
          [0],
          [1],
          [1],
          [1]]

# placeholder 변수(node) 생성
X = tf.placeholder(tf.float32, shape=[None, 2])     # nx2
Y = tf.placeholder(tf.float32, shape=[None, 1])     # nx1

W = tf.Variable(tf.random_normal([2, 1]), name='weight')    # 2x1
b = tf.Variable(tf.random_normal([1]), name='bias')

# logistic regression model(sigmoid fn) -> post.prob에 fit한 모형
# Hypothesis using sigmoid: tf.div(1., 1. + tf.exp(tf.matmul(X, W)))
# 즉, p_hat(y_hat) = 1 / (1 + exp(-(X %*% W)))
hypothesis = tf.sigmoid(tf.matmul(X, W) + b)

# cost/loss function => log P(Y=y|X=x) : log post.prob (logistic은 binary case이기 때문)
cost = -tf.reduce_mean(Y * tf.log(hypothesis) + (1 - Y) *
                       tf.log(1 - hypothesis))

# Minimize
train = tf.train.GradientDescentOptimizer(learning_rate=0.01).minimize(cost)

# Accuracy 계산 => tf.cast() : 값을 변형할 때 사용(조건(True:1, False:0) or 타입(소수점 버림) 등)
# post.prob > 0.5 => 1
# post.prob < 0.5 => 0
predicted = tf.cast(hypothesis > 0.5, dtype=tf.float32)
# predicted == Y (True)이면 1
# predicted != Y (False)이면 0
accuracy = tf.reduce_mean(tf.cast(tf.equal(predicted, Y), dtype=tf.float32))

# with 문으로 Session 만들고 with block 안에 있는 코드가 끝나면 자동으로 Session 닫아줌
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
0 1.73078
200 0.571512
400 0.507414
600 0.471824
800 0.447585
...
9200 0.159066
9400 0.15656
9600 0.154132
9800 0.151778
10000 0.149496

Hypothesis:  [[ 0.03074029]
 [ 0.15884677]
 [ 0.30486736]
 [ 0.78138196]
 [ 0.93957496]
 [ 0.98016882]]
Correct (Y):  [[ 0.]
 [ 0.]
 [ 0.]
 [ 1.]
 [ 1.]
 [ 1.]]
Accuracy:  1.0
'''
