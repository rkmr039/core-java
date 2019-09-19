create database hotel;
use hotel;
select * from room; 
drop table room;
Create Table Room
(
   RoomID varchar(10) primary key,
   Type varchar(10),
   Status varchar(10) default 'Available',
   CostPerDay INT
);

-- Type must be Single or Double 

Create Table Booking
(
  BookId varchar(10) primary key,
  RoomID varchar(10),
  CustName varchar(30),
  City varchar(30),
  BookDate TIMESTAMP,
  ChkDate TimeStamp
);

select * from booking; 

 -- truncate table booking 

Create Table Billing 
(
billId int primary key,
   BookID varchar(10),
   RoomID varchar(10),
   NoOfDays INT,
   BillAmt INT
);

select * from room;
select max(RoomId) from Room;
update Room set Type='Double',CostPerDay=950, Status = 'Available' where RoomId = 'R001';

select * from booking;
delete from Booking where BookId = 'B001';

drop table billing;
select * from billing;
alter table billing 
	add column billId int primary key; 


