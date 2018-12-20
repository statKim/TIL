-- SUM() : 합계

-- 도서 테이블에서 총 재고 수량 계산하여 출력
-- 열 이름 없이 총합만 출력
SELECT SUM(bookstock) FROM book;

-- 열 이름 "sum of bookStock" 총 재고 수량 계산하여 출력
SELECT SUM(bookstock) AS "sum of bookStock" -- 이름 지정할 때는 큰따옴표로!!
FROM book;

-- 열 이름으로 한글도 가능
SELECT SUM(bookstock) AS "총 재고량"
FROM book;

-- 도서판매 테이블에서
-- 고객번호 2인 호날두가 주문한 도서의 총 주문 수량 계산하여 출력
SELECT SUM(bsQty) AS "총 주문 수량"
FROM booksale
WHERE clientno = '2';

-- 도서판매 테이블에서 최대/최소 주문량
SELECT MAX(bsQty) AS "최대 주문량", MIN(bsQty) AS "최소 주문량"
FROM booksale;

-- 도서 테이블에서 도서의 가격 총액, 평균 가격, 최고가, 최저가 출력
SELECT SUM(bookprice) AS "가격 총액",
        AVG(bookprice) AS "평균가격",
        MAX(bookprice) AS "최고가",
        MIN(bookprice) AS "최저가"
FROM book;

-- 열 이름에 공백이 들어 있지 않으면 "" 없어도 됨
SELECT SUM(bookprice) AS "가격 총액",
        AVG(bookprice) AS 평균가격,
        MAX(bookprice) AS 최고가,
        MIN(bookprice) AS 최저가
FROM book;

-- 도서판매 테이블에서 도서 판매 건수 출력(모든 행의 수)
SELECT COUNT(*) AS "총 판매 건수" FROM booksale;

-- 고객 테이블에서 총 고객 수(모든 행의 수)
SELECT COUNT(*) AS "총 고객 수" FROM client;

-- 고객 테이블에서 총 취미 개수 출력(NULL 값만 제외)
SELECT COUNT(clientHobby) AS "취미" FROM client;

-- GROUP BY
-- 도서판매 테이블에서 상품번호별로 주문수량 합계 출력
SELECT bookNo, SUM(bsQty) AS "주문량 합계"
FROM bookSale
GROUP BY bookNo;

-- HAVING 절
-- 도서 테이블에서 가격이 25000원 이상인 도서에 대하여
-- 출판사별로 도서 수 합계 출력, 단, '도서 수 합계'가 2 이상
SELECT pubNo, COUNT(*) AS "도서 수 합계"
FROM book
WHERE bookprice >= 25000
GROUP BY pubno
HAVING COUNT(*) >= 2;

/*EX*/
--1.도서 테이블에서 가격 순으로 내림차순 정렬하여, 도서명, 저자, 가격 출력
--  (가격이 같으면 저자 순으로 오름차순 정렬)
SELECT bookname, bookauthor, bookprice
FROM book
ORDER BY bookprice DESC, bookauthor ASC;

--2. 도서 테이블에서 저자에 '길동'이 들어가는 도서의 총 재고 수량 계산하여 출력
SELECT SUM(bookstock) AS "총 재고 수량"
FROM book
WHERE bookauthor LIKE '%길동%';

--3. 도서 테이블에서 '서울 출판사' 도서 중 최고가와 최저가 출력
SELECT MAX(bookprice) AS "최고가", MIN(bookprice) AS "최저가"
FROM book
WHERE pubno = '1';

--4. 도서 테이블에서 출판사별로 총 재고 수량과 평균 재고 수량 계산하여 출력
SELECT pubno AS "출판사",
        SUM(bookstock) AS "총 재고 수량",
       --AVG(bookstock) AS "평균 재고 수량"
       --CAST(AVG(bookstock) AS NUMBER(5,2)) AS "평균 재고 수량"   -- 소수점 줄여줌(형 변환 함수)
       --ROUND(AVG(bookstock)) AS "평균 재고 수량"  -- 정수로 표현
       ROUND(AVG(bookstock),2) AS "평균 재고 수량"    -- 소수 둘째자리까지
       -- CEIL() : 올림, FLOOR() : 내림
FROM book
GROUP BY pubno;

--5. 도서판매 테이블에서 고객별로 총 주문 수량과 총 주문 건수 출력, 단 주문 건수가 2이상인 고객만 해당
SELECT clientno AS "고객",
        SUM(bsqty) AS "총 주문 수량",
        COUNT(*) AS "총 주문 건수"   -- clientNo별로 COUNT함
FROM booksale
GROUP BY clientno
HAVING COUNT(*) >= 2;


