/*DML*/
-- �� �߰� (�� �߰�)
INSERT INTO book (bookNo, bookName, bookPrice, bookDate, pubNo)
VALUES ('4','�ڹٽ�ũ��Ʈ',23000,'2018-03-17','1');

SELECT * FROM book;

-- ��� ���� �����͸� ������ ��쿡�� �� �̸� ���� ����(�� ��ġ�� ������ Ÿ���� ��� ������ �� ����)
INSERT INTO book
VALUES ('5','C++��ũ��Ʈ',25000,'2017-10-15','1');

SELECT * FROM book;

/*EX3*/
INSERT INTO student (stdNo, stdName, stdYear, stdBirthday, dptNo)
VALUES ('2017004','������',2,'2018-0510','2');
INSERT INTO student (stdNo, stdName, stdYear, stdBirthday, dptNo)
VALUES ('2018005','�����',1,'2019-08-18','3');

SELECT * FROM student;

-- ������ ����Ʈ (product.txt)
SELECT * FROM product;


