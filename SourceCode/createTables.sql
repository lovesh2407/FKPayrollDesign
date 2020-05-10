create table EmployeeByHour (
	name varchar(20),
	employeeId integer primary key,
	postalAddress varchar(50),
	bankAccount integer,
	weeklyDueRate integer,
	ServiceCharge integer,
	hourlyRate integer,
	toBePaid integer
); 


create table EmployeeBySalary (
	name varchar(20),
	employeeId integer primary key,
	postalAddress varchar(50),
	bankAccount integer,
	weeklyDueRate integer,
	ServiceCharge integer,
	salary integer
); 


create table EmployeeBySale (
	name varchar(20),
	employeeId integer primary key,
	postalAddress varchar(50),
	bankAccount integer,
	weeklyDueRate integer,
	ServiceCharge integer,
	commissionRate integer,
	toBePaid integer
); 

