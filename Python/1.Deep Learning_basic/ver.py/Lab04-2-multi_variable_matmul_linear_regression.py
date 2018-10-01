# Using matrix - 앞에서 한 것과 같은 결과
import tensorflow as tf
tf.set_random_seed(777)

# 5x3 matrix
x_data = [[73., 80., 75.],
          [93., 88., 93.],
          [89., 91., 90.],
          [96., 98., 100.],
          [73., 66., 70.]]
# 5x1 vector(matrix)
y_data = [[152.],
          [185.],
          [180.],
          [196.],
          [142.]]


# placeholder 변수 생성
X = tf.placeholder(tf.float32, shape=[None, 3])     # n x 3 matrix (None : 개수가 정해져있지 않다는 뜻; 데이터의 수)
Y = tf.placeholder(tf.float32, shape=[None, 1])

# initial value 지정
W = tf.Variable(tf.random_normal([3, 1]), name='weight')    # weight 3개가 필요!! (3x1)
b = tf.Variable(tf.random_normal([1]), name='bias')

# regression model
hypothesis = tf.matmul(X, W) + b    # tf.matmul(X, W) : 행렬곱(X %*% W) - matrix multiply

# cost/loss function (MSE) - matrix form
cost = tf.reduce_mean(tf.square(hypothesis - Y))

# Minimize
optimizer = tf.train.GradientDescentOptimizer(learning_rate=1e-5)
train = optimizer.minimize(cost)

# Session 생성
sess = tf.Session()
# 변수 초기화
sess.run(tf.global_variables_initializer())

for step in range(2001):
    cost_val, hy_val, _ = sess.run(
        [cost, hypothesis, train], feed_dict={X: x_data, Y: y_data})
    if step % 10 == 0:
        print(step, "Cost: ", cost_val, "\nPrediction:\n", hy_val)

'''
0 Cost:  7105.46
Prediction:
 [[ 80.82241058]
 [ 92.26364136]
 [ 93.70250702]
 [ 98.09217834]
 [ 72.51759338]]
10 Cost:  5.89726
Prediction:
 [[ 155.35159302]
 [ 181.85691833]
 [ 181.97254944]
 [ 194.21760559]
 [ 140.85707092]]
...
1990 Cost:  3.18588
Prediction:
 [[ 154.36352539]
 [ 182.94833374]
 [ 181.85189819]
 [ 194.35585022]
 [ 142.03240967]]
2000 Cost:  3.1781
Prediction:
 [[ 154.35881042]
 [ 182.95147705]
 [ 181.85035706]
 [ 194.35533142]
 [ 142.036026  ]]
'''