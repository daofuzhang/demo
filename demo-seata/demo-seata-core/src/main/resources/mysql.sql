create table account(id int ,money decimal(8,2));
create table goods(id int, name varchar(36), num int,price decimal(8,2));
create table ordr(id int,goodsid int);

insert into goods values(1,'apple',100,5.5);
insert into goods values(2,'orangle',100,4.5);