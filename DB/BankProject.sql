create database bank;

use bank;

Create Table Accounts
(
   AccountNo INT primary key,
   FirstName varchar(30),
   LastName varchar(30),
   City varchar(30),
   State varchar(30),
   Amount INT,
   CheqFacil varchar(10),
   AccountType varchar(20),
   Status varchar(10) default 'active',
   DateOfOpen TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
Create Table Trans
(
      AccountNo int,
      TransAmount numeric(9,2),
      TransDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
      TransType varchar(10)
);

select
 case
     when max(accountNo) IS NULL THEN 1
      else max(accountNo)+1
END accno
FROM Accounts; 
update accounts set Status ='active' where AccountNo = 1;
select * from accounts;