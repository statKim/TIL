drop table pitcher;
drop table hitter;

CREATE TABLE hitter2017(
    hitPlayerId VARCHAR(8) PRIMARY KEY,
    hitName	VARCHAR(20) NOT NULL,
    hitTeam VARCHAR(20) NOT NULL,
    hitGame VARCHAR(8) NOT NULL,
    hitPA VARCHAR(8) NOT NULL,
    hitHR VARCHAR(8) NOT NULL,
    hitR VARCHAR(8) NOT NULL,
    hitRBI	VARCHAR(8) NOT NULL,
    hitSB VARCHAR(8) NOT NULL,
    hitBB_per VARCHAR(8) NOT NULL,
    hitK_per VARCHAR(8) NOT NULL,
    hitISO	VARCHAR(8) NOT NULL,
    hitBABIP VARCHAR(8) NOT NULL,
    hitAVG VARCHAR(8) NOT NULL,
    hitOBP VARCHAR(8) NOT NULL,
    hitSLG VARCHAR(8) NOT NULL,
    hitOPS VARCHAR(8) NOT NULL,
    hitwOBA VARCHAR(8) NOT NULL,
    hitwRCplus VARCHAR(8) NOT NULL,
    hitWar VARCHAR(8) NOT NULL
);

CREATE TABLE pitcher2017(
    pitPlayerId VARCHAR(8) PRIMARY KEY,
    pitName VARCHAR(20) NOT NULL,
    pitTeam	VARCHAR(20) NOT NULL,
    pitWin VARCHAR(8) NOT NULL,
    pitLose VARCHAR(8) NOT NULL,
    pitGame VARCHAR(8) NOT NULL,
    pitGStart VARCHAR(8) NOT NULL,
    pitIP VARCHAR(8) NOT NULL,
    pitKper9 VARCHAR(8) NOT NULL,
    pitBBper9 VARCHAR(8) NOT NULL,
    pitHRper9 VARCHAR(8) NOT NULL,
    pitBABIP VARCHAR(8) NOT NULL,
    pitLOBper VARCHAR(8) NOT NULL,
    pitGBper VARCHAR(8) NOT NULL,	
    pitHRperFB VARCHAR(8) NOT NULL,	
    pitERA VARCHAR(8) NOT NULL,
    pitFIP VARCHAR(8) NOT NULL,
    pitxFIP	VARCHAR(8) NOT NULL,
    pitWar VARCHAR(8) NOT NULL
);

select * from pitcher2017;
select * from hitter2017;
select * from pitcher2017 where pitName like '%Kershaw%';
SELECT * FROM pitcher2017 where cast(pitWin as float) > 15;

select * from member;

create sequence board_bbsNum_seq
    start with 1
    increment BY 1
    maxvalue 10000;
    
create table board (
    bbsNum number(10) not null primary key,
    bbsWriter varchar(20),
    bbsSubject varchar(100),
    bbsContent varchar(1000),
    bbsDate date
);

select * from board;

insert into board
values(board_bbsNum_seq.NEXTVAL,'flower','안녕하세요','질문있습니다','2018-05-03');
insert into board
values(board_bbsNum_seq.NEXTVAL,'khs','뭐야','제발 좀 ㅠㅠ','2018-08-23');
insert into board
values(board_bbsNum_seq.NEXTVAL,'khs','안녕','질문','2018-06-13');
insert into board
values(board_bbsNum_seq.NEXTVAL,'khs','에라이','ㄱㄱ','2014-07-15');
insert into board
values(board_bbsNum_seq.NEXTVAL,'khs','ㄴㄴ','ㅋㅋㅋㅋ','2015-03-09');