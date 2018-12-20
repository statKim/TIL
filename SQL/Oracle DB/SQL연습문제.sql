--���� ���̺� ����
CREATE TABLE employee(
    empNo VARCHAR(10) NOT NULL PRIMARY KEY,
    empName VARCHAR(30),
    empPhone VARCHAR(13),
    empAddress VARCHAR(50),
    empBirth DATE,
    empGender VARCHAR(3)
);

INSERT INTO employee
VALUES ('1','ȫ�浿','010-1111-1111','��õ�� ����','1987-01-02','��');
INSERT INTO employee
VALUES ('2','������','010-2222-2222','��⵵ �Ⱦ��','1994-12-12','��');
INSERT INTO employee
VALUES ('3','�̸���','010-3333-3333','����� ���α�','1984-03-05','��');
INSERT INTO employee
VALUES ('4','���е�','010-4444-4444','��⵵ ������','1988-11-11','��');
INSERT INTO employee
VALUES ('5','�տ���','010-5555-5555','����� ���Ǳ�','1992-05-05','��');
INSERT INTO employee
VALUES ('6','������','010-6666-6666','��� �뱸��','1990-04-07','��');
INSERT INTO employee
VALUES ('7','�迬��','010-7777-7777','��⵵ ������','1981-10-10','��');
INSERT INTO employee
VALUES ('8','��ȫ��','010-8888-9999','��õ�� ��籸','1988-07-12','��');
INSERT INTO employee
VALUES ('9','�⼺��','010-9999-9999','��⵵ ������','1993-08-18','��');
INSERT INTO employee
VALUES ('10','���κ�','010-1234-1234','����� ������','1979-07-15','��');

SELECT * FROM employee;

--�� �з� ���̺� ����
CREATE TABLE class(
    classNo VARCHAR(10) NOT NULL PRIMARY KEY,
    className VARCHAR(30) NOT NULL
);

INSERT INTO class
VALUES ('1','2�ν�');
INSERT INTO class
VALUES ('2','4�ν�');
INSERT INTO class
VALUES ('3','������');
INSERT INTO class
VALUES ('4','��ü��');

SELECT * FROM class;

--�� ���̺� ����
CREATE TABLE room(
    roomNo VARCHAR(10) NOT NULL PRIMARY KEY,
    roomName VARCHAR(30),
    roomType VARCHAR(20),
    roomPrice NUMBER(8),
    classNo VARCHAR(10) NOT NULL,
    FOREIGN KEY (classNo) REFERENCES class(classNo)
);

SELECT * FROM room;

--���� ���̺� ����
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

--1.�������� �����Ҿ� ��� (��, �����Ҿ��� ĥ�ʸ��� �̻��� ������ ���)
SELECT E.empName, SUM(R.roomPrice * b.bstaydays) AS "�����Ҿ�"
FROM room R, employee E, booking B 
WHERE r.roomno = b.roomno
    AND e.empno = b.empno
GROUP BY e.empno, E.empName -- PRIMARY KEY �����ִ� ���� �� ��Ȯ!!!(���� �̸� ���� �� �ֱ� ����)
HAVING SUM(R.roomPrice * b.bstaydays) >= 700000;

--2.�ξ��̹��� �ѻ���ϼ� ��� (subquery ���)
SELECT  SUM(bstaydays) AS �ѻ���ϼ�
FROM booking
WHERE roomNo = (SELECT roomNo
                FROM room  
                WHERE roomName = '�ξ��̹�');

--3.'������' ���� ������ ������ ����, �Խ���, ����, ����ϼ� ���
SELECT E.empName, b.bindate, r.roomprice, b.bstaydays
FROM room R, class C, employee E, booking B
WHERE r.classno = c.classno
    AND r.roomno = b.roomno
    AND e.empno = b.empno
    AND C.classname = '������';
    
--4.���￡ �����ϴ� ���� ������ ����, ��ȭ, �ּ�, ���� ���
SELECT empName, empphone, empaddress, empgender
FROM employee
WHERE empAddress LIKE '%����%'
    AND empgender = '��';

--5.�⼺���� ������ �ְ� ����ϼ� ���� �� ���� ����ϼ��� ������ ������ ȸ����, ����, ����ϼ� ���(SUBQUERY ���)
SELECT E.empName, E.empgender, b.bstaydays
FROM employee E, booking B
WHERE e.empno = b.empno
    AND E.empno IN (SELECT empNo 
                    FROM booking
                    WHERE bStayDays > ALL (SELECT bStayDays 
                                            FROM booking
                                            WHERE empNo = (SELECT empNo
                                                            FROM employee
                                                            WHERE empname = '�⼺��')))
    -- �̺κ��� ���ص� ��
    AND b.bstaydays > ALL (SELECT bStayDays 
                            FROM booking
                            WHERE empNo = (SELECT empNo
                                            FROM employee
                                            WHERE empname = '�⼺��'));

--6.����� �ѻ���ϼ��� �����Ҿ� ���   
SELECT SUM(b.bstaydays) AS "�ѻ���ϼ�", SUM(r.roomprice * b.bstaydays) AS "�����Ҿ�"
FROM room R,booking B
WHERE r.roomno = b.roomno;

--7.���� ���� ��� : ������, ���� ����, �Խ���, ����ϼ�, ����, ���޸� ���
SELECT b.bdate, e.empname, b.bindate, b.bstaydays, r.roomprice, c.classno
FROM room R, class C, employee E, booking B
WHERE r.classno = c.classno
    AND r.roomno = b.roomno
    AND e.empno = b.empno;

--8.���� �� ���� ������ ������ ����� ���� �� ���̸�, ����ϼ�, ���� ���
SELECT e.empname, r.roomname, b.bstaydays, r.roomprice
FROM room R, employee E, booking B
WHERE r.roomno = b.roomno
    AND e.empno = b.empno
    AND r.roomprice <= ALL (SELECT roomprice
                            FROM room);
                          
--9.������ 200000~300000���� ���� �̸�, ����, ���� ���(������ �������� �������� ����)
SELECT roomname, roomtype, roomprice
FROM room
WHERE roomprice >= 200000
    AND roomprice <= 300000
ORDER BY roomprice DESC;
    
--10.3�� ������ ���� ���� ��� : ������, �Խ���, ����ϼ� (������ ���� �������� ����)
SELECT bdate, bindate, bstaydays
FROM booking
WHERE bdate >= '2018-03-01'
ORDER BY bdate;

SELECT * FROM CLASS;
SELECT * FROM ROOM;
SELECT * FROM EMPLOYEE;
SELECT * FROM booking;