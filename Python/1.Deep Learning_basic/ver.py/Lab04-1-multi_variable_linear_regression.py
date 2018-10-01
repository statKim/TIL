# Lab 4 Multi-variable linear regression
import tensorflow as tf
tf.set_random_seed(777)  # seed 지정

# 독립변수 3개, 종속변수 1개
x1_data = [73., 93., 89., 96., 73.]
x2_data = [80., 88., 91., 98., 66.]
x3_data = [75., 93., 90., 100., 70.]

y_data = [152., 185., 180., 196., 142.]

# placeholder 변수 생성
x1 = tf.placeholder(tf.float32)
x2 = tf.placeholder(tf.float32)
x3 = tf.placeholder(tf.float32)

Y = tf.placeholder(tf.float32)

# weight, bias initial value 지정
w1 = tf.Variable(tf.random_normal([1]), name='weight1')
w2 = tf.Variable(tf.random_normal([1]), name='weight2')
w3 = tf.Variable(tf.random_normal([1]), name='weight3')
b = tf.Variable(tf.random_normal([1]), name='bias')

# regression model(y_hat)
hypothesis = x1 * w1 + x2 * w2 + x3 * w3 + b
print(hypothesis) # 출력결과 : Tensor("add_2:0", dtype=float32)

# cost/loss function (MSE)
cost = tf.reduce_mean(tf.square(hypothesis - Y))

# Optimization(Minimize) => 아주 작은 learning rate 사용!!
optimizer = tf.train.GradientDescentOptimizer(learning_rate=1e-5)   # 1e-5 : 0.00001
train = optimizer.minimize(cost)

# Session 생성
sess = tf.Session()
# global variable 초기화
sess.run(tf.global_variables_initializer())

# 2001번 반복
for step in range(2001):
    cost_val, hy_val, _ = sess.run([cost, hypothesis, train],
                                   feed_dict={x1: x1_data, x2: x2_data, x3: x3_data, Y: y_data})
    if step % 10 == 0:  # 10번에 한 번씩 출력
        print(step, "Cost: ", cost_val, "\nPrediction:\n", hy_val)

'''
0 Cost:  19614.8
Prediction:
 [ 21.69748688  39.10213089  31.82624626  35.14236832  32.55316544]
10 Cost:  14.0682
Prediction:
 [ 145.56100464  187.94958496  178.50236511  194.86721802  146.08096313]
 ...
1990 Cost:  4.9197
Prediction:
 [ 148.15084839  186.88632202  179.6293335   195.81796265  144.46044922]
2000 Cost:  4.89449
Prediction:
 [ 148.15931702  186.8805542   179.63194275  195.81971741  144.45298767]
'''