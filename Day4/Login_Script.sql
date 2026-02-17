use mphasis26;

drop table if exists Login;

create table Login
(
   userName varchar(30) Primary Key,
   passCode varchar(30)
);

Insert into Login values('Prashanth','Singh'),
('Bala','Surya'),('Gokila','Selvi'),('Kabila','Rajan');