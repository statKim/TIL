CREATE TABLE product(
    prdNo VARCHAR(10) NOT NULL PRIMARY KEY,
    prdName VARCHAR(30) NOT NULL,
    prdPrice NUMBER(8),
    prdCompany VARCHAR(30)
);

/*
    ���ǻ� ���̺� ����(���ǻ��ȣ, ���ǻ��)
    ��������
    - pubName�� NOT NULL�� ����
    - primary key�� pubNo ����, NOT NULL
*/

CREATE TABLE publisher(
    pubNo VARCHAR(10) NOT NULL PRIMARY KEY,
    pubName VARCHAR(30) NOT NULL
);

/*
    ���� ���̺� ���� (������ȣ, ������, ����, ������, ���ǻ��ȣ)
    ��������
    - bookPrice�� �⺻�� 10000, 1000���� ũ�� ����
    - primary key�� bookNo ����, NOT NULL
    - foreign key�� pubNo (���� ���̺�� �⺻Ű ����)
*/

CREATE TABLE book(
    bookNo VARCHAR(10) NOT NULL PRIMARY KEY,
    bookName VARCHAR(30) NOT NULL,
    bookPrice NUMBER(8) DEFAULT 10000 CHECK(bookPrice > 1000),
    bookDate DATE,
    pubNo VARCHAR(10) NOT NULL,
    FOREIGN KEY (pubNo) REFERENCES publisher (pubNo) /*book�� pubNo�� foreign key�� ����(��, publisher�� pubNo���� �����Ѵ�)*/
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


