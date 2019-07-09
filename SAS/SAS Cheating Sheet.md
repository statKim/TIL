# SAS Cheating Sheet



### 데이터 만들기

```SAS
DATA class;
    INPUT name $ number sex $ dept $ exam1 exam2; /* 변수 이름, 문자열인 경우는 뒤에 $ */
    score=exam1+exam2;   /* 파생변수 생성 가능 */
CARDS;
A 1 M Stat 5 3
B 2 F Math 30 40
C 5 M Computer 25 30
RUN;
```



### 데이터 불러들이기

- DLM : 구분자 옵션(sep),  tab구분의 경우는 `DLM="09"x`
- `FIRSTOBS=2` : `header=T`와 같은 옵션 (2번째 행부터 읽어들임)
- `DSD` : 결측치 있는 데이터도 불러들여짐

```SAS
/* 파일 이름 지정(너무 길어서...) */
filename fname "C:\Users\user\Desktop\KHS\regression\data sets\Chapter 01\uffi.txt" ;

data uffi;
	INFILE fname DLM="," FIRSTOBS=2 DSD ;
	input CH2O AIR UFFI;   /* 변수 이름 지정 */
RUN;
```



### SET

- ##### 기본적으로 rbind()

- 변수 개수가 다를 경우, 없는 값은 결측으로 처리하고 rbind

``` SAS
DATA b;	
	SET a1 a2;
RUN;
```

- ##### inner join 처럼 하기

```SAS
DATA b;	
	SET a1;
    SET a2;
RUN;
```



### MERGE

- ##### 기본적으로 cbind()

- ##### 반드시 sort한 후 실행해야함!!! (by열 기준으로 정렬해야함)

- 변수 개수가 다를 경우, 없는 값은 결측으로 처리하고 cbind

```SAS
DATA b;	
	MERGE a1 a2;
RUN;
```

- ##### BY 옵션 : 기본적으로 outer join

```SAS
DATA b;	
	MERGE a1 a2;
	BY name;  /* name 변수 기준으로 merge */
RUN;
```



### SORT

```SAS
Proc SORT DATA=class OUT=new;	/* class데이터를 sort해서 new데이터로 저장 */
	BY DESCENDING sex dept;		/* DESCENDING은 옵션 */
RUN;
```



### IF문

- ##### `class` 데이터에서 `sex="F"`인 경우에만 `female`데이터에 저장

```SAS
DATA female;
    SET class;
    IF sex='F';
RUN;
```

- ##### 조건에 맞는 column 만들기

```SAS
DATA class;
    SET class;
    IF sex='M' THEN animal='wolf';
    		   ELSE animal='fox';
RUN;
```

- ##### 조건에 맞는 데이터 만들기 (OUTPUT 옵션)

```SAS
DATA male female;
    SET class;
    IF sex='M' THEN OUTPUT male;
    		   ELSE OUTPUT female;
RUN;
```



### DO문 (Loop)

- ##### for문과 동일 

- 반드시 `END`로 끝내줘야함

```SAS
DATA index;
    sum = 0;
    DO i=1 TO 10;
    	sum = sum + i;
    OUTPUT;		/* Loop를 돌면서 생성된 모든 값을 저장 */
    END;        /* OUTPUT 옵션 없을시, 최종 값만 저장 */
RUN;
```



### Path 지정

- path내에 sas dataset 파일 생성

```SAS
LIBNAME path 'C:\Users\user\Desktop\KHS\의학데이터분석';

DATA path.test;
	INPUT score @@;
CARDS;
95 83 100 72 45
;

PROC PRINT DATA=path.test;
RUN;
```





## Summary Statistics

### MEANS

- **사용가능 옵션** : N(관측값의 수), NMISS(결측값의 수), STD, MIN, MAX, CSS(수정된 제곱합), CV(변동게수;퍼센트), MEAN, VARIANCE, RANGE, SUM, USS, STDERR(평균의 표준편차), T($H_0 : \mu=0$의 $t$ value), PRT($P(X>|T|)$) SUMWGT

```SAS
PROC MEANS DATA=data MEAN STD MIN MAX ;
	VAR 변수1 변수2;   /* 변수 지정 */
	BY 변수1;         /* BY 변수1의 요소별로 통계량 계산 => 반드시 사전에 SORT 해야함 */
	CLASS 변수1;      /* BY와 같은 기능이지만 별도의 PROC SORT할 필요X */
RUN;
```



