create database inventry;

use inventory;

create table stock
(
	stockid varchar(30) primary key,
	ItemName varchar(30),
	Price numeric(9,2),
	QuantityAvail INT
);

Create table Orders
(
   OrderId INT,
   StockID varchar(30),
   QtyOrd INT,
   billAmt numeric(9,2)
);

Create Table Amount
(
  Gamt numeric(9,2)
);

insert into amount values(0);


commit;

insert into Stock values('S001','Phone',25000,30);
insert into Stock values('S002','Phone',25000,30);
insert into Stock values('S003','Phone',25000,30);
insert into Stock values('S004','Phone',25000,30);
insert into Stock values('S005','Phone',25000,30);



