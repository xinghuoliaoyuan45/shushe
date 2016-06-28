

DROP TABLE IF EXISTS admin;
CREATE TABLE admin (
  Admin_ID int identity primary key,
  Admin_Username varchar(20) DEFAULT NULL,
  Admin_Password varchar(20) DEFAULT NULL,
) 
insert into admin (Admin_Username,Admin_Password)values ('张三','123')

DROP TABLE IF EXISTS domitory;
CREATE TABLE domitory(
  Domitory_ID int identity primary key,
  Domitory_Desc varchar(20) DEFAULT NULL, 
)

DROP TABLE IF EXISTS student;
CREATE TABLE student(
  Student_ID bigint  identity primary key,
  Student_DomitoryID varchar(20) DEFAULT NULL,
  Student_Name varchar(20) DEFAULT NULL,
  Student_Tel bigint  DEFAULT NULL,
) 

DROP TABLE IF EXISTS log;
Create table log(
  Log_ID bigint identity  primary key,
  Student_ID bigint DEFAULT NULL ,
  Student_DomitoryID varchar(20) DEFAULT NULL,
  Student_Name varchar(20) DEFAULT NULL,
  Time varchar(20)  DEFAULT NULL,
)



