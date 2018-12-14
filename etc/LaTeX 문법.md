# LaTeX Syntax

-  [**참고사이트**](https://en.wikipedia.org/wiki/Help:Displaying_a_formula#Formatting_using_TeX)



## 1. Alphabets

### 1.1 Greek Alphabets

- ![equation](https://latex.codecogs.com/gif.latex?%5CGamma%20%5C%20%5CDelta%20%5C%20%5CSigma%20%5C%20%5CTheta%20%5C%20%5CPhi%20%5C%20%5CPsi%20%5C%20%5COmega) : `\Gamma \Delta \Sigma \Theta \Phi \Psi \Omega` 

- ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Calpha%20%5C%20%5Cbeta%20%5C%20%5Cgamma%20%5C%20%5Cdelta%20%5C%20%5Cepsilon%20%5C%20%5Crho%20%5C%20%5Cmu%20%5C%20%5Csigma) : `\alpha \beta \gamma \eplilon \rho \mu \sigma`



### 1.2 Bold

- ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Cmathbb%7BABCDEF%7D) : `\mathbb{ABCDEF}`
- ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Cmathbf%7BABCDEF%7D) : `\mathbb{ABCDEF}` (행렬 표현할 때 많이 사용!!)

------



## 2. Functions, Operators

### 2.1 Numerical Functions

|                          Expression                          |                 Syntax                 |
| :----------------------------------------------------------: | :------------------------------------: |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Cexp%20x%20%3D%20e%5Ex) |             `\exp x = e^x`             |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Cln%20x%2C%20%5Clog%20e%2C%20%5Clog_%7B10%7D%20x) |      `\ln x, \log e, \log_{10} x`      |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Csin%20x%2C%20cos%20y%2C%20%5Ctan%20z) |        `\sin x, cos y, \tan z`         |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Cmax%20x%2C%20%5Cmin%20y%2C%20%5Csup%20x%2C%20%5Cinf%20y) | `\max(x,y), \min(x,y), \sup x, \inf y` |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%5ClVert%20z%20%5CrVert%2C%20%5Carg%5Cmax%20z) |     `\lVert z \rVert, \arg\max z`      |
| ![eqaution](https://latex.codecogs.com/gif.latex?%5Cbinom%7Bn%7D%7Bk%7D%2C%20%5Ctbinom%7Bn%7D%7Bk%7D) |     `\binom{n}{k}, \tbinom{n}{k}`      |



### 2.2 Set, Logic Operators

|                          Expression                          |                    Syntax                     |
| :----------------------------------------------------------: | :-------------------------------------------: |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Cin%2C%20%5Cnot%5Cin%2C%20%5Cni%2C%20%5Cnot%5Cni) |          `\in, \notin, \ni, \not\ni`          |
| ![eqaution](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Csubset%2C%20%5Cnot%5Csubset%2C%20%5Csupset%2C%20%5Cnot%5Csupset) | `\subset, \not\subset, \supset, \not\supset`  |
| ![eqaution](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Cbigcap_%7Bi%3D1%7D%5E%7B%5Cinfty%7D%2C%20%5Cbigcup%2C%20%5Ccap%2C%20%5Ccup) | `\bigcap_{i=1}^{\infty}, \bigcup, \cap, \cup` |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%3D%2C%20%5Cne%2C%20%5Capprox%2C%20%5Cpropto) |          `=, \ne, \approx, \propto`           |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Csim%2C%20%5Cdot%5Csim) |               `\sim, \dot\sim`                |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%3C%2C%20%3E%2C%20%5Cnless%2C%20%5Cngtr) |             `<, >, \nless, \ngtr`             |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Cle%2C%20%5Cge%2C%20%5Cnot%5Cle%2C%20%5Cnot%5Cge) |         `\le, \ge, \not\le, \not\ge`          |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Cll%2C%20%5Cgg) |                  `\ll, \gg`                   |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Cforall%2C%20%5Cexists%2C%20%5Cnot%5Cexists) |        `\forall, \exists, \not\exists`        |
| ![eqaution](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Crightarrow%2C%20%5CLeftrightarrow) |        `\rightarrow, \Leftrightarrow`         |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cinline%20%5Ctherefore%20%5C%20%5Cbecause%20%5C%20%5CAnd) |         `\therefore  \because  \And`          |



