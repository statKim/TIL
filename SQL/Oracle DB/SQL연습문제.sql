--직원 테이블 생성
CREATE TABLE employee(
    empNo VARCHAR(10) NOT NULL PRIMARY KEY,
    empName VARCHAR(30),
    empPhone VARCHAR(13),
    empAddress VARCHAR(50),
    empBirth DATE,
    empGender VARCHAR(3)
);

INSERT INTO employee
VALUES ('1','홍길동','010-1111-1111','인천시 남구','1987-01-02','남');
INSERT INTO employee
VALUES ('2','성춘향','010-2222-2222','경기도 안양시','1994-12-12','여');
INSERT INTO employee
VALUES ('3','이몽룡','010-3333-3333','서울시 종로구','1984-03-05','남');
INSERT INTO employee
VALUES ('4','변학도','010-4444-4444','경기도 성남시','1988-11-11','남');
INSERT INTO employee
VALUES ('5','손연재','010-5555-5555','서울시 관악구','1992-05-05','여');
INSERT INTO employee
VALUES ('6','박지성','010-6666-6666','경북 대구시','1990-04-07','남');
INSERT INTO employee
VALUES ('7','김연아','010-7777-7777','경기도 수원시','1981-10-10','여');
INSERT INTO employee
VALUES ('8','손홍민','010-8888-9999','인천시 계양구','1988-07-12','남');
INSERT INTO employee
VALUES ('9','기성용','010-9999-9999','경기도 수원시','1993-08-18','남');
INSERT INTO employee
VALUES ('10','박인비','010-1234-1234','서울시 강남구','1979-07-15','여');

SELECT * FROM employee;

--룸 분류 테이블 생성
CREATE TABLE class(
    classNo VARCHAR(10) NOT NULL PRIMARY KEY,
    className VARCHAR(30) NOT NULL
);

INSERT INTO class
VALUES ('1','2인실');
INSERT INTO class
VALUES ('2','4인실');
INSERT INTO class
VALUES ('3','가족실');
INSERT INTO class
VALUES ('4','단체실');

SELECT * FROM class;

--룸 테이블 생성
CREATE TABLE room(
    roomNo VARCHAR(10) NOT NULL PRIMARY KEY,
    roomName VARCHAR(30),
    roomType VARCHAR(20),
    roomPrice NUMBER(8),
    classNo VARCHAR(10) NOT NULL,
    FOREIGN KEY (classNo) REFERENCES class(classNo)
);

SELECT * FROM room;

--예약 테이블 생성
CREATE TABLE booking(
    bNo VARCHAR(10) NOT NULL PRIMARY KEY,
    bDate DATE,
    bInDate DATE,
    bStayDays NUMBER(3),
    empNo VARCHAR(10) NOT NULL,
    FOREIGN KEY (empNo) REFERENCES employee(empNo),
    roomNo VARCHAR(10) NOT NULL,
    FOREIGN KEY (roomNo) REFERENCES room(roomNo)
);

SELECT * FROM booking;

--1.직원별로 총지불액 출력 (단, 총지불액이 칠십만원 이상인 직원만 출력)
SELECT E.empName, SUM(R.roomPrice * b.bstaydays) AS "총지불액"
FROM room R, employee E, booking B 
WHERE r.roomno = b.roomno
    AND e.empno = b.empno
GROUP BY e.empno, E.empName -- PRIMARY KEY 적어주는 것이 더 정확!!!(동일 이름 있을 수 있기 때문)
HAVING SUM(R.roomPrice * b.bstaydays) >= 700000;

--2.부엉이방의 총사용일수 출력 (subquery 사용)
SELECT  SUM(bstaydays) AS 총사용일수
FROM booking
WHERE roomNo = (SELECT roomNo
                FROM room  
                WHERE roomName = '부엉이방');

--3.'가족실' 방을 예약한 직원의 성명, 입실일, 가격, 사용일수 출력
SELECT E.empName, b.bindate, r.roomprice, b.bstaydays
FROM room R, class C, employee E, booking B
WHERE r.classno = c.classno
    AND r.roomno = b.roomno
    AND e.empno = b.empno
    AND C.classname = '가족실';
    
--4.서울에 거주하는 여성 직원의 성명, 전화, 주소, 성별 출력
SELECT empName, empphone, empaddress, empgender
FROM employee
WHERE empAddress LIKE '%서울%'
    AND empgender = '여';

--5.기성용이 예약한 최고 사용일수 보다 더 많은 사용일수를 예약한 직원의 회원명, 성별, 사용일수 출력(SUBQUERY 사용)
SELECT E.empName, E.empgender, b.bstaydays
FROM employee E, booking B
WHERE e.empno = b.empno
    AND E.empno IN (SELECT empNo 
                    FROM booking
                    WHERE bStayDays > ALL (SELECT bStayDays 
                                            FROM booking
                                            WHERE empNo = (SELECT empNo
                                                            FROM employee
                                                            WHERE empname = '기성용')))
    -- 이부분은 안해도 됨
    AND b.bstaydays > ALL (SELECT bStayDays 
                            FROM booking
                            WHERE empNo = (SELECT empNo
                                            FROM employee
                                            WHERE empname = '기성용'));

--6.예약된 총사용일수와 총지불액 출력   
SELECT SUM(b.bstaydays) AS "총사용일수", SUM(r.roomprice * b.bstaydays) AS "총지불액"
FROM room R,booking B
WHERE r.roomno = b.roomno;

--7.예약 내역 출력 : 예약일, 직원 성명, 입실일, 사용일수, 가격, 방등급명 출력
SELECT b.bdate, e.empname, b.bindate, b.bstaydays, r.roomprice, c.classno
FROM room R, class C, employee E, booking B
WHERE r.classno = c.classno
    AND r.roomno = b.roomno
    AND e.empno = b.empno;

--8.가장 싼 방을 예약한 직원의 성명과 가장 싼 방이름, 사용일수, 가격 출력
SELECT e.empname, r.roomname, b.bstaydays, r.roomprice
FROM room R, employee E, booking B
WHERE r.roomno = b.roomno
    AND e.empno = b.empno
    AND r.roomprice <= ALL (SELECT roomprice
                            FROM room);
                          
--9.가격이 200000~300000원인 방의 이름, 유형, 가격 출력(가격을 기준으로 내림차순 정렬)
SELECT roomname, roomtype, roomprice
FROM room
WHERE roomprice >= 200000
    AND roomprice <= 300000
ORDER BY roomprice DESC;
    
--10.3월 이후의 예약 내역 출력 : 예약일, 입실일, 사용일수 (예약일 기준 오름차순 정렬)
SELECT bdate, bindate, bstaydays
FROM booking
WHERE bdate >= '2018-03-01'
ORDER BY bdate;

SELECT * FROM CLASS;
SELECT * FROM ROOM;
SELECT * FROM EMPLOYEE;
SELECT * FROM booking;