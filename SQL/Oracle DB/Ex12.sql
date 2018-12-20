-- �μ�����
-- �� ȣ���ΰ� �ֹ��� �� �ֹ����� ���
--1.client ���̺��� 'ȣ����'�� clientNo�� ã�Ƽ�
--2.bookSale ���̺��� �� clientNo�� �ش�Ǵ� �ֹ����� ����
SELECT SUM(bsQty) AS "�� �ֹ�����"
FROM bookSale
WHERE clientNo = (SELECT clientNo
                    FROM client
                    WHERE clientName = 'ȣ����');
--2�� ���̺��� �����Ͽ� �˻��� ��� (��� ����)
SELECT SUM(BS.bsQty) AS "�� �ֹ�����"
FROM bookSale BS, client C
WHERE C.clientNo = BS.clientNo
        AND clientName = 'ȣ����';
        
-- ���� ��� ������ ������� ���� ���
-- 1. MAX() ������ ã�Ƽ�, 2. �ش� ������ ������� ���� ���
SELECT bookName, bookPrice
FROM book
WHERE bookPrice = (SELECT MAX(bookprice)
                    FROM book);
                    
-- ������ ������ ���� �ִ� ���� ���� ���
-- �μ� ����(SUB QUERY) ����Ͽ� �˻�
--1. bookSale�� �ִ� clientNo�� ��� ������ ��
--2. �� clientNo �� �ش�Ǵ� ���� ���
SELECT clientName
FROM client
WHERE clientNo IN (SELECT clientNo  -- ��ȯ ���� �������� ��쿡�� "="�� �ƴ� "IN" ���!!!
                    FROM bookSale);
                    
-- �������� '�ȵ���̵� ���α׷���'�� ������ ������ ���� ���� ���
-- subquery ����Ͽ� �˻�
--1. book ���̺��� '�ȵ���̵� ���α׷���'�� bookNo ã�Ƽ�
--2. bookSale ���̺��� �� bookNo�� ������ ���� clientNo ã��
--3. client ���̺��� �� clientNo�� �ش�Ǵ� ���� ã�Ƽ� ���
SELECT clientName
FROM client
WHERE clientNo IN (SELECT clientNo                  -- ���⼭�� "="���� �ٲ� �� ����!!
                    FROM bookSale
                    WHERE bookNo IN (SELECT bookNo  -- ���⼭�� �� �ϳ� ���� => "IN" ��� "=" ����ص� ��
                                        FROM book
                                        WHERE bookName = '�ȵ���̵� ���α׷���'));
                                        
-- ��Į�� �μ� ���� ��
-- ������ �� �ֹ� ���� ���
SELECT clientNo, (SELECT clientName     -- ���� ����ؼ� GROUP BY�� ���� �׿� �ش��ϴ� �͵��� ��Ī���Ѽ� ���
                    FROM client
                    WHERE client.clientNo = bookSale.clientNo), SUM(bsQty)
FROM bookSale
GROUP BY clientNo;

-- ������ �� �ֹ� ���� ���
-- �� �̸� ����
SELECT clientNo, (SELECT clientName
                    FROM client
                    WHERE client.clientNo = bookSale.clientNo), SUM(bsQty) AS "�� �ֹ� ����"
FROM bookSale
GROUP BY clientNo;

--�ζ��� �� �μ� ���� ��
--���������� 25000�� �̻��� ������ ���Ͽ�
--�������� ������, ��������, �� �Ǹ� ����, �� �Ǹž� ���
SELECT bookName, bookPrice, SUM(bsQty) AS "�� �Ǹ� ����", SUM(bookPrice * bsQty) AS "�� �Ǹž�"
FROM (SELECT bookNo, bookName, bookPrice        -- book ���̺��� (~~)���� �������� ����� ���� book���̺��� ����ϰڴ�! 
        FROM book
        WHERE bookPrice >= 25000) book, bookSale
WHERE book.bookno = booksale.bookno
GROUP BY book.bookno, bookName, bookPrice;

--��ø ���� �� : �� ������
--1.������ ��� ���ݺ��� ������ ū ������ ���ؼ�
--2.������, ���� ���
SELECT bookName, bookPrice
FROM book
WHERE bookPrice > (SELECT AVG(bookPrice)
                    FROM book);

--���� : ��� ���� ����
SELECT AVG(bookPrice) AS "��� ���� ����"
FROM book;

--��ø ���� �� : EXISTS
--��õ�� �����ϴ� ������ �Ǹ��� ������ �� �Ǹŷ� ���
--1.��õ�� �����ϴ� ���� clientNo ã�Ƽ�
--2.�� clientNo�� ������ bsQty ����
SELECT SUM(bsQty) AS "�� �Ǹŷ�"
FROM bookSale
WHERE EXISTS (SELECT clientno       -- true/false ��ȯ => WHERE EXISTS (TRUE)�̸� SELECT�ϰڴ�
                FROM client
                WHERE clientAddress LIKE '%��õ%'
                    AND client.clientNo = bookSale.clientNo);
