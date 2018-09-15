# weight의 Initial value 정하는 방법
### RBM (Restricted Boltzmann Machine)

- Forward(Encoder)
- Backward(Decoder)
- 2개 layer에서만 왔다갔다하면서 최적 weight 만들고 다음 layer로 넘어감
  => 이를 통해 최적 initial value 찾음 (Fine Tuning)
- but 굳이 RBM 쓸 필요 x
  => 그냥 간단한 초기값 써도 됨!!

prettytensor implementation



### Algorithms 종류

> Batch normalization
>
> Layer sequential uniform variance
>
> ...



## dropout & ensemble

- 하는 이유 : overfitting..
   => regularization!!! or Dropout
- Dropout : 복잡한 nn에서 랜덤하게 node(neuron) 몇 개를 없애버림(weight=0으로 만듬)
  (activation fn=0으로 해줌)
  즉, 몇개의 node로 training 시키고 전체 변수(node)로 예측!!

- Ensemble
  독립적인 nn 여러개를 ensemble하고 나온 output들의 평균 or 다수결



### how to build network module(쌓는 방법에 따른 nn 종류)

- Feedforward neural network
   그동안 해온 nn
- Fast forward
   중간의 layer 건너뛰어서 하는 방법
- split & merge (Convlolutional neural network(CNN))
   1개의 layer에서 2개 이상의 layer로 나눠져서 가다가 나중에 다시 하나의 layer로 합쳐지고 하는 것
- Recurrent neural network(RNN)
   앞으로만 가는 것이 아니라 옆으로도 나가는 것



Relu

xavier initializator tensorflow

xavier는 초기값 설정하는 방법

(이전에는 normal dist에서 난수 뽑음)



단순히 layer만 깊게 하면 overfitting함

=> dropout!!!

tf.nn.dropout() 옵션 중 keep_prob : 몇퍼의 node만 training할지

나중에 test할 때는 keep_prob를 반드시 1로 해줘야함!!!



optimizers



Softmax VS Neural Networks for MNIST, 90% and 94.5%

Xavier initialization : 97.8%

Deep Neural Networks with Dropout : 98%

Adam and other optimizers

Batch Normalization