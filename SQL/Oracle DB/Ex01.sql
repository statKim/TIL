CREATE TABLE product(
    prdNo VARCHAR(10) NOT NULL PRIMARY KEY,
    prdName VARCHAR(30) NOT NULL,
    prdPrice NUMBER(8),
    prdCompany VARCHAR(30)
);

/*
    출판사 테이블 생성(출판사번호, 출판사명)
    제약조건
    - pubName을 NOT NULL로 설정
    - primary key로 pubNo 지정, NOT NULL
*/

CREATE TABLE publisher(
    pubNo VARCHAR(10) NOT NULL PRIMARY KEY,
    pubName VARCHAR(30) NOT NULL
);

/*
    도서 테이블 생성 (도서번호, 도서명, 가격, 발행일, 출판사번호)
    제약조건
    - bookPrice를 기본값 10000, 1000보다 크게 지정
    - primary key로 bookNo 지정, NOT NULL
    - foreign key로 pubNo (참조 테이블과 기본키 지정)
*/

CREATE TABLE book(
    bookNo VARCHAR(10) NOT NULL PRIMARY KEY,
    bookName VARCHAR(30) NOT NULL,
    bookPrice NUMBER(8) DEFAULT 10000 CHECK(bookPrice > 1000),
    bookDate DATE,
    pubNo VARCHAR(10) NOT NULL,
    FOREIGN KEY (pubNo) REFERENCES publisher (pubNo) /*book의 pubNo를 foreign key로 지정(즉, publisher의 pubNo열을 참조한다)*/
);

/*Ex1*/
CREATE TABLE department(
    dptNo VARCHAR(10) NOT NULL PRIMARY KEY,
    dptName VARCHAR(30) NOT NULL
);

CREATE TABLE student(
    stdNo VARCHAR(10) NOT NULL PRIMARY KEY,
    stdName VARCHAR(30) NOT NULL,
    stdYear NUMBER(1) DEFAULT 3 CHECK(stdYear >=1 AND stdYear <= 4),
    stdBirthDay DATE,
    dptNo VARCHAR(10) NOT NULL,
    FOREIGN KEY (dptNO) REFERENCES department (dptNo)
);


