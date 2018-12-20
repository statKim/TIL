/*DML*/
-- 값 추가 (행 추가)
INSERT INTO book (bookNo, bookName, bookPrice, bookDate, pubNo)
VALUES ('4','자바스크립트',23000,'2018-03-17','1');

SELECT * FROM book;

-- 모든 열에 데이터를 삽입할 경우에는 열 이름 생략 가능(열 위치와 데이터 타입을 모두 맞췄을 때 가능)
INSERT INTO book
VALUES ('5','C++스크립트',25000,'2017-10-15','1');

SELECT * FROM book;

/*EX3*/
INSERT INTO student (stdNo, stdName, stdYear, stdBirthday, dptNo)
VALUES ('2017004','박지성',2,'2018-0510','2');
INSERT INTO student (stdNo, stdName, stdYear, stdBirthday, dptNo)
VALUES ('2018005','손흥민',1,'2019-08-18','3');

SELECT * FROM student;

-- 데이터 임포트 (product.txt)
SELECT * FROM product;


