SELECT * FROM sqlpractice.department;
use sqlpractice;
show tables;
desc emp;

-- Display all records of Employ table
select * from employ;
-- Display empno, name, basic from employ table
select Empno,Name,Basic from employ;
-- Display all records whose basic salary > 50000
select * from employ where Basic > 50000;
-- Display all records who belong to 'java' dept
select * from employ where dept = 'java';
-- display all records whose basic from 40000 to 60000
select * from employ where Basic >= 40000 and basic <= 60000 ;
select * from employ where Basic between 40000 and 60000;

-- Display all records whose name start with 'k'
select * from employ where name like 'k%';

-- Display all records who belong to java or dotnet dept
select * from employ where dept = 'java' or dept = 'dotnet';

-- Display all records who does not belong to java or dotnet dept
-- select * from employ where dept not like 'java' and dept not like 'dotnet';
select * from employ where dept not in ('java' and 'dotnet');

-- Display all records on ascending order by dept
select * from employ order by dept;

-- Display all records on ascending order by dept and name
select * from employ order by dept asc,name asc;

-- Display all records on ascending order by dept and name wise descending
select * from employ order by dept asc,name desc;


-- SQL JOINS
select Empno,name,basic 
from employ where basic between 40000 and 60000
UNION
select Empno,name,basic 
from employ where basic between 50000 and 85000; 

select Empno,name,basic 
from employ where basic between 40000 and 60000
UNION ALL
select Empno,name,basic 
from employ where basic between 50000 and 85000 ;

desc dept;
desc emp;

select deptno from dept;

select distinct deptno from emp;

select dept.deptno,dname,
empno,ename,sal
from dept inner join emp
where dept.deptno = emp.deptno;

select D.deptno,dname,
empno,ename,sal
from dept D inner join emp E
where D.deptno = E.deptno;


select D.deptno, dname,
empno,ename,sal
from dept D left join emp E 
on D.deptno = E.deptno;
