-- UPDATE ��
-- ��ǰ��ȣ�� 5�� Ʃ���� prdName�� 'UHD TV'�� ����
UPDATE product SET prdName='UHD TV' WHERE prdNo='5';

SELECT * FROM product;

-- DELETE ��
-- ��ǰ���� 'Ű����'�� Ʃ�� ����
DELETE FROM product WHERE prdName='�״ø� ��Ʈ';

/*EX4*/
SELECT * FROM book;

INSERT INTO book (bookNo, bookName, bookPrice, bookDate, pubNo)
VALUES ('6','JSP �����α׷���',30000,'2018-03-10','1');
INSERT INTO book (bookNo, bookName, bookPrice, bookDate, pubNo)
VALUES ('7','���̽� ������ ����',24000,'2018-02-05','2');

UPDATE book SET bookprice=22000 WHERE bookname='�����ͺ��̽�';

DELETE FROM book WHERE bookdate>='2017-01-01' AND bookdate<='2017-12-31'; --2017���� ������ ����