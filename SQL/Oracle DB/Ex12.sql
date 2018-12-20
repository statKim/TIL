-- 부속질의
-- 고객 호날두가 주문한 총 주문수량 출력
--1.client 테이블에서 '호날두'의 clientNo를 찾아서
--2.bookSale 테이블에서 이 clientNo에 해당되는 주문수량 총합
SELECT SUM(bsQty) AS "총 주문수량"
FROM bookSale
WHERE clientNo = (SELECT clientNo
                    FROM client
                    WHERE clientName = '호날두');
--2개 테이블을 조인하여 검색한 경우 (결과 동일)
SELECT SUM(BS.bsQty) AS "총 주문수량"
FROM bookSale BS, client C
WHERE C.clientNo = BS.clientNo
        AND clientName = '호날두';
        
-- 가장 비싼 도서의 도서명과 가격 출력
-- 1. MAX() 도서를 찾아서, 2. 해당 도서의 도서명과 가격 출력
SELECT bookName, bookPrice
FROM book
WHERE bookPrice = (SELECT MAX(bookprice)
                    FROM book);
                    
-- 도서를 구매한 적이 있는 고객의 고객명 출력
-- 부속 질의(SUB QUERY) 사용하여 검색
--1. bookSale에 있는 clientNo는 모두 구매한 고객
--2. 이 clientNo 에 해당되는 고객명 출력
SELECT clientName
FROM client
WHERE clientNo IN (SELECT clientNo  -- 반환 값이 여러개일 경우에는 "="이 아닌 "IN" 사용!!!
                    FROM bookSale);
                    
-- 도서명이 '안드로이드 프로그래밍'인 도서를 구매한 고객의 고객명 출력
-- subquery 사용하여 검색
--1. book 테이블에서 '안드로이드 프로그래밍'의 bookNo 찾아서
--2. bookSale 테이블에서 이 bookNo를 구매한 고객의 clientNo 찾고
--3. client 테이블에서 이 clientNo에 해당되는 고객명 찾아서 출력
SELECT clientName
FROM client
WHERE clientNo IN (SELECT clientNo                  -- 여기서는 "="으로 바꿀 수 없음!!
                    FROM bookSale
                    WHERE bookNo IN (SELECT bookNo  -- 여기서는 값 하나 나옴 => "IN" 대신 "=" 사용해도 됨
                                        FROM book
                                        WHERE bookName = '안드로이드 프로그래밍'));
                                        
-- 스칼라 부속 질의 예
-- 고객별로 총 주문 수량 출력
SELECT clientNo, (SELECT clientName     -- 열을 출력해서 GROUP BY에 의해 그에 해당하는 것들을 매칭시켜서 출력
                    FROM client
                    WHERE client.clientNo = bookSale.clientNo), SUM(bsQty)
FROM bookSale
GROUP BY clientNo;

-- 고객별로 총 주문 수량 출력
-- 열 이름 지정
SELECT clientNo, (SELECT clientName
                    FROM client
                    WHERE client.clientNo = bookSale.clientNo), SUM(bsQty) AS "총 주문 수량"
FROM bookSale
GROUP BY clientNo;

--인라인 뷰 부속 질의 예
--도서가격이 25000원 이상인 도서에 대하여
--도서별로 도서명, 도서가격, 총 판매 수량, 총 판매액 출력
SELECT bookName, bookPrice, SUM(bsQty) AS "총 판매 수량", SUM(bookPrice * bsQty) AS "총 판매액"
FROM (SELECT bookNo, bookName, bookPrice        -- book 테이블을 (~~)안의 조건으로 사이즈를 줄인 book테이블을 사용하겠다! 
        FROM book
        WHERE bookPrice >= 25000) book, bookSale
WHERE book.bookno = booksale.bookno
GROUP BY book.bookno, bookName, bookPrice;

--중첩 질의 예 : 비교 연산자
--1.도서의 평균 가격보다 가격이 큰 도서에 대해서
--2.도서명, 가격 출력
SELECT bookName, bookPrice
FROM book
WHERE bookPrice > (SELECT AVG(bookPrice)
                    FROM book);

--참고 : 평균 도서 가격
SELECT AVG(bookPrice) AS "평균 도서 가격"
FROM book;

--중첩 질의 예 : EXISTS
--인천에 거주하는 고객에게 판매한 도서의 총 판매량 출력
--1.인천에 거주하는 고객의 clientNo 찾아서
--2.이 clientNo가 구매한 bsQty 총합
SELECT SUM(bsQty) AS "총 판매량"
FROM bookSale
WHERE EXISTS (SELECT clientno       -- true/false 반환 => WHERE EXISTS (TRUE)이면 SELECT하겠다
                FROM client
                WHERE clientAddress LIKE '%인천%'
                    AND client.clientNo = bookSale.clientNo);
