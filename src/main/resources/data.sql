insert into roles (id, name)
VALUES (1, 'ROLE_ADMIN'),
       (2, 'ROLE_USER');

insert into providers (id, name, enabled, city, address, phone_number, email)
VALUES (1, 'name 1', true, 'Bishkek', 'address 1', null, true),
       (2, 'name 2', true, 'Bishkek', 'address 2', null, true);

insert into users (login, password, email, enabled, first_name, last_name, phone_number, register_date, provider_id)
VALUES ('admin', 'admin', 'admin@gmail.com', true, null, null, null, null, 1),
       ('user', 'user', 'user@gmail.com', true, null, null, null, null, 2);

insert into users_roles (user_id, role_id)
VALUES (1, 1),
       (2, 2);

insert into products (id, name, unit, price, manufacturing, expiration_date, factory_packaging, enabled, provider_id)
VALUES (1, 'productName1', 'штук', 800, 'farm', '29.20.21', null, true, 1),
       (2, 'productName2', 'штук', 800, 'farm', '29.20.21', null, true, 1),
       (3, 'productName3', 'штук', 900, 'farm', '29.20.21', null, true, 2);