### 2.3 Numerical Operators

|                          Expression                          |                      Syntax                       |
| :----------------------------------------------------------: | :-----------------------------------------------: |
| ![equation](https://latex.codecogs.com/gif.latex?+%2C%20-%2C%20%5Cpm) |                    `+, -, \pm`                    |
| ![equation](https://latex.codecogs.com/gif.latex?%5Chat%20%5Cbeta%2C%20%5Cbar%20x%2C%20%5Ctilde%20y%2C%20%5Cwidehat%20%7BVar%28x%29%7D) | `\hat \beta, \bar x, \tilde y, \widehat {Var(x)}` |
| ![eqaution](https://latex.codecogs.com/gif.latex?%5Csqrt%7B2%7D%2C%20%5Csqrt%5B3%5D%7B2%7D) |              `\sqrt{2}, \sqrt[3]{2}`              |
| ![equation](https://latex.codecogs.com/gif.latex?%5Csum_%7Bi%3D1%7D%5E%5Cinfty%20x_i%5E2) |             `\sum_{i=1}^\infty x_i^2`             |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cprod_%7Bi%3D1%7D%5EN%20f%28x_i%29) |              `\prod_{i=1}^N f(x_i)`               |
| ![eqaution](https://latex.codecogs.com/gif.latex?%5Clim_%7Bn%20%5Cto%20%5Cinfty%7D%20x_n) |             `\lim_{n \to \infty} x_n`             |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cfrac%7Bx%7D%7By%7D) |                   `\frac{x}{y}`                   |
| ![equation](https://latex.codecogs.com/gif.latex?dx%2C%20%5Cpartial%20x%2C%20%5Cnabla%20y) |            `dx, \partial x, \nabla y`             |
| ![eqaution](https://latex.codecogs.com/gif.latex?f%27%2C%20f%27%27%2C%20f%5E%7B%283%29%7D) |                ` f', f'', f^{(3)}`                |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cfrac%7B%5Cpartial%5E2%7D%7B%5Cpartial%20x_1%20%5Cpartial%20x_2%7D) |  `\frac{\partial^2}{\partial x_1 \partial x_2}`   |
| ![equation](https://latex.codecogs.com/gif.latex?%5Cint_%7B0%7D%5E%7B%5Cinfty%7D%20%7Bf%28x%29%7D%20%5C%2C%20dx) |         `\int_{0}^{\infty} {f(x)} \, dx`          |
| ![equation](https://latex.codecogs.com/gif.latex?%5Ciint_A%20dx%20%5C%2C%20dy) |                `\iint_A dx \, dy`                 |



### 2.4 Matrices Operators

- **Matrix**

  ![eqaution](https://latex.codecogs.com/gif.latex?%5Cbegin%7Bpmatrix%7D%20x%20%26%20y%20%5C%5C%20z%20%26%20v%20%5Cend%7Bpmatrix%7D)

  - ```latex
    \begin{pmatrix}
    x & y \\
    z & v
    \end{pmatrix}
    ```

- **Determinant**

  ![equation](https://latex.codecogs.com/gif.latex?%5Cbegin%7Bvmatrix%7D%20x%20%26%20y%20%5C%5C%20z%20%26%20v%20%5Cend%7Bvmatrix%7D)

  - ```latex
    \begin{vmatrix}
    x & y \\
    z & v
    \end{vmatrix}
    ```

  ![eqaution](https://latex.codecogs.com/gif.latex?%5Cbegin%7BVmatrix%7D%20x%20%26%20y%20%5C%5C%20z%20%26%20v%20%5Cend%7BVmatrix%7D)

  - ```latex
    \begin{Vmatrix}
    x & y \\
    z & v
    \end{Vmatrix}
    ```

- **High dimensional matrix**

  ![equation](https://latex.codecogs.com/gif.latex?%5Cbegin%7Bbmatrix%7D%200%20%26%20%5Ccdots%20%26%200%20%5C%5C%20%5Cvdots%20%26%20%5Cddots%20%26%20%5Cvdots%20%5C%5C%200%20%26%20%5Ccdots%20%26%200%20%5Cend%7Bbmatrix%7D)

  - ```latex
    \begin{bmatrix}
    0 & \cdots & 0 \\
    \vdots & \ddots & \vdots \\
    0 & \cdots & 0
    \end{bmatrix}
    ```



### 2.5 Other Expression Examples

- **Multiple equations**

  ![equation](https://latex.codecogs.com/gif.latex?f%28n%29%20%3D%20%5Cbegin%7Bcases%7D%201%2C%20%26%20%5Ctext%7Bif%20%7Dn%5Ctext%7B%20is%20even%7D%20%5C%5C%200%2C%20%26%20%5Ctext%7Bif%20%7Dn%5Ctext%7B%20is%20odd%7D%20%5Cend%7Bcases%7D)

  - ```latex
    f(n) =
    \begin{cases}
    1, & \text{if }n\text{ is even} \\
    0, & \text{if }n\text{ is odd}
    \end{cases}
    ```

  ![equation](https://latex.codecogs.com/gif.latex?%5Cbegin%7Bcases%7D%203x%20+%205y%20+%20z%20%5C%5C%207x%20-%202y%20+%204z%20%5C%5C%20-6x%20+%203y%20+%202z%20%5Cend%7Bcases%7D)

  - ```latex
    \begin{cases}
    3x + 5y + z \\
    7x - 2y + 4z \\
    -6x + 3y + 2z
    \end{cases}
    ```

- **Develop a formula**

  ![equation](https://latex.codecogs.com/gif.latex?%5Cbegin%7Balign*%7D%20f%28x%29%20%26%20%3D%20%28a+b%29%5E2%20%5C%5C%20%26%20%3D%20a%5E2+2ab+b%5E2%20%5Cend%7Balign*%7D)

  - ```latex
    \begin{align*}
    f(x) & = (a+b)^2 \\
    & = a^2+2ab+b^2
    \end{align*}
    ```

  ![eqaution](https://latex.codecogs.com/gif.latex?f%28x%29%20%3D%20%5Csum_%7Bn%3D0%7D%5E%5Cinfty%20a_n%20x%5En%20%3D%20a_0+a_1x+a_2x%5E2+%5Ccdots)

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
    - ![equation](https://latex.codecogs.com/gif.latex?%5Ctext%7Bif%20%7D%20n%20%5Ctext%7B%20is%20even%7D) : `\text{if } n \text{ is even} ` 
    - ![equation](https://latex.codecogs.com/gif.latex?%5Ctext%7Bif%7D%20%5C%20n%20%5C%20%5Ctext%7Bis%20even%7D) : `\text{if} \ n \ \text{is even}` 

- **줄바꿈**
  - `\\` 으로 **줄바꿈** 가능

- **괄호**
  - ![equation](https://latex.codecogs.com/gif.latex?%28%29%2C%20%5B%5D) : 바로 표현 가능
  - ![equation](https://latex.codecogs.com/gif.latex?%5C%7B%20%5C%7D) : ` \{ \}` 의 형태로 표현 가능 (**escape 문자** 필수!!)



### 3.2 Notes

- **분수 전체에 괄호**

  ![equation](https://latex.codecogs.com/gif.latex?%5Cleft%20%28%20%5Cfrac%7Ba%7D%7Bb%7D%20%5Cright%20%29%20%5C%20%28%20%5Cfrac%7Ba%7D%7Bb%7D%20%29)

  - ```latex
    \left ( \frac{a}{b} \right )
    \
    ( \frac{a}{b} )		# 전체에 괄호가 적용되지 않음!!
    ```

