/* table 생성후 insert 후 필수 작업  : commit 영구저장
 * select * from table; 
 */

drop table wordcloud cascade constraint;

create table wordcloud(
	w_text varchar2(20) primary key,
	w_frequency number(4) not null
);

insert into wordcloud values ('자리야' , 80);
insert into wordcloud values ('트레이서' , 100);
insert into wordcloud values ('한조' , 20);
insert into wordcloud values ('솔져' , 60);
insert into wordcloud values ('시메트라' , 50);
insert into wordcloud values ('윈스턴' , 30);
insert into wordcloud values ('라인하르트' , 30);
insert into wordcloud values ('아나' , 20);
insert into wordcloud values ('맥크리' , 20);
insert into wordcloud values ('메르시' , 20);
insert into wordcloud values ('박종선' , 20);
insert into wordcloud values ('연제호' , 20);
insert into wordcloud values ('최주원' , 20);
insert into wordcloud values ('윤성용' , 20);
insert into wordcloud values ('양영주' , 20);
insert into wordcloud values ('준바' , 20);
insert into wordcloud values ('정크랫' , 20);

commit;

select * from wordcloud;

