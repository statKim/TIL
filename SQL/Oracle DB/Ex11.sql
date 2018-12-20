-- �� ���̶� ������ �ֹ��� ���� ����ȣ�� ���� ���
-- �ߺ��Ǵ� ���� �� ���� ���
-- ����ȣ �������� ����
SELECT UNIQUE c.clientno, c.clientname  -- UNIQUE : �ߺ��Ǵ°� �����ؼ� ��� (DISTINCT�� ����)
FROM client C, booksale BS
WHERE c.clientno = bs.clientno
ORDER BY c.clientno;
-- INNER JOIN ����� ��
SELECT UNIQUE c.clientno, c.clientname
FROM client C
INNER JOIN booksale BS
ON c.clientno = bs.clientno
ORDER BY c.clientno;

-- ������ �ֹ��� ���� �������� �ֹ� ���� ���
SELECT c.clientno, c.clientname, bs.bsno, bs.bsdate, bs.bsqty, bs.bookno
FROM client C, bookSale BS
WHERE C.clientNo = BS.clientNo
ORDER BY c.clientno;
-- INNER JOIN ����� ��
SELECT c.clientno, c.clientname, bs.bsno, bs.bsdate, bs.bsqty, bs.bookno
FROM client C
INNER JOIN bookSale BS
ON C.clientNo = BS.clientNo
ORDER BY c.clientno;

-- ������ �� �ֹ� ���� ����Ͽ�
-- ����� �� �ֹ� ���� ���
-- �� �ֹ� ���� ���� �������� ����
SELECT c.clientno, c.clientname, SUM(BS.bsQty) AS "�� �ֹ� ����" -- BS.bsQty���� BS�� ���� ����(BS���� �ִ� ���̸�)
FROM client C, bookSale BS
WHERE c.clientno = bs.clientno
GROUP BY c.clientno, c.clientname
ORDER BY "�� �ֹ� ����" DESC;
-- INNER JOIN ����� ��
SELECT c.clientno, c.clientname, SUM(BS.bsQty) AS "�� �ֹ� ����" 
FROM client C
INNER JOIN bookSale BS
ON c.clientno = bs.clientno
GROUP BY c.clientno, c.clientname
ORDER BY "�� �ֹ� ����" DESC;

-- ����ȣ ������� �ʰ� ���� ��� ����
SELECT c.clientname, SUM(BS.bsQty) AS "�� �ֹ� ����"
FROM client C, bookSale BS
WHERE c.clientno = bs.clientno
GROUP BY c.clientno, c.clientname
ORDER BY "�� �ֹ� ����" DESC;
-- INNER JOIN ����� ��
SELECT c.clientname, SUM(BS.bsQty) AS "�� �ֹ� ����" 
FROM client C
INNER JOIN bookSale BS
ON c.clientno = bs.clientno
GROUP BY c.clientno, c.clientname
ORDER BY "�� �ֹ� ����" DESC;

-- 3�� ���̺� ���(�ܷ�Ű ���� 2��)
-- �ֹ��� ������ ���Ͽ� �ֹ���, ������, ����, �ֹ� ���� ���
SELECT bs.bsdate, b.bookname, C.clientName, BS.bsQty
FROM client C, bookSale BS, book B
WHERE c.clientno = bs.clientno
    AND b.bookno = bs.bookno;
-- INNER JOIN ����� ��
SELECT bs.bsdate, b.bookname, C.clientName, BS.bsQty
FROM bookSale BS    -- foreing key �ִ� ���̺� INNER JOIN �ؾ���!!!
INNER JOIN client C ON c.clientno = bs.clientno
INNER JOIN book B ON b.bookno = bs.bookno;

-- 3�� ���̺� ��� (�ܷ�Ű ���� 2��)
-- ���� ����� ����ϱ� ���� �� ���
-- �Ǹŵ� ������ �ֹ���, ����, ������, ��������, �ֹ�����, �ֹ��� ����Ͽ� ���
SELECT bs.bsdate, c.clientname, B.bookname, B.bookprice, BS.bsqty, (B.bookprice * bs.bsqty) AS "�ֹ���"
FROM client C, bookSale BS, book B
WHERE c.clientno = bs.clientno AND b.bookno = bs.bookno;
-- INNER JOIN ����� ��
SELECT bs.bsdate, c.clientname, B.bookname, B.bookprice, BS.bsqty, (B.bookprice * bs.bsqty) AS "�ֹ���"
FROM bookSale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN client C ON c.clientno = bs.clientno;

