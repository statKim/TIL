-- book ���̺��� ��� �� �˻��Ͽ� ���
-- ��� �� ���
SELECT * FROM book;

-- ������� ���ݸ� �˻��Ͽ� ���
SELECT bookName, bookPrice FROM book;

-- ���ڸ� �˻��Ͽ� ��� (�ߺ��Ǵ� ���� �� ���� ���)
SELECT bookAuthor FROM book;
SELECT DISTINCT bookAuthor FROM book;   -- �ߺ� ��������

-- ���ڰ� 'ȫ�浿'�� ������ ������, ���� ���
SELECT bookName,bookAuthor FROM book
WHERE bookAuthor = 'ȫ�浿';

-- ������ 30000 �̻��� ���� ������, ����, ��� ���
SELECT bookName,bookPrice,bookStock FROM book
WHERE bookPrice >= 30000;

-- ��� 3~5 ������ ������ ������, ��� ���
SELECT bookName, bookStock FROM book
WHERE bookStock>=3 AND bookStock<=5;

-- ���� (BEETWEEN)
-- ��� 3~5 ������ ������ ������, ��� ���(�ٷ� ���� ���� ���)
SELECT bookName, bookStock FROM book
WHERE bookStock BETWEEN 3 AND 5;

-- ����Ʈ�� ����(IN, NOT IN)
-- ���ǻ���� '���� ���ǻ�'(pubNo='1')�� '�������� ��Ƽ'(pubNo='2')�� ������ ������, ���ǻ��ȣ ���
SELECT bookName, pubNo FROM book
WHERE pubNo IN('1','2');

-- ���ǻ���� '�������� ��Ƽ'(pubNo='2')�� �ƴ� ������ ������, ���ǻ��ȣ ���
SELECT bookName, pubNo FROM book
WHERE pubNo NOT IN('2');

-- NULL (IS NULL, IS NOT NULL)
--��� �� ������ ���
SELECT clientName, clientHobby FROM client;

--��̿� NULL���� ��� �ִ� �ุ ���
SELECT clientName, clientHobby FROM client
WHERE clientHobby IS NULL;

--��̿� NULL���� �ƴ� �ุ ���
SELECT clientName, clientHobby FROM client
WHERE clientHobby IS NOT NULL;

--��̿� ������ ����ִ� �ุ ���
SELECT clientName, clientHobby FROM client
WHERE clientHobby = ' ';

-- �� (AND, OR)
-- ���ڰ� 'ȫ�浿'�̸鼭 ��� 3���̻��� ��� ���� ���
SELECT * FROM book
WHERE bookAuthor = 'ȫ�浿' AND bookstock >= 3;

-- ���ڰ� 'ȫ�浿'�̰ų� '������'�� ��� ���� ���
SELECT * FROM book
WHERE bookauthor = 'ȫ�浿' OR bookauthor = '������';

-- ���� ��Ī (LIKE)
-- ���ǻ� ���̺��� ���ǻ�� '���ǻ�'�� ���Ե� ��� �� ���
SELECT * FROM publisher
WHERE pubname LIKE '%���ǻ�%';

-- �� ���̺��� ����⵵�� 1990����� ��� �� ���
SELECT * FROM client
WHERE clientbirth LIKE '199%';

-- �� ���̺��� �̸��� 4������ ��� �� ���
SELECT * FROM client
WHERE clientname LIKE '____';

-- ���� ���̺��� ������ '�ȵ���̵�'�� ������� ���� ������ ������ ���
SELECT bookName FROM book
WHERE bookName NOT LIKE ('%�ȵ���̵�%');

