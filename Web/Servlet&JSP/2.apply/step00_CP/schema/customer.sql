drop table customer;

create table customer(
	id varchar2(10) primary key,
	pw varchar2(10) not null,
	name varchar2(10) not null
);

insert into customer values('tester', '11', '신동엽');
insert into customer values('power', '22', '이영자');
insert into customer values('a', '1', '황승호');
insert into customer values('b', '1', '황선주');
insert into customer values('c', '1', '한상우');
insert into customer values('d', '1', '최호현');

-- DML(insert, update, delete)에 한해서 작성 후 영구 저장하는 명령어 필수
-- sql developer는 자동 저장 기능 내장
-- 필수 명령어 
commit;

select * from customer;