--IN ���(��� ����)
SELECT SUM(bsQty) AS "�� �Ǹŷ�"
FROM bookSale
WHERE clientNo IN (SELECT clientno
                    FROM client
                    WHERE clientAddress LIKE '%��õ%');
                    
--��ø ���� �� : NOT EXISTS
--�� ���� �Ǹŵ��� ���� ���� �˻�
SELECT bookNo, bookName, bookAuthor, bookPrice
FROM book
WHERE NOT EXISTS (SELECT *
                    FROM bookSale
                    WHERE book.bookNo = bookSale.bookNo);
--NOT IN ���(��� ����)
SELECT bookNo, bookName, bookAuthor, bookPrice
FROM book
WHERE bookNo NOT IN (SELECT bookNo
                    FROM bookSale);
                    
--��ø ���� �� : NOT IN
--���￡ �������� �ʴ� ������ �Ǹ��ѵ����� �� �Ǹŷ� ���
SELECT SUM(bsQty) AS "�� �Ǹŷ�"
FROM bookSale
WHERE clientNo NOT IN (SELECT clientno
                        FROM client
                         WHERE clientAddress LIKE '%����%');
--NOT EXISTS ��� : ���� ���
SELECT SUM(bsQty) AS "�� �Ǹŷ�"
FROM bookSale
WHERE NOT EXISTS (SELECT clientno
                    FROM client
                    WHERE clientAddress LIKE '%����%'
                        AND client.clientNo = bookSale.clientNo);

--��ø ���� �� : ALL - ��� ������ Ŀ����(�� �ִ밪���� Ŀ����)
--2�� ���� �ֹ��� ������ �ְ� �ֹ��������� �� ���� ������ ������ ���� ����ȣ, �ֹ���ȣ, �ֹ����� ���
--(2�� ���� �ֹ��� ��� �ֹ����� �߻��� �ֹ��������� �� ũ�� ��)
SELECT clientNo, bsNo, bsQty
FROM bookSale
WHERE bsQty > ALL (SELECT bsQty
                    FROM bookSale
                    WHERE clientNo = '2');
                    
--��ø ���� �� : ANY - �� �� �ϳ����� ũ�� ��(�� �ּҰ����� ũ�⸸ �ϸ� ��)
--2�� ���� �ֹ��� ������ �� ���̶� �� ���� ������ ������ ���� ����ȣ, �ֹ���ȣ, �ֹ����� ���
--(�ּ� �� ���̶� ũ�� ��)
SELECT clientNo, bsNo, bsQty        -- 2���� �ϳ� ���Ե�
FROM bookSale
WHERE bsQty > ANY (SELECT bsQty
                    FROM bookSale
                    WHERE clientNo = '2');
--���� : 2�� �� �ڽ��� ����
SELECT clientNo, bsNo, bsQty
FROM bookSale
WHERE bsQty > ANY (SELECT bsQty
                    FROM bookSale
                    WHERE clientNo = '2')
            AND clientNo != '2';

/*EX ��ø ���� ���*/
--1.ȣ����(����)�� �ֹ��� ������ �� ���ŷ� ���
SELECT SUM(bsQty) AS "�� ���ŷ�"
FROM bookSale
WHERE clientNo IN (SELECT clientNo
                    FROM client
                    WHERE clientName = 'ȣ����');

--2.'��Ƽķ���ǻ�'���� �Ⱓ�� ������ ������ ���� �ִ� ���� ���
SELECT clientName
FROM client
WHERE clientNo IN (SELECT clientNo
                    FROM booksale
                    WHERE bookno IN (SELECT bookno
                                    FROM book
                                    WHERE pubNo = (SELECT pubNo
                                                    FROM publisher
                                                    WHERE pubName = '��Ƽķ���ǻ�')));

--3.������ �ֹ��� ������ �ְ� �ֹ��������� �� ���� ������ ������ ���� ���
SELECT clientname
FROM client
WHERE clientNo IN (SELECT clientNo
                    FROM bookSale
                    WHERE bsQty > ALL (SELECT bsQty
                                        FROM booksale
                                        WHERE clientno = (SELECT clientno
                                                            FROM client
                                                            WHERE clientName = '����')));

--4.��õ�� �����ϴ� ������ �Ǹ��� ������ �� ���� ���
SELECT SUM(bookStock * bookPrice) AS "�� ����"
FROM book
WHERE bookNo IN (SELECT bookNo
                    FROM bookSale
                    WHERE clientNo IN (SELECT clientNo
                                        FROM client
                                        WHERE clientAddress LIKE '%��õ%'));
