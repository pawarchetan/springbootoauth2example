insert into user_tbl(id, name, login, password) values (1,'Chetan','pawarc1709@gmail.com','test1');
insert into user_tbl(id, name, login, password) values (2,'Chetan Pawar','pawarchetan1709@gmail.com','test2');

insert into role_tbl(id, name) values (1,'ROLE_USER');
insert into role_tbl(id, name) values (2,'ROLE_ADMIN');

insert into user_role(user_id, role_id) values (1,1);
insert into user_role(user_id, role_id) values (1,2);
insert into user_role(user_id, role_id) values (2,1);
