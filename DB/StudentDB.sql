

create database modeTwoDB;
use modeTwoDB;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rollNum` int(11) DEFAULT NULL,
  `sname` varchar(30) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `country` varchar(15) DEFAULT NULL,
  `DateOfJoin` datetime DEFAULT NULL,
  `finalScore` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;


CREATE TABLE `exam` (
  `eid` int(11) NOT NULL AUTO_INCREMENT,
  `subject` varchar(30) NOT NULL,
  `mark` double DEFAULT NULL,
  `sid` int(11) DEFAULT NULL,
  PRIMARY KEY (`eid`),
  KEY `sid` (`sid`),
  CONSTRAINT `exam_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `student` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

select * from Student;
select * from exam;
alter table student modify column finalScore double;

delete from exam;
delete from student;
ALTER TABLE student AUTO_INCREMENT = 1;
ALTER TABLE exam AUTO_INCREMENT = 1;



delete from Student where name = 'Vishali';
select avg(mark) from exam where sid = 8;