### UNIVARIATE

- **사용가능 옵션** : NOPRINT(기술통계량 출력X), PLOT, FREQ, NORMAL

```SAS
PROC UNIVARIATE DATA=data PLOT FREQ NORMAL ;
	VAR 변수1 변수2;   /* 변수 지정 */
	BY 변수1;         /* BY 변수1의 요소별로 통계량 계산 => 반드시 사전에 SORT 해야함 */
	CLASS 변수1;      /* BY와 같은 기능이지만 별도의 PROC SORT할 필요X */
RUN;
```





### 카이제곱 검정

- **옵션** : CHISQ(카이제곱검정), EXPECTED(기대도수), MEASURES, RELRISK, NOCOL, NOPERCENT

```SAS
PROC FREQ DATA=candy;	/* Categorical: sex, color, Continuous: count */
	WEIGHT count;       /* 관측값들의 상대 가중값을 가지는 변수 지정 */
	TABLES sex color sex*color/ CHISQ EXPECTED NOCOL NOPERCENT;   /* cross-table */
RUN;
```



### GPLOT

- ##### Scatter plot

```SAS
PROC GPLOT DATA=candy UNIFORM;   /* UNIFORM : BY문 사용시 축의 스케일 일정하게 해줌 */
	PLOT price*count;   /* y축 * x축 */
	PLOT price*count = color;  /* scatter plot에서 color별로 색 다르게 그리기 */
	PLOT price*count = "%";    /* pch 옵션 */
	BY sex;   /* sex별로 그래프 그리기; 반드시 sex에 대해 sort 한 후에 사용 */
RUN;
```



### GCHART

- ##### Histogram, Bar chart

- **옵션** : HBAR, VBAR, HBAR3D, VBAR3D, PIE, PIE3D, DONUT

```SAS
PROC GCHART DATA=candy;
	/* x축: color, y축: count, sex별로 bar를 나누고 percent 표시 */
	VBAR color/FREQ=count SUBGROUP=sex INSIDE=percent;
RUN;
```



### t-test

- ##### One sample t-test ($H_0:\mu=\mu_0$)

```SAS
PROC TTEST DATA=crab H0=24.3 ALPHA=0.05;
	VAR temp;
RUN;
```

- ##### Two samples t-test ($H_0:\mu_1=\mu_2$)

```SAS
PROC TTEST DATA=golf ALPHA=0.05;
	VAR score;
	CLASS sex;   /* M,F를 가지는 변수 */
RUN;
```

- ##### Paired t-test ($H_0:\mu_1=\mu_2$)

```SAS
PROC TTEST DATA=computer ALPHA=0.05;
	VAR diff;   /* diff=after-before */
RUN;

PROC TTEST DATA=computer ALPHA=0.05;
	PAIRED before*after;
RUN;
```



### ANOVA

- ##### One-way ANOVA

```SAS
PROC ANOVA DATA=treat;
	CLASS diet;
	MODEL gain=diet;   /* response=factor */
	MEANS diet/LSD DUNCAN TUKEY SNK;   /* 사후검정 옵션 */
RUN;

PROC GLM DATA=treat;
	CLASS diet;
	MODEL gain=diet;
	MEANS diet/SNK ALPHA=0.1;
	MEANS diet/TUKEY CLDIFF;
RUN;
```

- ##### Two-way ANOVA

```SAS
PROC ANOVA DATA=cornyield;
	CLASS soil fertil;
	MODEL corn=soil fertil soil*fertil;   /* interaction 고려 */
RUN;

PROC GLM DATA=cornyield;
	CLASS soil fertil;
	MODEL corn=soil fertil soil*fertil;
RUN;
```



### CORR

```SAS
PROC CORR DATA=city;
	VAR acd aut pol;
RUN;
```



### Regression

```SAS
/* Scatter plot */
PROC GPLOT DATA=city;
	PLOT acd*(aut pol);
RUN;

/* Correlation matrix */
PROC CORR DATA=city;
	VAR acd aut pol;
RUN;

/* Regression model */
PROC REG DATA=city;
	MODEL acd=aut pol;
RUN;
```



### Cox PH model

