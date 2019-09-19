create table Student
(
   sno int primary key,
 name varchar(30) not null,
 sub1 int,
 sub2 int,
 sub3 int,
 total numeric(9,2),
 aveg numeric(9,2)
 
);
CREATE TABLE `exam` (
  `eid` int(11) NOT NULL AUTO_INCREMENT,
  `subject` varchar(30) NOT NULL,
  `mark` double DEFAULT NULL,
  `sid` int(11) DEFAULT NULL,
  PRIMARY KEY (`eid`),
  KEY `sid` (`sid`),
  CONSTRAINT `exam_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `student` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
drop table Student;
insert into Student(sno, name,sub1,sub2,sub3)
values
(1,'Prem',67,65,74),
(2,'Lakshi',78,43,78),
(3,'Vishali',78,43,78),
(4,'Deepa',88,56,75);
use sqlpractice;
update Student 
set
  TOTAL = sub1+sub2,
  Aveg = (sub1+sub2+sub2)/3;

