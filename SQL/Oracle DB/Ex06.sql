-- ���ǻ� ���̺� ����
CREATE TABLE publisher(
    pubNo VARCHAR(10) NOT NULL PRIMARY KEY,
    pubName VARCHAR(20) NOT NULL
);

-- ���� ���̺� ����
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

-- �� ���̺� ����
CREATE TABLE client(
    clientNo VARCHAR(10) NOT NULL PRIMARY KEY,
    clientName VARCHAR(30),
    clientPhone VARCHAR(13),
    clientAddress VARCHAR(50),
    clientBirth DATE,
    clientHobby VARCHAR(20),
    clientGender VARCHAR(3)
);

-- �����Ǹ� ���̺� ����
CREATE TABLE bookSale(
    bsNo VARCHAR(10) NOT NULL PRIMARY KEY,
    bsDate DATE,
    bsQty NUMBER(3),
    clientNo VARCHAR(10) NOT NULL,
    FOREIGN KEY (clientNo) REFERENCES client (clientNo),
    bookNo VARCHAR(10) NOT NULL,
    FOREIGN KEY (bookNo) REFERENCES book (bookNo)
);

--publisher ���̺� ������ ����
INSERT INTO publisher(pubNo, pubName) VALUES ('1', '���� ���ǻ�');
INSERT INTO publisher(pubNo, pubName) VALUES ('2', '�������� ��Ƽ');
INSERT INTO publisher(pubNo, pubName) VALUES ('3', '��Ƽķ���ǻ�');

SELECT * FROM publisher;

--book ���̺� ������ ����
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1001', '�����ͺ��̽� �̷�', 'ȫ�浿', 22000, '2017-11-11', 5, '3');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1002', '�ڹ� ���α׷���', '�̸���', 25000, '2016-12-12', 4, '1');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1003', '���ͳ����α׷���', '������', 30000, '2018-02-10', 10, '2');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1004', '�ȵ���̵� ���α׷���', '���е�', 23000, '2016-10-10', 2, '1');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1005', '�ȵ���̵� ��', '���浿' , 26000, '2017-01-11', 5, '2');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1006', 'Oracle 11g XE', '������', 35000, '2018-03-25', 7, '3');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1007', 'HTML / CSS', '��ȫ��', 18000, '2015-05-30', 3, '1');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1008', '���̽� �Թ�', '������', 20000, '2014-12-12', 5, '1');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1009', '�ȵ���̵� ���� ����', '���浿', 33000, '2016-10-31', 5, '2');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1010', 'C++��ü���� ���α׷���', '�⼺��', 24000, '2015-04-20', 2, '3');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1011', 'JSP �� ���α׷���', '�迬��', 27000, '2015-10-23', 8, '1');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1012', '��Ŀ���� ��ŷ ���', '�տ���', 32000, '2016-07-07', 1, '2');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1013', '�ڷᱸ��', 'ȫ�浿', 19000, '2018-01-20', 4, '1');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1014', '�� ��ŷ�� ħ�ػ�� �м�', '������', 35000, '2016-11-25', 5, '2');
INSERT INTO book(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo) 
VALUES ('1015', '�ڹٽ�ũ�� / jQuery', 'ȫ�浿', 27000, '2015-10-22', 2, '2');

SELECT * FROM book;

--client ���̺� ������ ����
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('1', '�޽�', '010-1111-1111', '����', '1987-06-24', '�౸', '��');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('2', 'ȣ����', '010-2222-2222', '��õ', '1984-02-05', '', '��');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('3', '��������', '010-3333-3333', '����', '1987-04-19', '', '��');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('4', '����', '010-4444-4444', '�Ⱦ�', '1975-05-02', '��ȭ', '��');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('5', '���̸���', '010-5555-5555', '����', '1992-02-05', '����', '��');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('6', '��������', '010-6666-6666', '����', '1981-09-26', '�״Ͻ�', '��');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('7', '�ε帮�Խ�', '010-7777-7777', '��õ', '1991-01-07', ' ', '��');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('8', '���', '010-8888-8888', '�λ�', '1982-04-22', '', '��');
INSERT INTO client(clientNo, clientName, clientPhone, clientAddress, clientBirth, clientHobby, clientGender) 
VALUES ('9', '���Ʒ���', '010-9999-9999', '����', '1985-10-24', '���', '��');

SELECT * FROM client;

--bookSale ���̺� ������ ����
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