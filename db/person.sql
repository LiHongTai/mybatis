CREATE TABLE person(
	id INT PRIMARY KEY AUTO_INCREMENT, 
	name VARCHAR(20), 
	sex char(2)
); 

insert into person(name,sex)values('A','男');
insert into person(name,sex)values('B','女');
insert into person(name,sex)values('C','男');

DELIMITER $
CREATE PROCEDURE mybatis.get_user_count(IN sex_id INT,OUT user_count INT)
begin
	if sex_id = 0 then 
	select count(1) from person where sex = '女' into user_count;
	else
	select count(1) from person where sex = '男' into user_count;
	end if;
end 
$
DELIMITER ;

#调用存储过程
SET @user_count = 0;
CALL mybatis.get_user_count(1,@user_count);
select @user_count;