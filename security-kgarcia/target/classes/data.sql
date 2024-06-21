delete from  user_role;
delete from  roles;
delete from  users;


INSERT INTO roles (role_id, name) VALUES 
(1, 'ROLE_ADMIN'),
(2, 'ROLE_FACULTY'),
(3, 'ROLE_STUDENT')
;

INSERT INTO users (user_id, email, password, name) VALUES 
(1, 'admin@gmail.com', 'admin', 'Admin'),
(2, 'faculty@gmail.com', 'faculty', 'Faculty');
(3, 'student@gmail.com', 'student', 'Student');


insert into user_role(user_id, role_id) values
(1,1),
(2,2),
(3,3)
;
