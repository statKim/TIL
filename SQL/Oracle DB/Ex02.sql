-- 열 추가 : stdTEL 열 추가
ALTER TABLE student ADD stdTEL VARCHAR(13);

-- 여러 개의 열 추가 : stdAge, stdAddress 열 추가
ALTER TABLE student ADD (stdAge VARCHAR(2), stdAddress VARCHAR(50));

-- 열의 데이터 형식 변경 : stdAge 열의 데이터 타입을 NUMBER(3)로 변경
ALTER TABLE student MODIFY stdAge NUMBER(3);

-- 열의 제약조건 변경 : stdName을 NULL 허용으로 설정
ALTER TABLE student MODIFY stdName VARCHAR(20) NULL;

-- 열 이름 변경 : stdTel에서 stdHP로 변경
ALTER TABLE student RENAME COLUMN stdTel TO stdHP;

-- 열 삭제 : stdHP 열 삭제
ALTER TABLE student DROP COLUMN stdHp;

-- 여러 개의 열 삭제
ALTER TABLE student DROP (stdAge, stdAddress);

/*EX2*/
ALTER TABLE product ADD (prdStock NUMBER(10), prdDate DATE);
ALTER TABLE product MODIFY prdCompany VARCHAR(30) NOT NULL;
ALTER TABLE publisher ADD (pubPhone VARCHAR(13), pubAddress VARCHAR(50));
ALTER TABLE publisher DROP COLUMN pubPhone;


DROP TABLE product;
-- department 테이블 삭제, 외래키 관계 무시하고 기준 테이블을 강제 삭제
DROP TABLE department CASCADE CONSTRAINTS;
