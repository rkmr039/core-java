create database college; 

use college;

create table CourseList
(
   courseno varchar(15) primary key,
   duration int,
   startDate date,
   endDate date,
   HOD varchar(30)
);



drop table if exists subjects;

create table subjects
(

  subId INT primary key auto_increment,

   year int,
instructor varchar(28),

subject varchar(150),

theory int,

practical int
);



Create Table Feedback 
(
   fid varchar(15) primary key,
   studentName varchar(30),
   instructor varchar(30),
   subject varchar(30),
   fbvalue varchar(30)
);

select * from feedback;

SELECT * FROM college.feedback;

select * from subjects;
SELECT instructor from Subjects;

SELECT * FROM college.courselist;
SELECT subject from Subjects where instructor = 'Prasanna';
update subjects set instructor = 'Juhi ' where subId = 4;

select subject,instructor from Subjects where instructor in (SELECT distinct instructor from Subjects);
select fbvalue,count(*) from Feedback where instructor = 'Prasanna' and subject = 'SQL Server' group by fbvalue;