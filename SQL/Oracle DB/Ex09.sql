-- ������ ������ ���� �˻� (�⺻ : ��������(ASC ����))
SELECT * FROM book
ORDER BY bookName;

-- ������ ������ ���� �˻� (�������� DESC)
SELECT * FROM book
ORDER BY bookName DESC;

-- ���� ���̺��� ��� ������ �������� �������� �����Ͽ� ������, ����, ��� ���
SELECT bookName, bookAuthor, bookStock FROM book
ORDER BY bookStock DESC;

-- ���� ���̺��� ��� ������ �������� �������� �����Ͽ� ������, ����, ��� ���
-- ��� ������ ������ ���, ���ڸ����� �������� 2�� ����
SELECT bookName, bookAuthor, bookStock FROM book
ORDER BY bookStock DESC, bookAuthor ASC;
