# "data-04-zoo.csv"를 이용하여 softmax classifier 만들기
import tensorflow as tf
import numpy as np
tf.set_random_seed(777)  # seed 지정

# Predicting animal type based on various features
xy = np.loadtxt('data-04-zoo.csv', delimiter=',', dtype=np.float32)
x_data = xy[:, 0:-1]
y_data = xy[:, [-1]]

print(x_data.shape, y_data.shape)   # (101, 16) (101, 1)

nb_classes = 7  # class 개수(0 ~ 6)

X = tf.placeholder(tf.float32, [None, 16])  # predictor 16개
Y = tf.placeholder(tf.int32, [None, 1])  # 0 ~ 6

# one hot 이용하여 Y 변수 바꿔주기
Y_one_hot = tf.one_hot(Y, nb_classes)  # shape=(?, 1, 7) : tf.one_hot()의 경우 rank가 N인 데이터를 N+1로 바꿔버림
print("one_hot", Y_one_hot)     # one_hot Tensor("one_hot:0", shape=(?, 1, 7), dtype=float32)
Y_one_hot = tf.reshape(Y_one_hot, [-1, nb_classes])     # shape=(?, 7) : tf.reshape()로 우리가 원하는 shape으로 바꿔줌
print("reshape", Y_one_hot)     # reshape Tensor("Reshape:0", shape=(?, 7), dtype=float32)

W = tf.Variable(tf.random_normal([16, nb_classes]), name='weight')
b = tf.Variable(tf.random_normal([nb_classes]), name='bias')

# tf.nn.softmax computes softmax activations
# softmax = exp(logits) / reduce_sum(exp(logits), dim)
logits = tf.matmul(X, W) + b
hypothesis = tf.nn.softmax(logits)

# Cross entropy cost/loss
cost_i = tf.nn.softmax_cross_entropy_with_logits(logits=logits,
                                                 labels=Y_one_hot)
#print("cost_i : ", cost_i.shape)   # (?,) : 즉, vector형태
cost = tf.reduce_mean(cost_i)   # 따라서 cost_i의 mean이 최종 cost!!
optimizer = tf.train.GradientDescentOptimizer(learning_rate=0.1).minimize(cost)

prediction = tf.argmax(hypothesis, 1)   # hypothesis를 행 기준으로 max 값의 index(class)를 구한다
correct_prediction = tf.equal(prediction, tf.argmax(Y_one_hot, 1))
accuracy = tf.reduce_mean(tf.cast(correct_prediction, tf.float32))  # accuracy 계산

# Session 실행
with tf.Session() as sess:
    sess.run(tf.global_variables_initializer())

    for step in range(2000):
        sess.run(optimizer, feed_dict={X: x_data, Y: y_data})
        if step % 100 == 0:
            loss, acc = sess.run([cost, accuracy], feed_dict={X: x_data, Y: y_data})
            print("Step: {:5}\tLoss: {:.3f}\tAcc: {:.2%}".format(step, loss, acc))

    # predict
    pred = sess.run(prediction, feed_dict={X: x_data})
    # y_data: (N,1) = flatten => (N, ) matches pred.shape
    # 즉, flatten() : [[1,2],[3,4]] => [1,2,3,4] 로 바꿔줌(차원 하나 낮춰줌)!!
    # but 그냥 list는 안되고 ndarray(numpy)는 가능
    # zip() : 각 대응되는 원소 하나씩 묶어서 리스트로 만들어줌
    # 즉, zip([1,2,3],[4,5,6]) => [(1,4),(2,5),(3,6)]
    for p, y in zip(pred, y_data.flatten()):
        print("[{}] Prediction: {} True Y: {}".format(p == int(p), p, int(y)))

'''
Step:     0 Loss: 5.106 Acc: 37.62%
Step:   100 Loss: 0.800 Acc: 79.21%
Step:   200 Loss: 0.486 Acc: 88.12%
Step:   300 Loss: 0.349 Acc: 90.10%
Step:   400 Loss: 0.272 Acc: 94.06%
Step:   500 Loss: 0.222 Acc: 95.05%
Step:   600 Loss: 0.187 Acc: 97.03%
Step:   700 Loss: 0.161 Acc: 97.03%
Step:   800 Loss: 0.140 Acc: 97.03%
Step:   900 Loss: 0.124 Acc: 97.03%
Step:  1000 Loss: 0.111 Acc: 97.03%
Step:  1100 Loss: 0.101 Acc: 99.01%
Step:  1200 Loss: 0.092 Acc: 100.00%
Step:  1300 Loss: 0.084 Acc: 100.00%
...
[True] Prediction: 0 True Y: 0
[True] Prediction: 0 True Y: 0
[True] Prediction: 3 True Y: 3
[True] Prediction: 0 True Y: 0
[True] Prediction: 0 True Y: 0
[True] Prediction: 0 True Y: 0
[True] Prediction: 0 True Y: 0
[True] Prediction: 3 True Y: 3
[True] Prediction: 3 True Y: 3
[True] Prediction: 0 True Y: 0
'''
