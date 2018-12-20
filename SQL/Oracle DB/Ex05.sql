SELECT * FROM PRODUCT;
-- 1. �� ���̺� ����
CREATE TABLE client(
    cliNo VARCHAR(3) NOT NULL PRIMARY KEY,
    cliName VARCHAR(15) NOT NULL,
    cliPhone VARCHAR(13)
);

-- 2. �ֹ� ���̺� ����
CREATE TABLE orderProduct(
    ordNo VARCHAR(8) NOT NULL PRIMARY KEY,
    ordCount NUMBER(3) NOT NULL,
    ordDay DATE,
    prdNo VARCHAR(3) NOT NULL,
    FOREIGN KEY (prdNo) REFERENCES product (prdNo),
    cliNo VARCHAR(3) NOT NULL,
    FOREIGN KEY (cliNo) REFERENCES client (cliNo)
);

-- 3. �����̺��� �ֹι�ȣ ���� NOT NULL�� ����
ALTER TABLE client MODIFY cliPhone VARCHAR(13) NOT NULL;

-- 4. �����̺� �ֹι�ȣ, ����, ���� �� �߰�
ALTER TABLE client ADD (cliNum VARCHAR(14), sex VARCHAR(3), age NUMBER(3));

-- 5. ������ �Է�
INSERT INTO client (cliNo,cliName,cliPhone,cliNum,sex,age)
VALUES ('1','��','01010101010','000000-0000000','��',20);
INSERT INTO client (cliNo,cliName,cliPhone,cliNum,sex,age)
VALUES ('2','��','01020202020','111111-1111111','��',24);
INSERT INTO client (cliNo,cliName,cliPhone,cliNum,sex,age)
VALUES ('3','��','01030303030','222222-2222222','��',30);

INSERT INTO orderproduct (ordNo,ordCount,ordDay,prdNo,cliNo)
VALUES ('1',3,'2018-07-09','1','2');
INSERT INTO orderproduct (ordNo,ordCount,ordDay,prdNo,cliNo)
VALUES ('2',5,'2018-06-10','2','1');
INSERT INTO orderproduct (ordNo,ordCount,ordDay,prdNo,cliNo)
VALUES ('3',7,'2018-06-09','3','3');

-- 6. �ֹ����̺��� �ֹ���ȣ�� 2�ΰ��� ������ 3���� ����
UPDATE orderProduct SET ordCount=3 WHERE ordNo='2'; 

SELECT * FROM orderproduct;