-- "�ֹ���"���� �������� ����
SELECT bs.bsdate, c.clientname, B.bookname, B.bookprice, BS.bsqty, (B.bookprice * bs.bsqty) AS "�ֹ���"
FROM client C, bookSale BS, book B
WHERE c.clientno = bs.clientno AND b.bookno = bs.bookno
ORDER BY "�ֹ���" DESC;
-- INNER JOIN ����� ��
SELECT bs.bsdate, c.clientname, B.bookname, B.bookprice, BS.bsqty, (B.bookprice * bs.bsqty) AS "�ֹ���"
FROM bookSale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN client C ON c.clientno = bs.clientno
ORDER BY "�ֹ���" DESC;

-- 3�� ���̺� ���
-- WHERE ���� ���� �߰�
-- 2017��~���簡�� �Ǹŵ� ������ �ֹ���, ����, ������, ��������, �ֹ�����, �ֹ��� ����Ͽ� ���
SELECT bs.bsdate, c.clientname, B.bookname, B.bookprice, bs.bsqty, (B.bookprice * bs.bsqty) AS "�ֹ���"
FROM booksale BS, client C, book B
WHERE c.clientno = bs.clientno AND b.bookno = bs.bookno
        AND BS.bsDate >= '2017-01-01';

/*EX*/
--1.��� ������ ���Ͽ� ������ ������ȣ, ������, ���ǻ�� ���
SELECT b.bookno, b.bookname, p.pubname
FROM book B, publisher P
WHERE B.pubno = P.pubno;
-- INNER JOIN ����� ��
SELECT b.bookno, b.bookname, p.pubname
FROM book B
INNER JOIN publisher P
ON B.pubno = P.pubno;

--2.'���� ���ǻ�'���� �Ⱓ�� ������ ������, ���ڸ�, ���ǻ�� ���(���ǻ�� ���)
SELECT b.bookname, b.bookauthor, P.pubname
FROM book B, publisher P
WHERE B.pubno = P.pubno 
        AND p.pubname = '���� ���ǻ�';
-- INNER JOIN ����� ��
SELECT b.bookname, b.bookauthor, P.pubname
FROM book B
INNER JOIN publisher P
ON B.pubno = P.pubno --AND p.pubname = '���� ���ǻ�';    -- P�� ����ִ� ���̱� ������ �̻� X
WHERE p.pubname = '���� ���ǻ�';

--3.'��Ƽķ���ǻ�'���� �Ⱓ�� ���� �� �Ǹŵ� ������ ������ ���(�ߺ��� ��� �� ���� ���) (���ǻ�� ���)
SELECT DISTINCT b.bookname
FROM book B, publisher P, booksale BS
WHERE b.bookno = bs.bookno
       AND B.pubno = P.pubno 
       AND p.pubname = '��Ƽķ���ǻ�';
-- INNER JOIN ����� ��
SELECT DISTINCT b.bookname
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN publisher P ON B.pubno = P.pubno
WHERE p.pubname = '��Ƽķ���ǻ�';

--4.���������� 30000�� �̻��� ������ �ֹ��� ���� ����, ������, ��������, �ֹ����� ���
SELECT c.clientname, b.bookname, B.bookprice, BS.bsqty
FROM book B, client C, booksale BS
WHERE b.bookno = bs.bookno
       AND c.clientno = bs.clientno
       AND b.bookprice >= 30000;
-- INNER JOIN ����� ��
SELECT c.clientname, b.bookname, B.bookprice, BS.bsqty
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN client C ON c.clientno = bs.clientno
WHERE b.bookprice >= 30000;

--5.'�ȵ���̵� ���α׷���' ������ ������ ���� ���Ͽ� ������, ����, ����, �ּ� ���(�������� �������� ����)
SELECT b.bookname, c.clientname, c.clientgender, c.clientaddress
FROM book B, client C, booksale BS
WHERE b.bookno = bs.bookno
       AND c.clientno = bs.clientno
       AND b.bookname = '�ȵ���̵� ���α׷���'
