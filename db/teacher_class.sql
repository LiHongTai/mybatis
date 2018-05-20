CREATE TABLE teacher(
	t_id INT PRIMARY KEY auto_increment,
	t_name varchar(20)
);

CREATE TABLE class(
	c_id INT PRIMARY KEY auto_increment,
	c_name varchar(20),
	teacher_id INT
);

alter table class add constraint fk_teacher_id foreign key(teacher_id) references teacher(t_id);

insert into teacher(t_name) values('teacher_1');
insert into teacher(t_name) values('teacher_2');

insert into class(c_name,teacher_id)values('grade_1',1);
insert into class(c_name,teacher_id)values('grade_2',2);