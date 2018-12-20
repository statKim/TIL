/* PL/SQL */

SET SERVEROUTPU ON; --ȭ�� ��� ���(���� ���� ���� 1ȸ ����)
DECLARE -- ����
    NAME VARCHAR(10);
    AGE NUMBER(3);
BEGIN
    NAME := 'ȫ�浿';
    AGE := 23;
    DBMS_OUTPUT.PUT_LINE(NAME);
    DBMS_OUTPUT.PUT_LINE(AGE);
END;

--IF ��
DECLARE
    BOOKSTOCK NUMBER(3);
BEGIN
    SELECT bookStock INTO BOOKSTOCK FROM BOOK WHERE bookNo = '1003';
    DBMS_OUTPUT.PUT_LINE(BOOKSTOCK);
    
    IF BOOKSTOCK >= 7 THEN
        DBMS_OUTPUT.PUT_LINE('��� ���� ����');
    ELSE
        DBMS_OUTPUT.PUT_LINE('��� ���� ����');
    END IF;
END;

--CASE ��
SELECT clientName, SUM(bookPrice * bsQty) AS "�� �ֹ���",
    CASE
        WHEN SUM(bookPrice * bsQty) >= 200000 THEN '�ֿ��'
        WHEN SUM(bookPrice * bsQty) >= 100000 THEN '���'
        WHEN SUM(bookPrice * bsQty) >= 50000 THEN '�Ϲ�'
        ELSE '���ɰ�'
    END AS "�����"
FROM bookSale, client, book
WHERE client.clientNo = bookSale.clientNo
        AND book.bookNo = bookSale.bookNo
GROUP BY client.clientNo, clientName;

