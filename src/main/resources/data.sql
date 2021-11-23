insert into roles (id, name)
VALUES (1, 'ROLE_ADMIN'),
       (2, 'ROLE_USEr');

insert into users (login, password, company, email, enabled, first_name, last_name, phone_number, register_date)
VALUES ('admin', 'admin', null, 'admin@gmail.com', true, null, null, null, null),
       ('user', 'user', null, 'user@gmail.com', true, null, null, null, null);

insert into users_roles (user_id, role_id)
VALUES (1, 1),
       (2, 2);

