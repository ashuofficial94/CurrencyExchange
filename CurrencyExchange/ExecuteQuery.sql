create database jdbcdb;

create table currency (

	inputAmount double, 
	outputAmount double, 
	inputCurrency varchar(3), 
	outputCurrency varchar(3), 
	exchangeDate TimeStamp default current_timestamp
);

drop table currency;

select * from currency;

insert into currency(inputAmount, outputAmount, inputCurrency, outputCurrency) values(90, 1.26, 'inr', 'usd');