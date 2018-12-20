/* PL/SQL */

SET SERVEROUTPU ON; --화면 출력 허용(접속 연결 동안 1회 수행)
DECLARE -- 선언
    NAME VARCHAR(10);
    AGE NUMBER(3);
BEGIN
    NAME := '홍길동';
    AGE := 23;
    DBMS_OUTPUT.PUT_LINE(NAME);
    DBMS_OUTPUT.PUT_LINE(AGE);
END;

--IF 문
DECLARE
    BOOKSTOCK NUMBER(3);
BEGIN
    SELECT bookStock INTO BOOKSTOCK FROM BOOK WHERE bookNo = '1003';
    DBMS_OUTPUT.PUT_LINE(BOOKSTOCK);
    
    IF BOOKSTOCK >= 7 THEN
        DBMS_OUTPUT.PUT_LINE('재고 수준 위험');
    ELSE
        DBMS_OUTPUT.PUT_LINE('재고 수준 보통');
    END IF;
END;

--CASE 문
SELECT clientName, SUM(bookPrice * bsQty) AS "총 주문액",
    CASE
        WHEN SUM(bookPrice * bsQty) >= 200000 THEN '최우수'
        WHEN SUM(bookPrice * bsQty) >= 100000 THEN '우수'
        WHEN SUM(bookPrice * bsQty) >= 50000 THEN '일반'
        ELSE '관심고객'
    END AS "고객등급"
FROM bookSale, client, book
WHERE client.clientNo = bookSale.clientNo
        AND book.bookNo = bookSale.bookNo
GROUP BY client.clientNo, clientName;

