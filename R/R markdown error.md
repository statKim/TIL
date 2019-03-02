# R markdown error



## 1. 한글 주석 warning message

- **한글 주석**이 들어갈 경우 warning message가 뜬다!!

![](images/rmd_warning1.png)

### 해결방법

- console에 명령어 입력

```R
Sys.setlocale("LC_ALL", "C")
```

![](images/rmd_warning2.png)

- **warning message** 사라짐!!

![](images/rmd_warning3.png)