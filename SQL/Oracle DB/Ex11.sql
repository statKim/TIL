-- 한 번이라도 도서를 주문한 고객의 고객번호와 고객명 출력
-- 중복되는 행은 한 번만 출력
-- 고객번호 오름차순 정렬
SELECT UNIQUE c.clientno, c.clientname  -- UNIQUE : 중복되는것 삭제해서 출력 (DISTINCT와 같음)
FROM client C, booksale BS
WHERE c.clientno = bs.clientno
ORDER BY c.clientno;
-- INNER JOIN 사용한 식
SELECT UNIQUE c.clientno, c.clientname
FROM client C
INNER JOIN booksale BS
ON c.clientno = bs.clientno
ORDER BY c.clientno;

-- 도서를 주문한 고객의 고객정보와 주문 정보 출력
SELECT c.clientno, c.clientname, bs.bsno, bs.bsdate, bs.bsqty, bs.bookno
FROM client C, bookSale BS
WHERE C.clientNo = BS.clientNo
ORDER BY c.clientno;
-- INNER JOIN 사용한 식
SELECT c.clientno, c.clientname, bs.bsno, bs.bsdate, bs.bsqty, bs.bookno
FROM client C
INNER JOIN bookSale BS
ON C.clientNo = BS.clientNo
ORDER BY c.clientno;

-- 고객별로 총 주문 수량 계산하여
-- 고객명과 총 주문 수량 출력
-- 총 주문 수량 기준 내림차순 정렬
SELECT c.clientno, c.clientname, SUM(BS.bsQty) AS "총 주문 수량" -- BS.bsQty에서 BS는 생략 가능(BS에만 있는 열이름)
FROM client C, bookSale BS
WHERE c.clientno = bs.clientno
GROUP BY c.clientno, c.clientname
ORDER BY "총 주문 수량" DESC;
-- INNER JOIN 사용한 식
SELECT c.clientno, c.clientname, SUM(BS.bsQty) AS "총 주문 수량" 
FROM client C
INNER JOIN bookSale BS
ON c.clientno = bs.clientno
GROUP BY c.clientno, c.clientname
ORDER BY "총 주문 수량" DESC;

-- 고객번호 출력하지 않고 고객명만 출력 가능
SELECT c.clientname, SUM(BS.bsQty) AS "총 주문 수량"
FROM client C, bookSale BS
WHERE c.clientno = bs.clientno
GROUP BY c.clientno, c.clientname
ORDER BY "총 주문 수량" DESC;
-- INNER JOIN 사용한 식
SELECT c.clientname, SUM(BS.bsQty) AS "총 주문 수량" 
FROM client C
INNER JOIN bookSale BS
ON c.clientno = bs.clientno
GROUP BY c.clientno, c.clientname
ORDER BY "총 주문 수량" DESC;

-- 3개 테이블 사용(외래키 조건 2개)
-- 주문된 도서에 대하여 주문일, 도서명, 고객명, 주문 수량 출력
SELECT bs.bsdate, b.bookname, C.clientName, BS.bsQty
FROM client C, bookSale BS, book B
WHERE c.clientno = bs.clientno
    AND b.bookno = bs.bookno;
-- INNER JOIN 사용한 식
SELECT bs.bsdate, b.bookname, C.clientName, BS.bsQty
FROM bookSale BS    -- foreing key 있는 테이블에 INNER JOIN 해야함!!!
INNER JOIN client C ON c.clientno = bs.clientno
INNER JOIN book B ON b.bookno = bs.bookno;

-- 3개 테이블 사용 (외래키 조건 2개)
-- 계산된 결과를 출력하기 위한 열 사용
-- 판매된 도서의 주문일, 고객명, 도서명, 도서가격, 주문수량, 주문액 계산하여 출력
SELECT bs.bsdate, c.clientname, B.bookname, B.bookprice, BS.bsqty, (B.bookprice * bs.bsqty) AS "주문액"
FROM client C, bookSale BS, book B
WHERE c.clientno = bs.clientno AND b.bookno = bs.bookno;
-- INNER JOIN 사용한 식
SELECT bs.bsdate, c.clientname, B.bookname, B.bookprice, BS.bsqty, (B.bookprice * bs.bsqty) AS "주문액"
FROM bookSale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN client C ON c.clientno = bs.clientno;

