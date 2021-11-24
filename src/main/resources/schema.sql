DROP TABLE IF EXISTS users_roles;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS roles;
ALTER TABLE companies
    DROP FOREIGN KEY FKin8gn4o1hpiwe6qe4ey7ykwq7;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS companies;
DROP TABLE IF EXISTS test;

create table companies
(
    id   bigint auto_increment,
    name varchar(255),
    enabled boolean,
    city varchar(255),
    address varchar(255),
    phone_number varchar(255),
    email varchar(255),
    product_id varchar(255),
    user_id bigint,
    primary key (id)
);

create table users
(
    id            bigint auto_increment,
    email         varchar(255),
    enabled       boolean,
    first_name    varchar(255),
    last_name     varchar(255),
    login         varchar(255),
    password      varchar(255),
    phone_number  varchar(255),
    register_date varchar(255),
    company_id    bigint,
    primary key (id),
    constraint FK7s32q29gv59m1m4khhr2bd9ox foreign key (company_id) references companies (id)
);
ALTER TABLE companies
    ADD CONSTRAINT FKin8gn4o1hpiwe6qe4ey7ykwq7 FOREIGN KEY  (user_id) REFERENCES users(id) ;

create table roles
(
    id   bigint auto_increment,
    name varchar(255),
    primary key (id)
);

create table users_roles
(
    user_id bigint,
    role_id bigint,
    CONSTRAINT FKsin2g6p2nm7ftkew1nt85i8u7 FOREIGN KEY (user_id) REFERENCES users (id),
    CONSTRAINT FKat8p3s7yjcp57lny4udqvqncq FOREIGN KEY (role_id) REFERENCES roles (id)
);

create table products
(
    id          bigint auto_increment,
    name        varchar(255),
    price       decimal,
    description varchar(255),
    deleted     boolean,
    company_id     bigint,
    primary key (id),
    CONSTRAINT FK2o0jvgh89lemvvo17cbqvdxaa FOREIGN KEY (company_id) REFERENCES companies (id)

);