-- 출판사 테이블 생성
CREATE TABLE publisher(
    pubNo VARCHAR(10) NOT NULL PRIMARY KEY,
    pubName VARCHAR(20) NOT NULL
);

-- 도서 테이블 생성
CREATE TABLE book(
    bookNo VARCHAR(10) NOT NULL PRIMARY KEY,
    bookName VARCHAR(40),
    bookAuthor VARCHAR(30),
    bookPrice NUMBER(8),
    bookDate DATE,
    bookStock NUMBER(3),
    pubNo VARCHAR(10) NOT NULL,
    FOREIGN KEY (pubNo) REFERENCES publisher (pubNo)
);

-- 고객 테이블 생성
CREATE TABLE client(
    clientNo VARCHAR(10) NOT NULL PRIMARY KEY,
    clientName VARCHAR(30),
    clientPhone VARCHAR(13),
    clientAddress VARCHAR(50),
    clientBirth DATE,
    clientHobby VARCHAR(20),
    clientGender VARCHAR(3)
);

-- 도서판매 테이블 생성
CREATE TABLE bookSale(
    bsNo VARCHAR(10) NOT NULL PRIMARY KEY,
    bsDate DATE,
    bsQty NUMBER(3),
    clientNo VARCHAR(10) NOT NULL,
    FOREIGN KEY (clientNo) REFERENCES client (clientNo),
    bookNo VARCHAR(10) NOT NULL,
    FOREIGN KEY (bookNo) REFERENCES book (bookNo)
);

--publisher 테이블 데이터 삽입
INSERT INTO publisher(pubNo, pubName) VALUES ('1', '서울 출판사');
INSERT INTO publisher(pubNo, pubName) VALUES ('2', '도서출판 멀티');
INSERT INTO publisher(pubNo, pubName) VALUES ('3', '멀티캠출판사');

SELECT * FROM publisher;

--book 테이블 데이터 삽입
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1001', '데이터베이스 이론', '홍길동', 22000, '2017-11-11', 5, '3');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1002', '자바 프로그래밍', '이몽룡', 25000, '2016-12-12', 4, '1');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1003', '인터넷프로그래밍', '성춘향', 30000, '2018-02-10', 10, '2');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1004', '안드로이드 프로그래밍', '변학도', 23000, '2016-10-10', 2, '1');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1005', '안드로이드 앱', '강길동' , 26000, '2017-01-11', 5, '2');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1006', 'Oracle 11g XE', '박지성', 35000, '2018-03-25', 7, '3');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1007', 'HTML / CSS', '손홍민', 18000, '2015-05-30', 3, '1');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1008', '파이썬 입문', '류현진', 20000, '2014-12-12', 5, '1');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1009', '안드로이드 게임 제작', '나길동', 33000, '2016-10-31', 5, '2');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1010', 'C++객체지향 프로그래밍', '기성용', 24000, '2015-04-20', 2, '3');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1011', 'JSP 웹 프로그래밍', '김연아', 27000, '2015-10-23', 8, '1');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1012', '해커들의 해킹 기법', '손연재', 32000, '2016-07-07', 1, '2');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1013', '자료구조', '홍길동', 19000, '2018-01-20', 4, '1');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1014', '웹 해킹과 침해사고 분석', '성춘향', 35000, '2016-11-25', 5, '2');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1015', '자바스크립 / jQuery', '홍길동', 27000, '2015-10-22', 2, '2');

SELECT * FROM book;

--client 테이블 데이터 삽입
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('1', '메시', '010-1111-1111', '서울', '1987-06-24', '축구', '남');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('2', '호날두', '010-2222-2222', '인천', '1984-02-05', '', '남');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('3', '샤라포바', '010-3333-3333', '제주', '1987-04-19', '', '여');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('4', '베컴', '010-4444-4444', '안양', '1975-05-02', '영화', '남');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('5', '네이마르', '010-5555-5555', '수원', '1992-02-05', '게임', '남');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('6', '윌리엄스', '010-6666-6666', '서울', '1981-09-26', '테니스', '여');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('7', '로드리게스', '010-7777-7777', '인천', '1991-01-07', ' ', '남');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('8', '살라', '010-8888-8888', '부산', '1982-04-22', '', '남');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('9', '수아레스', '010-9999-9999', '서울', '1985-10-24', '등산', '남');

SELECT * FROM client;

--bookSale 테이블 데이터 삽입
INSERT INTO bookSale(bsNo, bsDate, bsQty, clientNo, bookNo) 
VALUES ('1', '2016-04-05', 2, '3', '1006');
INSERT INTO bookSale(bsNo, bsDate, bsQty, clientNo, bookNo) 
VALUES ('2', '2016-10-11', 1, '7', '1004');
INSERT INTO bookSale(bsNo, bsDate, bsQty, clientNo, bookNo) 
VALUES ('3', '2017-02-20', 5, '2', '1009');
INSERT INTO bookSale(bsNo, bsDate, bsQty, clientNo, bookNo) 
VALUES ('4', '2017-07-10', 4, '1', '1011');
INSERT INTO bookSale(bsNo, bsDate, bsQty, clientNo, bookNo) 
VALUES ('5', '2017-09-09', 2, '2', '1002');
INSERT INTO bookSale(bsNo, bsDate, bsQty, clientNo, bookNo) 
VALUES ('6', '2017-09-09', 2, '4', '1003');
INSERT INTO bookSale(bsNo, bsDate, bsQty, clientNo, bookNo) 
VALUES ('7', '2018-01-16', 2, '2', '1002');
INSERT INTO bookSale(bsNo, bsDate, bsQty, clientNo, bookNo) 
VALUES ('8', '2018-02-02', 9, '7', '1005');
INSERT INTO bookSale(bsNo, bsDate, bsQty, clientNo, bookNo) 
VALUES ('9', '2018-03-25', 1, '8', '1004');

SELECT * FROM bookSale;