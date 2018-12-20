/* table ������ insert �� �ʼ� �۾�  : commit ��������
 * select * from table; 
 */

drop table wordcloud cascade constraint;

create table wordcloud(
	w_text varchar2(20) primary key,
	w_frequency number(4) not null
);

insert into wordcloud values ('�ڸ���' , 80);
insert into wordcloud values ('Ʈ���̼�' , 100);
insert into wordcloud values ('����' , 20);
insert into wordcloud values ('����' , 60);
insert into wordcloud values ('�ø�Ʈ��' , 50);
insert into wordcloud values ('������' , 30);
insert into wordcloud values ('�����ϸ�Ʈ' , 30);
insert into wordcloud values ('�Ƴ�' , 20);
insert into wordcloud values ('��ũ��' , 20);
insert into wordcloud values ('�޸���' , 20);
insert into wordcloud values ('������' , 20);
insert into wordcloud values ('����ȣ' , 20);
insert into wordcloud values ('���ֿ�' , 20);
insert into wordcloud values ('������' , 20);
insert into wordcloud values ('�翵��' , 20);
insert into wordcloud values ('�ع�' , 20);
insert into wordcloud values ('��ũ��' , 20);

commit;

select * from wordcloud;

