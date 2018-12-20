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
VALUES ('모름','모름','모름','5000');
INSERT INTO menuList
VALUES ('모름1','모름1','모름1','7500');
INSERT INTO menuList
VALUES ('모름2','모름2','모름2','8000');
INSERT INTO menuList
VALUES ('모름3','모름3','모름3','9000');
INSERT INTO menuList
VALUES ('모름4','모름4','모름4','12000');
INSERT INTO menuList
VALUES ('모름5','모름5','모름5','20000');

SELECT * FROM MENULIST;



