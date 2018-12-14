# LaTeX Syntax

-  [**참고사이트**](https://en.wikipedia.org/wiki/Help:Displaying_a_formula#Formatting_using_TeX)



## 1. Alphabets

### 1.1 Greek Alphabets

- $$\Gamma \ \Delta \ \Sigma \ \Theta \ \Phi \ \Psi \ \Omega$$ : `\Gamma \Delta \Sigma \Theta \Phi \Psi \Omega` 

- $$ \alpha \ \beta \ \gamma \ \delta \ \epsilon \ \rho \ \mu \ \sigma $$ : `\alpha \beta \gamma \eplilon \rho \mu \sigma`



### 1.2 Bold

- $$ \mathbb{ABCDEF} $$ : `\mathbb{ABCDEF}`
- $$ \mathbf{ABCDEF} $$ : `\mathbb{ABCDEF}` (행렬 표현할 때 많이 사용!!)

------



## 2. Functions, Operators

### 2.1 Numerical Functions

|              Expression              |                 Syntax                 |
| :----------------------------------: | :------------------------------------: |
|          $$ \exp x = e^x $$          |             `\exp x = e^x`             |
|   $$ \ln x, \log e, \log_{10} x $$   |      `\ln x, \log e, \log_{10} x`      |
|     $$ \sin x, cos y, \tan z $$      |        `\sin x, cos y, \tan z`         |
| $$ \max x, \min y, \sup x, \inf y $$ | `\max(x,y), \min(x,y), \sup x, \inf y` |
|  $$ \lVert z \rVert, \arg\max z $$   |     `\lVert z \rVert, \arg\max z`      |
|   $ \binom{n}{k}, \tbinom{n}{k} $    |     `\binom{n}{k}, \tbinom{n}{k}`      |



### 2.2 Set, Logic Operators

|                    Expression                     |                    Syntax                     |
| :-----------------------------------------------: | :-------------------------------------------: |
|         $$ \in, \not\in, \ni, \not\ni $$          |          `\in, \notin, \ni, \not\ni`          |
| $$ \subset, \not\subset, \supset, \not\supset $$  | `\subset, \not\subset, \supset, \not\supset`  |
| $$ \bigcap_{i=1}^{\infty}, \bigcup, \cap, \cup $$ | `\bigcap_{i=1}^{\infty}, \bigcup, \cap, \cup` |
|          $$ =, \ne, \approx, \propto $$           |          `=, \ne, \approx, \propto`           |
|                $ \sim, \dot\sim $                 |               `\sim, \dot\sim`                |
|             $$ <, >, \nless, \ngtr $$             |             `<, >, \nless, \ngtr`             |
|         $$ \le, \ge, \not\le, \not\ge $$          |         `\le, \ge, \not\le, \not\ge`          |
|                  $$ \ll, \gg $$                   |                  `\ll, \gg`                   |
|        $$ \forall, \exists, \not\exists $$        |        `\forall, \exists, \not\exists`        |
|        $$ \rightarrow, \Leftrightarrow $$         |        `\rightarrow, \Leftrightarrow`         |
|         $ \therefore \ \because \ \And $          |         `\therefore  \because  \And`          |



### 2.3 Numerical Operators

|                     Expression                      |                      Syntax                       |
| :-------------------------------------------------: | :-----------------------------------------------: |
|                    $ +, -, \pm $                    |                    `+, -, \pm`                    |
| $ \hat \beta, \bar x, \tilde y, \widehat {Var(x)} $ | `\hat \beta, \bar x, \tilde y, \widehat {Var(x)}` |
|              $ \sqrt{2}, \sqrt[3]{2} $              |              `\sqrt{2}, \sqrt[3]{2}`              |
|             $ \sum_{i=1}^\infty x_i^2 $             |             `\sum_{i=1}^\infty x_i^2`             |
|              $ \prod_{i=1}^N f(x_i) $               |              `\prod_{i=1}^N f(x_i)`               |
|             $ \lim_{n \to \infty} x_n $             |             `\lim_{n \to \infty} x_n`             |
|                  $$ \frac{x}{y} $$                  |                   `\frac{x}{y}`                   |
|            $ dx, \partial x, \nabla y $             |            `dx, \partial x, \nabla y`             |
|                $ f', f'', f^{(3)} $                 |                ` f', f'', f^{(3)}`                |
|  $ \frac{\partial^2}{\partial x_1 \partial x_2} $   |  `\frac{\partial^2}{\partial x_1 \partial x_2}`   |
|         $ \int_{0}^{\infty} {f(x)} \, dx $          |         `\int_{0}^{\infty} {f(x)} \, dx`          |
|                $ \iint_A dx \, dy $                 |                `\iint_A dx \, dy`                 |



### 2.4 Matrices Operators

- **Matrix**

  - $ \begin{pmatrix}
    x & y \\
    z & v
    \end{pmatrix} $

    - ```latex
      \begin{pmatrix}
      x & y \\
      z & v
      \end{pmatrix}
      ```

- **Determinant**

  - $ \begin{vmatrix}
    x & y \\
    z & v
    \end{vmatrix} $

    - ```latex
      \begin{vmatrix}
      x & y \\
      z & v
      \end{vmatrix}
      ```

  - $ \begin{Vmatrix}
    x & y \\
    z & v
    \end{Vmatrix} $

    - ```latex
      \begin{Vmatrix}
      x & y \\
      z & v
      \end{Vmatrix}
      ```

- **High dimensional matrix**

  - $ \begin{bmatrix}
    0 & \cdots & 0 \\
    \vdots & \ddots & \vdots \\
    0 & \cdots & 0
    \end{bmatrix} $

    - ```latex
      \begin{bmatrix}
      0 & \cdots & 0 \\
      \vdots & \ddots & \vdots \\
      0 & \cdots & 0
      \end{bmatrix}
      ```



### 2.5 Other Expression Examples

- **Multiple equations**

  - $ f(n) =
    \begin{cases}
    1, & \text{if }n\text{ is even} \\
    0, & \text{if }n\text{ is odd}
    \end{cases} $

    - ```latex
      f(n) =
      \begin{cases}
      1, & \text{if }n\text{ is even} \\
      0, & \text{if }n\text{ is odd}
      \end{cases}
      ```

  - $ \begin{cases}
    3x + 5y + z \\
    7x - 2y + 4z \\
    -6x + 3y + 2z
    \end{cases} $

    - ```latex
      \begin{cases}
      3x + 5y + z \\
      7x - 2y + 4z \\
      -6x + 3y + 2z
      \end{cases}
      ```

- **Develop a formula**

  - $ \begin{align}
    f(x) & = (a+b)^2 \\
    & = a^2+2ab+b^2 \\
    \end{align} $

    - ```latex
      \begin{align}
      f(x) & = (a+b)^2 \\
      & = a^2+2ab+b^2 \\
      \end{align}
      ```

  - $ f(x) =
    \sum_{n=0}^\infty a_n x^n =
    a_0+a_1x+a_2x^2+\cdots $

    - ```latex
      f(x) =
      \sum_{n=0}^\infty a_n x^n =
      a_0+a_1x+a_2x^2+\cdots
      ```

------



## 3. 추가사항

### 3.1 Additional Operators

- **Space**
  - `~`, `\` 을 사용하여 **띄어쓰기** 가능
  - 수식이 아닌 text를 쓰고 싶은 경우 `\text{ 텍스트 }`를 사용하여 입력
    - `{ }` 안에 공백을 추가하면 공백 표현 가능 
  - **Example**
    - $ \text{if } n \text{ is even} $ : `\text{if } n \text{ is even} ` 
    - $ \text{if} \ n \ \text{is even} $ : `\text{if} \ n \ \text{is even}` 

- **줄바꿈**
  - `\\` 으로 **줄바꿈** 가능

- **괄호**
  - $ (), []$ : 바로 표현 가능
  - $ \{ \} $ : ` \{ \}` 의 형태로 표현 가능 (**escape 문자** 필수!!)



### 3.2 Notes

- **분수 전체에 괄호**

  - $$
    \left ( \frac{a}{b} \right )
    \\
    ( \frac{a}{b} )
    $$

    - ```latex
      \left ( \frac{a}{b} \right )
      \\
      ( \frac{a}{b} )		# 전체에 괄호가 적용되지 않음!!
      ```

