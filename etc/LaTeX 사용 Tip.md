# LaTeX



## 1. LaTeX에 타 언어 코드 추가하기

``` latex
\usepackage[svgnames]{xcolor}
\usepackage{listings}

\lstset{language=R,                     	% the language of the code
        basicstyle=\tiny\ttfamily,      	% the size of the fonts that are used for the code
        numbers=none,                   	% where to put the line-numbers
        numberstyle=\tiny\color{Blue},  	% the style that is used for the line-numbers
        stepnumber=1,                   	% the step between two line-numbers. If it is 1, each line will be numbered
        numbersep=5pt,                  	% how far the line-numbers are from the code
        backgroundcolor=\color{white},  	% choose the background color. You must add \usepackage{color}
        showspaces=false,               	% show spaces adding particular underscores
        showstringspaces=false,         	% underline spaces within strings
        showtabs=false,                 	% show tabs within strings adding particular underscores
        frame=single,                   	% adds a frame around the code
        rulecolor=\color{black},        	% if not set, the frame-color may be changed on line-breaks within not-black text (e.g. commens (green here))
        tabsize=2,                      	% sets default tabsize to 2 spaces
        captionpos=b,                   	% sets the caption-position to bottom
        breaklines=true,                	% sets automatic line breaking
        breakatwhitespace=false,        	% sets if automatic breaks should only happen at whitespace
        keywordstyle=\color{RoyalBlue},     % keyword style
        commentstyle=\color{YellowGreen},   % comment style
        stringstyle=\color{ForestGreen},    % string literal style
        escapeinside=''                     % 주석에 한글 존재시 escape 문자 지정
}
\lstinputlisting{code.R}                    % 파일 이름
```



### 1-1. 코드 파일에 한글 존재시 적용 방법

- ###### escapeinside=이스케이프 문자

  ```latex
  \lstset{language=R,
  		escapeinside=~~
  		}
  ```

- **code.R**

  ```R
  x <- 1:10   # ~한글 주석~
  ```

- ###### escapeinside 옵션으로 지정한 escape 문자를 사용해서 code파일의 한글 부분을 escape 문자로 묶어주면 해결됨!!

