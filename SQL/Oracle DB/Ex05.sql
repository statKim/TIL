SELECT * FROM PRODUCT;
-- 1. 고객 테이블 생성
CREATE TABLE client(
    cliNo VARCHAR(3) NOT NULL PRIMARY KEY,
    cliName VARCHAR(15) NOT NULL,
    cliPhone VARCHAR(13)
);

-- 2. 주문 테이블 생성
CREATE TABLE orderProduct(
    ordNo VARCHAR(8) NOT NULL PRIMARY KEY,
    ordCount NUMBER(3) NOT NULL,
    ordDay DATE,
    prdNo VARCHAR(3) NOT NULL,
    FOREIGN KEY (prdNo) REFERENCES product (prdNo),
    cliNo VARCHAR(3) NOT NULL,
    FOREIGN KEY (cliNo) REFERENCES client (cliNo)
);

-- 3. 고객테이블의 주민번호 열을 NOT NULL로 변경
ALTER TABLE client MODIFY cliPhone VARCHAR(13) NOT NULL;

-- 4. 고객테이블에 주민번호, 성별, 나이 열 추가
ALTER TABLE client ADD (cliNum VARCHAR(14), sex VARCHAR(3), age NUMBER(3));

-- 5. 데이터 입력
INSERT INTO client (cliNo,cliName,cliPhone,cliNum,sex,age)
VALUES ('1','김','01010101010','000000-0000000','남',20);
INSERT INTO client (cliNo,cliName,cliPhone,cliNum,sex,age)
VALUES ('2','현','01020202020','111111-1111111','여',24);
INSERT INTO client (cliNo,cliName,cliPhone,cliNum,sex,age)
VALUES ('3','성','01030303030','222222-2222222','남',30);

INSERT INTO orderproduct (ordNo,ordCount,ordDay,prdNo,cliNo)
VALUES ('1',3,'2018-07-09','1','2');
INSERT INTO orderproduct (ordNo,ordCount,ordDay,prdNo,cliNo)
VALUES ('2',5,'2018-06-10','2','1');
INSERT INTO orderproduct (ordNo,ordCount,ordDay,prdNo,cliNo)
VALUES ('3',7,'2018-06-09','3','3');

-- 6. 주문테이블에서 주문번호가 2인것의 수량을 3으로 변경
UPDATE orderProduct SET ordCount=3 WHERE ordNo='2'; 

SELECT * FROM orderproduct;


