CREATE TABLE userData(
    id VARCHAR(50) NOT NULL PRIMARY KEY,
    password VARCHAR(50) NOT NULL
);

INSERT INTO userdata
VALUES ('hyunsung', '1234');
INSERT INTO userdata
VALUES ('kim', '1234');

select * from userdata;


CREATE TABLE menuList(
    name VARCHAR(50) NOT NULL PRIMARY KEY,
    menu VARCHAR(50) NOT NULL,
    location VARCHAR(50) NOT NULL,
    price NUMBER(8) NOT NULL
);

INSERT INTO menuList
VALUES ('��','��','��','5000');
INSERT INTO menuList
VALUES ('��1','��1','��1','7500');
INSERT INTO menuList
VALUES ('��2','��2','��2','8000');
INSERT INTO menuList
VALUES ('��3','��3','��3','9000');
INSERT INTO menuList
VALUES ('��4','��4','��4','12000');
INSERT INTO menuList
VALUES ('��5','��5','��5','20000');

SELECT * FROM MENULIST;



