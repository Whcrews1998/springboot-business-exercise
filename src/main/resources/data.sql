insert into BUSINESS(id, name) values(1, 'Harris Inc');

insert into EQUIPMENT(id, name, business_id) values(10,'computer', 1);
insert into EQUIPMENT(id, name, business_id) values(11,'Desk', 1);
insert into EQUIPMENT(id, name, business_id) values(12,'Server', 1);

insert into employee(id, position, first_name, last_name, salary, business_id) values(100, 'Software Developer', 'Harris', 'Crews', 100, 1);
insert into employee(id, position, first_name, last_name, salary, business_id) values(101, 'Quality Assurance', 'Spencer', 'Buko', 100, 1);
insert into employee(id, position, first_name, last_name, salary, business_id) values(102, 'DevOps', 'Mick', 'Gulladge', 100, 1);