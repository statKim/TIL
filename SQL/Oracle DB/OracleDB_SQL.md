# Oracle DB SQL문 요약



### DB 데이터 확인

#### 1) DB에 저장되어 있는 Table 목록 확인

```sql
-- Table 내용을 보기 위해 화면 크기 설정
SQL> SET LINESIZE 200
SQL> SET PAGESIZE 100

-- DB에 저장되어 있는 Table 목록 확인
SQL> SELECT * FROM TAB;
```

####  2) Table의 column별 Type, Length 확인

```SQL
-- Table의 column별 Type 확인
-- 테이블명의 경우 반드시 작은 따옴표('') 사용!
-- 컬럼명, 데이터 타입, 데이터 길이,
-- 전체 자리수, 소수점이하 자리수, NULL가능여부,
-- 컬럼 ID, Default값, 문자열 길이
SQL> SELECT COLUMN_NAME, DATA_TYPE, DATA_LENGTH,
		    DATA_PRECISION, DATA_SCALE, NULLABLE,
		    COLUMN_ID, DATA_DEFAULT, CHAR_LENGTH
     FROM ALL_TAB_COLUMNS
     WHERE TABLE_NAME='테이블명';
```

#### 3) Table에서 PRIMARY KEY인 컬럼명 뽑아내기

``` SQL
SQL> SELECT U.COLUMN_NAME, C.CONSTRAINT_TYPE
     FROM USER_CONSTRAINTS C, USER_CONS_COLUMNS U
     WHERE C.TABLE_NAME = '테이블명' AND
           C.CONSTRAINT_TYPE = 'P' AND
           C.CONSTRAINT_NAME = U.CONSTRAINT_NAME;
```

#### 4) Select문으로 데이터 조회

##### 4-1) WHERE문

```SQL
-- 중복 제거
SQL> SELECT DISTINCT 컬럼명 FROM 테이블명;

-- IN, NOT IN (여러 값에 포함여부를 결정할 때에 사용)
SQL> SELECT C1, C2 FROM T
     WHERE C1 IN('V1', 'V2');

-- IS NULL, IS NOT NULL
SQL> SELECT C1 FROM T
     WHERE C1 IS NULL;

-- 패턴 매칭(LIKE, NOT LIKE)
SQL> SELECT * FROM T
	 WHERE C1 LIKE '&값&';  -- C1에 '값'이 포함된 모든 행 출력
SQL> SELECT * FROM T
	 WHERE C1 LIKE '____';  -- C1이 4글자인 모든 행 출력
```

##### 4-2) ORDER BY

```SQL
-- 오름차순
SQL> SELECT * FROM T
	 ORDER BY C1;

-- 내림차순
SQL> SELECT * FROM T
 	 ORDER BY C1 DESC;
```

##### 4-3) GROUP BY

- GROUP BY에서 **사용한 열**과 **집계함수**만 사용 가능!!

- 가능한 집계함수: `MAX`, `MIN`, `COUNT`, `SUM`, `AVG`

```SQL
-- 기본 GROUP BY
SQL> SELECT C1, SUM(C2) AS '합계'
	 FROM T
	 GROUP BY C1;

-- HAVING: 집계함수에 조건 적용 가능
SQL> SELECT C1, COUNT(*) AS '합계'
	 FROM T
	 GROUP BY C1
	 HAVING COUNT(*) >= 3;
```

##### 4-4) JOIN

```SQL
-- INNER JOIN
SQL> SELECT T1.C1, T1.C2
	 FROM TABLE1 T1, TABLE2 T2	-- table명에 별칭 부여
	 WHERE T1.C1 = T2.C1
	 ORDER BY T1.C1;
	 
-- TABLE이 3개 이상일 때(외래키 조건 2개)에도 방법은 동일
-- WHERE절에 'AND'로 조건 중첩
```

##### 4-5) Subquery

- **필요한 데이터만 찾기 때문**에 데이터가 대량일 경우 **JOIN보다 효율적!**

```SQL
-- 1. Scalar Subquery (SELECT 절에서 사용)
-- 단일 열을 반환해줌!!
SQL> SELECT clientNo,
			(SELECT clientName
             FROM client
             WHERE client.clientNo = bookSale.clientNo),
            SUM(bsQty) AS "총 주문 수량"
     FROM bookSale
     GROUP BY clientNo;

-- 2. Inline View Table Subquery (FROM 절에서 사용)
-- 가상의 Table을 만들고 별칭 부여하여 사용
-- 즉, 기존 Table을 그대로 사용하는 것이 아닌 축소하거나 새로 정의한 Table을 사용
SQL> SELECT bookName,
			bookPrice,
			SUM(bsQty) AS "총 판매 수량",
			SUM(bookPrice * bsQty) AS "총 판매액"
	 FROM (SELECT bookNo, bookName, bookPrice 
           FROM book
           WHERE bookPrice >= 25000) book,
           bookSale
     WHERE book.bookno = booksale.bookno
     GROUP BY book.bookno, bookName, bookPrice;

-- Nested Subquery (WHERE 절에서 사용)
SQL> SELECT bookName, bookPrice
     FROM book
     WHERE bookPrice > (SELECT AVG(bookPrice)
                        FROM book);
```

##### 4-6) 내장함수

- `ROUND(컬럼, 자리수)` : 반올림 함수
- `REPLACE(컬럼, 현재값, 바꿀값)` : 컬럼에서 '현재값'을 '바꿀값'으로 변경
- `LENGTH(컬럼) `: 글자 수 반환
- `LENGTHB(컬럼)` : 바이트 수 반환
- `SUBSTR(컬럼, 시작, 길이)` : '시작' 위치부터 '길이'만큼의 문자열 반환
- 날짜 함수
  - SYSDATE - 1 : 어제,  SYSDATE + 1 : 내일

```SQL
-- 현재 날짜 출력
SQL> SELECT SYSDATE FROM DUAL;

-- 현재 날짜와 시간 출력
SQL> SELECT CURRENT_DATE, CURRENT_TIMESTAMP FROM DUAL;

-- 현재 날짜에서 년, 월, 일 추출
SQL> SELECT EXTRACT(YEAR FROM SYSDATE) 년,
            EXTRACT(MONTH FROM SYSDATE) 월,
            EXTRACT(DAY FROM SYSDATE) 일
     FROM DUAL;
```



### R - Oracle DB 연동

- **필요 Library : rJava, DBI, RJDBC**

```R
# 설치시 순서가 중요! => 순서 틀릴 시 에러
install.packages("rJava")
install.packages("DBI")
install.packages("RJDBC")

# 순서대로 import
library(rJava)
library(DBI)
library(RJDBC) # rJava에 의존적

## Oracle DB 연동(Oracle 11g)
# driver 객체 생성
drv <- JDBC("oracle.jdbc.driver.OracleDriver", "C:\\oraclexe\\app\\oracle\\product\\11.2.0\\server\\jdbc\\lib\\ojdbc6.jar")

# connection 객체 생성(DB connect)
# conn <- dbConnect(drv, "jdbc:oracle:thin:@//(아이피):(포트번호)/(SID)", "(접속 아이디)", "(접속 비밀번호)")
conn <- dbConnect(drv, "jdbc:oracle:thin:@//127.0.0.1:1521/XE", "SCOTT", "TIGER")

# SQL query 날려서 결과 가져오기
query <- "SELECT * FROMM EMP"	# 여기서는 ";"를 하면 안됨!
result <- dbGetQuery(conn, query)
result

# DB disconnect
dbDisconnect(conn)
```

