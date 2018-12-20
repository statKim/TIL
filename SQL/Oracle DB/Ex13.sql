-- ���� �Լ�
-- ROUND �Լ� : �ݿø��� ���� ���ϴ� �Լ�
-- ROUND(��,�ڸ���) : �ڸ��� �Ʒ��� �ݿø��Ͽ� �ڸ������� ���
-- ��� �� : �Ҽ��� ������ �ڸ���
-- ���� �� : �Ҽ��� ���� �ڸ���

-- ���� ��� �ֹ����� ��� �������� �ݿø��Ͽ� ���(õ���ڸ����� ���)
SELECT BS.clientNo, ROUND(AVG(B.bookPrice * BS.bsQty)) AS "��� �ֹ���",
                    ROUND(AVG(B.bookPrice * BS.bsQty),0) AS "1�ڸ����� ���",
                    ROUND(AVG(B.bookPrice * BS.bsQty),-1) AS "10�ڸ����� ���",
                    ROUND(AVG(B.bookPrice * BS.bsQty),-2) AS "100�ڸ����� ���",
                    ROUND(AVG(B.bookPrice * BS.bsQty),-3) AS "1000�ڸ����� ���"
FROM book B, bookSale BS
WHERE b.bookno = bs.bookno
GROUP BY bs.clientno;

--REPLACE() : ���ڿ��� ġȯ�ϴ� �Լ�
--������ '�ȵ���̵�'�� ���Ե� ������ ���� ������ ���Ե� '�ȵ���̵�'�� 'Android'�� �����ؼ� ���
SELECT bookNo, REPLACE(bookName,'�ȵ���̵�','Android') bookName, bookAuthor, bookPrice
FROM book
WHERE bookName LIKE '%�ȵ���̵�%';

--book ���̺� Ȯ�� => ���� �� ���� X
SELECT bookNo, bookName FROM book;

--LENGTH() : ������ ���� ��ȯ�ϴ� �Լ�, ������ ����Ʈ(byte)�� �ƴ� ���� ����
--LENGTHB() : ����Ʈ �� ��ȯ

--'���� ���ǻ�'���� ������ ������ ������� �������� ���� ��, ����Ʈ �� ���
SELECT b.bookname AS "������", LENGTH(B.bookname) AS "����",
                                LENGTHB(b.bookname) AS "����Ʈ"
FROM book B, publisher P
WHERE B.pubNo = p.pubno AND P.pubname = '���� ���ǻ�';

--SUBSTR() : ������ ���̸�ŭ�� ���ڿ��� ��ȯ�ϴ� �Լ�
--SUBSTR(��ü ���ڿ�, ����, ����)

--���ڿ��� ���� ���
SELECT SUBSTR(bookAuthor,1,1) AS "��"
FROM book;

--���ڿ��� �̸��� ���
SELECT SUBSTR(bookAuthor,2,2) AS "�̸�"
FROM book;

--���� �� ���� '��'�� ��� ���� ���
SELECT bookAuthor
FROM book
WHERE SUBSTR(bookAuthor,1,1) = '��';

--���� �߿��� ���� ���� ���� ����� �� ���̳� �Ǵ��� �˾ƺ��� ���Ͽ� �� ���� �׷����� �ο��� ���
SELECT SUBSTR(bookAuthor,1,1) AS "��", COUNT(*) AS "�ο���"
FROM book
GROUP BY SUBSTR(bookAuthor,1,1);

--���� ��¥ ���
SELECT SYSDATE FROM DUAL;
SELECT SYSDATE-1 ����, SYSDATE ����, SYSDATE+1 ���� FROM DUAL;

--���� ��¥�� �ð� ���
SELECT CURRENT_DATE, CURRENT_TIMESTAMP FROM DUAL;

--��¥ + ���� : �� ��¥�κ��� �� �Ⱓ��ŭ ���� ��¥ ���
--�����Ͽ� 7�� ���� ���� �Ա� �����Ϸ�
SELECT bDate, bDate +7 AS "�ӱ� ������" FROM booking; -- ������ ���� SQL�������� �ٲٰ� ����

--���� ��¥���� ��, ��, �� ����
SELECT EXTRACT(YEAR FROM SYSDATE) ��,
        EXTRACT(MONTH FROM SYSDATE) ��,
        EXTRACT(DAY FROM SYSDATE) ��
FROM DUAL;
