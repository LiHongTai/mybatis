CREATE TABLE orders(
	order_id INT PRIMARY KEY auto_increment,
	order_no varchar(20),
    order_price double
);
insert into orders(order_no,order_price)values('aaaa',23);
insert into orders(order_no,order_price)values('bbbb',33);
insert into orders(order_no,order_price)values('cccc',11);
insert into orders(order_no,order_price)values('dddd',22);