-- "주문액"으로 내림차순 정렬
SELECT bs.bsdate, c.clientname, B.bookname, B.bookprice, BS.bsqty, (B.bookprice * bs.bsqty) AS "주문액"
FROM client C, bookSale BS, book B
WHERE c.clientno = bs.clientno AND b.bookno = bs.bookno
ORDER BY "주문액" DESC;
-- INNER JOIN 사용한 식
SELECT bs.bsdate, c.clientname, B.bookname, B.bookprice, BS.bsqty, (B.bookprice * bs.bsqty) AS "주문액"
FROM bookSale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN client C ON c.clientno = bs.clientno
ORDER BY "주문액" DESC;

-- 3개 테이블 사용
-- WHERE 절에 조건 추가
-- 2017년~현재가지 판매된 도서의 주문일, 고객명, 도서명, 도서가격, 주문수량, 주문액 계산하여 출력
SELECT bs.bsdate, c.clientname, B.bookname, B.bookprice, bs.bsqty, (B.bookprice * bs.bsqty) AS "주문액"
FROM booksale BS, client C, book B
WHERE c.clientno = bs.clientno AND b.bookno = bs.bookno
        AND BS.bsDate >= '2017-01-01';

/*EX*/
--1.모든 도서에 대하여 도서의 도서번호, 도서명, 출판사명 출력
SELECT b.bookno, b.bookname, p.pubname
FROM book B, publisher P
WHERE B.pubno = P.pubno;
-- INNER JOIN 사용한 식
SELECT b.bookno, b.bookname, p.pubname
FROM book B
INNER JOIN publisher P
ON B.pubno = P.pubno;

--2.'서울 출판사'에서 출간한 도서의 도서명, 저자명, 출판사명 출력(출판사명 사용)
SELECT b.bookname, b.bookauthor, P.pubname
FROM book B, publisher P
WHERE B.pubno = P.pubno 
        AND p.pubname = '서울 출판사';
-- INNER JOIN 사용한 식
SELECT b.bookname, b.bookauthor, P.pubname
FROM book B
INNER JOIN publisher P
ON B.pubno = P.pubno --AND p.pubname = '서울 출판사';    -- P에 들어있는 열이기 때문에 이상 X
WHERE p.pubname = '서울 출판사';

--3.'멀티캠출판사'에서 출간한 도서 중 판매된 도서의 도서명 출력(중복된 경우 한 번만 출력) (출판사명 사용)
SELECT DISTINCT b.bookname
FROM book B, publisher P, booksale BS
WHERE b.bookno = bs.bookno
       AND B.pubno = P.pubno 
       AND p.pubname = '멀티캠출판사';
-- INNER JOIN 사용한 식
SELECT DISTINCT b.bookname
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN publisher P ON B.pubno = P.pubno
WHERE p.pubname = '멀티캠출판사';

--4.도서가격이 30000원 이상인 도서를 주문한 고객의 고객명, 도서명, 도서가격, 주문수량 출력
SELECT c.clientname, b.bookname, B.bookprice, BS.bsqty
FROM book B, client C, booksale BS
WHERE b.bookno = bs.bookno
       AND c.clientno = bs.clientno
       AND b.bookprice >= 30000;
-- INNER JOIN 사용한 식
SELECT c.clientname, b.bookname, B.bookprice, BS.bsqty
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN client C ON c.clientno = bs.clientno
WHERE b.bookprice >= 30000;

--5.'안드로이드 프로그래밍' 도서를 구매한 고객에 대하여 도서명, 고객명, 성별, 주소 출력(고객명으로 오름차순 정렬)
SELECT b.bookname, c.clientname, c.clientgender, c.clientaddress
FROM book B, client C, booksale BS
WHERE b.bookno = bs.bookno
       AND c.clientno = bs.clientno
       AND b.bookname = '안드로이드 프로그래밍'
