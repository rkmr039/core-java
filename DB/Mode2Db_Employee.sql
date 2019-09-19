create database java8streams;

use java8streams;


create table Employee (
empNo int not null auto_increment,
empName varchar(30),
salary float,
band char,
dateOfJoin datetime,
primary key(empNo));

delete from Employee;
alter table Employee AUTO_INCREMENT =1;
alter table Employee modify column dateOfJoin date; 

select * from Employee;
-- E Band Employee
insert into Employee values(default,'Yash',5000,'E','2009-01-01');
insert into Employee values(default,'Tushar',3000,'E','2019-11-01');
insert into Employee values(default,'Amit',3400,'E','2017-06-06');
insert into Employee values(default,'Aditya',3100,'E','2015-12-11');
insert into Employee values(default,'Piyush',3300,'E','2011-08-08');

insert into Employee values(default,'Ram',5500,'E','2015-01-02');
insert into Employee values(default,'Shyam',2500,'E','2014-11-03');
insert into Employee values(default,'Radha',4500,'E','2013-06-04');
insert into Employee values(default,'Manoj',5500,'E','2012-12-15');
insert into Employee values(default,'Sunny',3550,'E','2019-08-06');
 
 
-- C Band Employee
insert into Employee values(default,'Raja',8890,'C','2013-01-01');
insert into Employee values(default,'Ramesh',10000,'C','2014-11-01');
insert into Employee values(default,'Janani',9400,'C','2015-06-06');
insert into Employee values(default,'Nivetha',8100,'C','2016-12-11');
insert into Employee values(default,'JJ',9900,'C','2019-08-08');

insert into Employee values(default,'Mukul',18890,'C','2013-01-01');
insert into Employee values(default,'Mukesh',11000,'C','2014-11-01');
insert into Employee values(default,'Mahima',19400,'C','2015-06-06');
insert into Employee values(default,'Mahinder',18100,'C','2016-12-11');
insert into Employee values(default,'Pawan',19900,'C','2019-08-08');

-- M Band Employee
insert into Employee values(default,'Ayush',8890,'M','2013-01-01');
insert into Employee values(default,'Abhishek',10000,'M','2014-11-01');
insert into Employee values(default,'Aman',9400,'M','2015-06-06');
insert into Employee values(default,'Arnav',8100,'M','2016-12-11');
insert into Employee values(default,'Sujal',9900,'M','2019-08-08');

insert into Employee values(default,'Sakshi',18800,'M','2006-01-01');
insert into Employee values(default,'Neha',17050,'M','2011-11-01');
insert into Employee values(default,'Kalpana',19700,'M','2009-06-06');
insert into Employee values(default,'Anvi',18500,'M','2001-12-11');
insert into Employee values(default,'Priyanshu',18950,'M','2000-08-08');