--IN 사용(결과 동일)
SELECT SUM(bsQty) AS "총 판매량"
FROM bookSale
WHERE clientNo IN (SELECT clientno
                    FROM client
                    WHERE clientAddress LIKE '%인천%');
                    
--중첩 질의 예 : NOT EXISTS
--한 번도 판매되지 않은 도서 검색
SELECT bookNo, bookName, bookAuthor, bookPrice
FROM book
WHERE NOT EXISTS (SELECT *
                    FROM bookSale
                    WHERE book.bookNo = bookSale.bookNo);
--NOT IN 사용(결과 동일)
SELECT bookNo, bookName, bookAuthor, bookPrice
FROM book
WHERE bookNo NOT IN (SELECT bookNo
                    FROM bookSale);
                    
--중첩 질의 예 : NOT IN
--서울에 거주하지 않는 고객에게 판매한도서의 총 판매량 출력
SELECT SUM(bsQty) AS "총 판매량"
FROM bookSale
WHERE clientNo NOT IN (SELECT clientno
                        FROM client
                         WHERE clientAddress LIKE '%서울%');
--NOT EXISTS 사용 : 동일 결과
SELECT SUM(bsQty) AS "총 판매량"
FROM bookSale
WHERE NOT EXISTS (SELECT clientno
                    FROM client
                    WHERE clientAddress LIKE '%서울%'
                        AND client.clientNo = bookSale.clientNo);

--중첩 질의 예 : ALL - 모든 값보다 커야함(즉 최대값보다 커야함)
--2번 고객이 주문한 도서의 최고 주문수량보다 더 많은 도서를 구입한 고객의 고객번호, 주문번호, 주문수량 출력
--(2번 고객이 주문한 모든 주문에서 발생한 주문수량보다 더 크면 됨)
SELECT clientNo, bsNo, bsQty
FROM bookSale
WHERE bsQty > ALL (SELECT bsQty
                    FROM bookSale
                    WHERE clientNo = '2');
                    
--중첩 질의 예 : ANY - 값 중 하나보다 크면 됨(즉 최소값보다 크기만 하면 됨)
--2번 고객이 주문한 도서의 한 번이라도 더 많은 도서를 구입한 고객의 고객번호, 주문번호, 주문수량 출력
--(최소 한 번이라도 크면 됨)
SELECT clientNo, bsNo, bsQty        -- 2번도 하나 포함됨
FROM bookSale
WHERE bsQty > ANY (SELECT bsQty
                    FROM bookSale
                    WHERE clientNo = '2');
--참고 : 2번 고객 자신은 빼고
SELECT clientNo, bsNo, bsQty
FROM bookSale
WHERE bsQty > ANY (SELECT bsQty
                    FROM bookSale
                    WHERE clientNo = '2')
            AND clientNo != '2';

/*EX 중첩 질의 사용*/
--1.호날두(고객명)가 주문한 도서의 총 구매량 출력
SELECT SUM(bsQty) AS "총 구매량"
FROM bookSale
WHERE clientNo IN (SELECT clientNo
                    FROM client
                    WHERE clientName = '호날두');

--2.'멀티캠출판사'에서 출간한 도서를 구매한 적이 있는 고객명 출력
SELECT clientName
FROM client
WHERE clientNo IN (SELECT clientNo
                    FROM booksale
                    WHERE bookno IN (SELECT bookno
                                    FROM book
                                    WHERE pubNo = (SELECT pubNo
                                                    FROM publisher
                                                    WHERE pubName = '멀티캠출판사')));

--3.베컴이 주문한 도서의 최고 주문수량보다 더 많은 도서를 구매한 고객명 출력
SELECT clientname
FROM client
WHERE clientNo IN (SELECT clientNo
                    FROM bookSale
                    WHERE bsQty > ALL (SELECT bsQty
                                        FROM booksale
                                        WHERE clientno = (SELECT clientno
                                                            FROM client
                                                            WHERE clientName = '베컴')));

--4.인천에 거주하는 고객에거 판매한 도서의 총 재고액 출력
SELECT SUM(bookStock * bookPrice) AS "총 재고액"
FROM book
WHERE bookNo IN (SELECT bookNo
                    FROM bookSale
                    WHERE clientNo IN (SELECT clientNo
                                        FROM client
                                        WHERE clientAddress LIKE '%인천%'));
