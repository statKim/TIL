SELECT * FROM client;

-- 1. �� ���̺��� ����, �������, ���� ���
SELECT clientName, clientbirth, clientgender FROM client;

--2.�� ���̺��� �ּҸ� �˻��Ͽ� ���(�ߺ��Ǵ����� �ѹ��� ���)
SELECT DISTINCT clientaddress FROM client;

--3.�� ���̺��� ��̰� '�౸'�̰ų� '���'�� ���� ����, ��� ���
SELECT clientname, clienthobby FROM client
WHERE clienthobby IN ('�౸','���');

--4.���� ���̺��� ������ �ι�° ��ġ�� '��'�� ����ִ� ���ڸ� ���(�ߺ��Ǵ� ���� �ѹ��� ���)
SELECT DISTINCT bookauthor FROM book
WHERE bookauthor LIKE '_��%';

--5.�������̺��� �������� 2017���� ������ ������, ����, ������ ���
SELECT bookname, bookAuthor, bookdate FROM book
WHERE bookdate LIKE '2017%';

--6.�����Ǹ� ���̺��� ����ȣ 1,2 �� ������ ��� �� ���
SELECT * FROM bookSale
WHERE clientno NOT IN ('1','2');

--7.�����̺��� ��̰� NULL�� �ƴϸ鼭 �ּҰ� '����'�� ���� ����, �ּ�, ��� ���
SELECT clientname, clientAddress, clienthobby  FROM client
WHERE (clienthobby IS NOT NULL) AND (clientaddress = '%����%');

--8.�������̺��� ������ 25000�̻��̸鼭 ���� �̸��� '�浿'�� ���� ������ ������, ����, ����, ��� ���
SELECT bookname,bookauthor,bookprice,bookstock  FROM book
WHERE bookprice >= 25000 AND bookauthor LIKE '%�浿%';

--9.���� ���̺��� ������ 20000~25000���� ��� �� ���
SELECT * FROM book
WHERE bookprice BETWEEN 20000 AND 25000;

--10.�������̺��� ���ڸ� '�浿'�� ������� �ʴ� ������ ������, ���� ���
SELECT bookname, bookauthor FROM book
WHERE bookauthor NOT LIKE '%�浿%';