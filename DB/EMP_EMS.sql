create database EMS_DB;
use EMS_DB;


CREATE TABLE EMPLOYEE(
  EMP_ID INT PRIMARY KEY,
  EMP_NAME VARCHAR(20) NOT NULL,
  EMP_EMAIL VARCHAR(30) NOT NULL,
  EMP_MOB_NO BIGINT NOT NULL,
  EMP_DPT_NAME VARCHAR(20),
  EMP_DATE_JOINED DATE NOT NULL,
  EMP_MGR_ID INT ,
  FOREIGN KEY (EMP_MGR_ID) REFERENCES EMPLOYEE(EMP_ID),
  EMP_LEAVE_BALANCE INT
  );
  
  CREATE TABLE LEAVE_HISTORY(
  LEA_ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  LEA_START_DATE DATE NOT NULL,
  LEA_END_DATE DATE NOT NULL,
  LEA_NO_OF_DAYS INT,
  LEA_REASON VARCHAR(100),
  LEA_TYPE ENUM ('EL'),
  LEA_APPLIED_ON DATE,
  LEA_MGR_COMMENTS VARCHAR(100),
  EMP_ID INT(11),
  FOREIGN KEY (EMP_ID) REFERENCES EMPLOYEE(EMP_ID),
  LEA_STATUS ENUM('APPROVED','DENIED','PENDING')
  );
  
INSERT INTO EMPLOYEE (EMP_ID,EMP_NAME, EMP_EMAIL,EMP_MOB_NO,EMP_DPT_NAME,EMP_DATE_JOINED, EMP_MGR_ID, EMP_LEAVE_BALANCE) VALUES
(1000,'SHUBHAM GUPTA', 'SHUBHAMG2@HEXAWARE.COM', 8878339946,'CEO','2017-11-14', NULL,4), 
(2000,'YUVARAJ SANKAR', 'YUVARAJSANKARJ@HEXAWARE.COM',8883315009,'BI ', '2017-11-14',1000, 0),
(3000,'MANASWINI PANDA', 'MANASWINIP@HEXAWARE.COM',7064672738, 'HRM','2017-11-14',1000, 15),
(4000,'ANKITA', 'ANKITA2@HEXAWARE.COM', 8825792015,'BI','2017-11-14',2000, 5),
(5000,'PRIYA TRIPATHY', 'PRIYAT@HEXAWARE.COM',9090505919,'HRM','2017-11-14',3000, 7);


select * from Employee; 

update employee set EMP_LEAVE_BALANCE = 4 where EMP_ID = 2000;

drop table EMP_LOGIN;

create table EmployLogin(
 EMP_ID INT NOT NULL UNIQUE PRIMARY KEY,
 SecretCode varchar(50) NOT NULL,
 FOREIGN KEY (EMP_ID) REFERENCES EMPLOYEE(EMP_ID)
);

insert into EmployLogin values
(1000,'Rishab'),
(2000,'Laxmi'),
(3000,'Raghu'),
(4000,'Bindu'),
(5000,'SaiKiran');

alter table  leave_history AUTO_INCREMENT =1;
select * from leave_history;
delete from leave_history where LEA_ID = 10;
SELECT * FROM ems_db.employlogin;

update leave_history set LEA_STATUS = 'PENDING',LEA_MGR_COMMENTS = ''  where LEA_ID = 3;
update employee set EMP_LEAVE_BALANCE = EMP_LEAVE_BALANCE - 1 where EMP_ID = 3000;
select EMP_ID from employee where EMP_MGR_ID = 2000;
select * from leave_history where EMP_ID = 2000;
select * from employee;