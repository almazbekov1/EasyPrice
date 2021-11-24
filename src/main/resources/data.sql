insert into roles (id, name)
VALUES (1, 'ROLE_ADMIN'),
       (2, 'ROLE_USER');

insert into companies (address, city, email, enabled, name, phone_number) VALUES
('address 1','Bishkek',null,true,'name 1','888888'),
('address 2','Bishkek',null,true,'name 2','978882');


insert into users (login, password, email, enabled, first_name, last_name, phone_number, register_date,company_id)
VALUES ('admin', 'admin', 'admin@gmail.com', true, null, null, null, null,1),
       ('user', 'user', 'user@gmail.com', true, null, null, null, null,2);

insert into users_roles (user_id, role_id)
VALUES (1, 1),
       (2, 2);

insert into products (deleted, description, name, price, company_id) VALUES
(true,'description 1','name1',1899,1),
(true,'description 2','name2',766,1),
(false,'description 3','name3',2333,2);