ORDER BY C.clientName ASC;  -- ���� ����
-- INNER JOIN ����� ��
SELECT b.bookname, c.clientname, c.clientgender, c.clientaddress
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN client C ON c.clientno = bs.clientno
WHERE b.bookname = '�ȵ���̵� ���α׷���'
ORDER BY C.clientName;

--6.'�������� ��Ƽ'���� �Ⱓ�� ���� �� �Ǹŵ� ������ ���Ͽ� �� ����� ���
SELECT SUM((b.bookprice * BS.bsqty)) AS "�� �����"
FROM book B, publisher P, booksale BS
WHERE b.bookno = bs.bookno
       AND b.pubno = p.pubno
       AND  p.pubname = '�������� ��Ƽ';
-- INNER JOIN ����� ��
SELECT SUM((b.bookprice * BS.bsqty)) AS "�� �����"
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN publisher P ON b.pubno = p.pubno
WHERE p.pubname = '�������� ��Ƽ';

--7.'���� ���ǻ�'���� �Ⱓ�� ������ ���Ͽ� �Ǹ���, ������, ��������, �ֹ�����, �Ǹž� ���
SELECT bs.bsdate, b.bookname, b.bookprice, bs.bsqty, (b.bookprice * BS.bsqty) AS "�Ǹž�"
FROM book B, publisher P, booksale BS
WHERE b.bookno = bs.bookno
       AND b.pubno = p.pubno
       AND  p.pubname = '���� ���ǻ�';
-- INNER JOIN ����� ��
SELECT bs.bsdate, b.bookname, b.bookprice, bs.bsqty, (b.bookprice * BS.bsqty) AS "�Ǹž�"
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN publisher P ON b.pubno = p.pubno 
WHERE p.pubname = '���� ���ǻ�';

--8.�Ǹŵ� ������ ���Ͽ� �������� ������ȣ, ������, �� �ֹ� ���� ���
SELECT b.bookno, b.bookname, SUM(bs.bsqty) AS "�� �ֹ� ����"
FROM book B, booksale BS
WHERE b.bookno = bs.bookno
GROUP BY b.bookno, b.bookname;
-- INNER JOIN ����� ��
SELECT b.bookno, b.bookname, SUM(bs.bsqty) AS "�� �ֹ� ����"
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
GROUP BY b.bookno, b.bookname;

--9.�Ǹŵ� ���� �� '���� ���ǻ�'���� �Ⱓ�� ������ ���Ͽ� ����, �ֹ���, ������, �ֹ����� ���(�������� ��������)
SELECT c.clientname, bs.bsdate, b.bookname, bs.bsqty
FROM book B, publisher P, booksale BS, client C
WHERE b.bookno = bs.bookno
        AND c.clientno = bs.clientno
        AND b.pubno = p.pubno
        AND p.pubname = '���� ���ǻ�'
ORDER BY C.clientName;
-- INNER JOIN ����� ��
SELECT c.clientname, bs.bsdate, b.bookname, bs.bsqty
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN publisher P ON b.pubno = p.pubno
INNER JOIN client C ON c.clientno = b��s.clientno
WHERE p.pubname = '���� ���ǻ�'
ORDER BY C.clientName;

--10.�Ǹŵ� ������ ���Ͽ� ������ ����, �ѱ��ž� ���(�ѱ��ž��� 100000�� �̻��� ��츸 �ش�)
SELECT c.clientname, SUM(bs.bsqty * B.bookprice) AS "�ѱ��ž�"
FROM booksale BS, book B, client C
WHERE b.bookno = bs.bookno
        AND c.clientno = bs.clientno
GROUP BY c.clientno, C.clientname
HAVING SUM(bs.bsqty * B.bookprice) >= 100000;   -- GROUP BY�� �� �ึ�� ���� ����̱� ������ WHERE�� ��� �Ұ�
-- INNER JOIN ����� ��
SELECT c.clientname, SUM(bs.bsqty * B.bookprice) AS "�ѱ��ž�"
FROM booksale BS
INNER JOIN book B ON b.bookno = bs.bookno
INNER JOIN client C ON c.clientno = bs.clientno
GROUP BY c.clientno, c.clientname
HAVING SUM(bs.bsqty * B.bookprice) >= 100000;   -- HAVING �ڿ��� �����Լ� ������ �;���!! (�� �̸��� �� �� ����)
