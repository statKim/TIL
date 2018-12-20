-- SUM() : �հ�

-- ���� ���̺��� �� ��� ���� ����Ͽ� ���
-- �� �̸� ���� ���ո� ���
SELECT SUM(bookstock) FROM book;

-- �� �̸� "sum of bookStock" �� ��� ���� ����Ͽ� ���
SELECT SUM(bookstock) AS "sum of bookStock" -- �̸� ������ ���� ū����ǥ��!!
FROM book;

-- �� �̸����� �ѱ۵� ����
SELECT SUM(bookstock) AS "�� ���"
FROM book;

-- �����Ǹ� ���̺���
-- ����ȣ 2�� ȣ���ΰ� �ֹ��� ������ �� �ֹ� ���� ����Ͽ� ���
SELECT SUM(bsQty) AS "�� �ֹ� ����"
FROM booksale
WHERE clientno = '2';

-- �����Ǹ� ���̺��� �ִ�/�ּ� �ֹ���
SELECT MAX(bsQty) AS "�ִ� �ֹ���", MIN(bsQty) AS "�ּ� �ֹ���"
FROM booksale;

-- ���� ���̺��� ������ ���� �Ѿ�, ��� ����, �ְ�, ������ ���
SELECT SUM(bookprice) AS "���� �Ѿ�",
        AVG(bookprice) AS "��հ���",
        MAX(bookprice) AS "�ְ�",
        MIN(bookprice) AS "������"
FROM book;

-- �� �̸��� ������ ��� ���� ������ "" ��� ��
SELECT SUM(bookprice) AS "���� �Ѿ�",
        AVG(bookprice) AS ��հ���,
        MAX(bookprice) AS �ְ�,
        MIN(bookprice) AS ������
FROM book;

-- �����Ǹ� ���̺��� ���� �Ǹ� �Ǽ� ���(��� ���� ��)
SELECT COUNT(*) AS "�� �Ǹ� �Ǽ�" FROM booksale;

-- �� ���̺��� �� �� ��(��� ���� ��)
SELECT COUNT(*) AS "�� �� ��" FROM client;

-- �� ���̺��� �� ��� ���� ���(NULL ���� ����)
SELECT COUNT(clientHobby) AS "���" FROM client;

-- GROUP BY
-- �����Ǹ� ���̺��� ��ǰ��ȣ���� �ֹ����� �հ� ���
SELECT bookNo, SUM(bsQty) AS "�ֹ��� �հ�"
FROM bookSale
GROUP BY bookNo;

-- HAVING ��
-- ���� ���̺��� ������ 25000�� �̻��� ������ ���Ͽ�
-- ���ǻ纰�� ���� �� �հ� ���, ��, '���� �� �հ�'�� 2 �̻�
SELECT pubNo, COUNT(*) AS "���� �� �հ�"
FROM book
WHERE bookprice >= 25000
GROUP BY pubno
HAVING COUNT(*) >= 2;

/*EX*/
--1.���� ���̺��� ���� ������ �������� �����Ͽ�, ������, ����, ���� ���
--  (������ ������ ���� ������ �������� ����)
SELECT bookname, bookauthor, bookprice
FROM book
ORDER BY bookprice DESC, bookauthor ASC;

--2. ���� ���̺��� ���ڿ� '�浿'�� ���� ������ �� ��� ���� ����Ͽ� ���
SELECT SUM(bookstock) AS "�� ��� ����"
FROM book
WHERE bookauthor LIKE '%�浿%';

--3. ���� ���̺��� '���� ���ǻ�' ���� �� �ְ��� ������ ���
SELECT MAX(bookprice) AS "�ְ�", MIN(bookprice) AS "������"
FROM book
WHERE pubno = '1';

--4. ���� ���̺��� ���ǻ纰�� �� ��� ������ ��� ��� ���� ����Ͽ� ���
SELECT pubno AS "���ǻ�",
        SUM(bookstock) AS "�� ��� ����",
       --AVG(bookstock) AS "��� ��� ����"
       --CAST(AVG(bookstock) AS NUMBER(5,2)) AS "��� ��� ����"   -- �Ҽ��� �ٿ���(�� ��ȯ �Լ�)
       --ROUND(AVG(bookstock)) AS "��� ��� ����"  -- ������ ǥ��
       ROUND(AVG(bookstock),2) AS "��� ��� ����"    -- �Ҽ� ��°�ڸ�����
       -- CEIL() : �ø�, FLOOR() : ����
FROM book
GROUP BY pubno;

--5. �����Ǹ� ���̺��� ������ �� �ֹ� ������ �� �ֹ� �Ǽ� ���, �� �ֹ� �Ǽ��� 2�̻��� ���� �ش�
SELECT clientno AS "��",
        SUM(bsqty) AS "�� �ֹ� ����",
        COUNT(*) AS "�� �ֹ� �Ǽ�"   -- clientNo���� COUNT��
FROM booksale
GROUP BY clientno
HAVING COUNT(*) >= 2;


