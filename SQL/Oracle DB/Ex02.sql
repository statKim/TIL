-- �� �߰� : stdTEL �� �߰�
ALTER TABLE student ADD stdTEL VARCHAR(13);

-- ���� ���� �� �߰� : stdAge, stdAddress �� �߰�
ALTER TABLE student ADD (stdAge VARCHAR(2), stdAddress VARCHAR(50));

-- ���� ������ ���� ���� : stdAge ���� ������ Ÿ���� NUMBER(3)�� ����
ALTER TABLE student MODIFY stdAge NUMBER(3);

-- ���� �������� ���� : stdName�� NULL ������� ����
ALTER TABLE student MODIFY stdName VARCHAR(20) NULL;

-- �� �̸� ���� : stdTel���� stdHP�� ����
ALTER TABLE student RENAME COLUMN stdTel TO stdHP;

-- �� ���� : stdHP �� ����
ALTER TABLE student DROP COLUMN stdHp;

-- ���� ���� �� ����
ALTER TABLE student DROP (stdAge, stdAddress);

/*EX2*/
ALTER TABLE product ADD (prdStock NUMBER(10), prdDate DATE);
ALTER TABLE product MODIFY prdCompany VARCHAR(30) NOT NULL;
ALTER TABLE publisher ADD (pubPhone VARCHAR(13), pubAddress VARCHAR(50));
ALTER TABLE publisher DROP COLUMN pubPhone;


DROP TABLE product;
-- department ���̺� ����, �ܷ�Ű ���� �����ϰ� ���� ���̺��� ���� ����
DROP TABLE department CASCADE CONSTRAINTS;
