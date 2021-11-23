DROP TABLE IF EXISTS users_roles;
DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS users;


create table users
(
    id            bigint  auto_increment,
    company       varchar(255),
    email         varchar(255),
    enabled       boolean,
    first_name    varchar(255),
    last_name     varchar(255),
    login         varchar(255),
    password      varchar(255),
    phone_number  varchar(255),
    register_date varchar(255),
    primary key (id)
);

create table roles
(
    id   bigint,
    name varchar(255),
    primary key (id)
);

create table users_roles(
    user_id bigint,
    role_id bigint
);

create table products(
    id bigint,
    name varchar(255),
    price decimal,
    description varchar(255),
    deleted boolean

);