ORDER BY C.clientName ASC;  -- 생략 가능
-- INNER JOIN 사용한 식
SELECT b.bookname, c.clientname, c.clientgender, c.clientaddress
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN client C ON c.clientno = bs.clientno
WHERE b.bookname = '안드로이드 프로그래밍'
ORDER BY C.clientName;

--6.'도서출판 멀티'에서 출간된 도서 중 판매된 도서에 대하여 총 매출액 출력
SELECT SUM((b.bookprice * BS.bsqty)) AS "총 매출액"
FROM book B, publisher P, booksale BS
WHERE b.bookno = bs.bookno
       AND b.pubno = p.pubno
       AND  p.pubname = '도서출판 멀티';
-- INNER JOIN 사용한 식
SELECT SUM((b.bookprice * BS.bsqty)) AS "총 매출액"
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN publisher P ON b.pubno = p.pubno
WHERE p.pubname = '도서출판 멀티';

--7.'서울 출판사'에서 출간된 도서에 대하여 판매일, 도서명, 도서가격, 주문수량, 판매액 출력
SELECT bs.bsdate, b.bookname, b.bookprice, bs.bsqty, (b.bookprice * BS.bsqty) AS "판매액"
FROM book B, publisher P, booksale BS
WHERE b.bookno = bs.bookno
       AND b.pubno = p.pubno
       AND  p.pubname = '서울 출판사';
-- INNER JOIN 사용한 식
SELECT bs.bsdate, b.bookname, b.bookprice, bs.bsqty, (b.bookprice * BS.bsqty) AS "판매액"
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN publisher P ON b.pubno = p.pubno 
WHERE p.pubname = '서울 출판사';

--8.판매된 도서에 대하여 도서별로 도서번호, 도서명, 총 주문 수량 출력
SELECT b.bookno, b.bookname, SUM(bs.bsqty) AS "총 주문 수량"
FROM book B, booksale BS
WHERE b.bookno = bs.bookno
GROUP BY b.bookno, b.bookname;
-- INNER JOIN 사용한 식
SELECT b.bookno, b.bookname, SUM(bs.bsqty) AS "총 주문 수량"
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
GROUP BY b.bookno, b.bookname;

--9.판매된 도서 중 '서울 출판사'에서 출간된 도서에 대하여 고객명, 주문일, 도서명, 주문수량 출력(고객명으로 오름차순)
SELECT c.clientname, bs.bsdate, b.bookname, bs.bsqty
FROM book B, publisher P, booksale BS, client C
WHERE b.bookno = bs.bookno
        AND c.clientno = bs.clientno
        AND b.pubno = p.pubno
        AND p.pubname = '서울 출판사'
ORDER BY C.clientName;
-- INNER JOIN 사용한 식
SELECT c.clientname, bs.bsdate, b.bookname, bs.bsqty
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN publisher P ON b.pubno = p.pubno
INNER JOIN client C ON c.clientno = bㄴs.clientno
WHERE p.pubname = '서울 출판사'
ORDER BY C.clientName;

--10.판매된 도서에 대하여 고객별로 고객명, 총구매액 출력(총구매액이 100000원 이상인 경우만 해당)
SELECT c.clientname, SUM(bs.bsqty * B.bookprice) AS "총구매액"
FROM booksale BS, book B, client C
WHERE b.bookno = bs.bookno
        AND c.clientno = bs.clientno
GROUP BY c.clientno, C.clientname
HAVING SUM(bs.bsqty * B.bookprice) >= 100000;   -- GROUP BY로 각 행마다 계산된 결과이기 때문에 WHERE로 사용 불가
-- INNER JOIN 사용한 식
SELECT c.clientname, SUM(bs.bsqty * B.bookprice) AS "총구매액"
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN client C ON c.clientno = bs.clientno
GROUP BY c.clientno, c.clientname
HAVING SUM(bs.bsqty * B.bookprice) >= 100000;   -- HAVING 뒤에는 집계함수 원형이 와야함!! (열 이름은 올 수 없음)
