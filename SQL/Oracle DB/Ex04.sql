-- UPDATE 문
-- 상품번호가 5인 튜플의 prdName을 'UHD TV'로 수정
UPDATE product SET prdName='UHD TV' WHERE prdNo='5';

SELECT * FROM product;

-- DELETE 문
-- 상품명이 '키보드'인 튜플 삭제
DELETE FROM product WHERE prdName='그늘막 텐트';

/*EX4*/
SELECT * FROM book;

INSERT INTO book (bookNo, bookName, bookPrice, bookDate, pubNo)
VALUES ('6','JSP 웹프로그래밍',30000,'2018-03-10','1');
INSERT INTO book (bookNo, bookName, bookPrice, bookDate, pubNo)
VALUES ('7','파이썬 데이터 과학',24000,'2018-02-05','2');

UPDATE book SET bookprice=22000 WHERE bookname='데이터베이스';

DELETE FROM book WHERE bookdate>='2017-01-01' AND bookdate<='2017-12-31'; --2017년인 데이터 삭제