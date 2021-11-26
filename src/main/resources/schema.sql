-- ALTER TABLE providers
--     DROP FOREIGN KEY FK9akjf68hho3lk17ll3ecebyc5;
DROP TABLE IF EXISTS users_roles;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS roles;
-- ALTER TABLE providers
--     DROP FOREIGN KEY FKin8gn4o1hpiwe6qe4ey7ykwq7;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS providers;
DROP TABLE IF EXISTS test;

create table providers
(
    id           bigint auto_increment,
    name         varchar(255),
    enabled      boolean,
    city         varchar(255),
    address      varchar(255),
    phone_number varchar(255),
    email        varchar(255),
--     product_id   bigint,
--     user_id      bigint,
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
    provider_id    bigint,
    primary key (id),
    constraint FK7s32q29gv59m1m4khhr2bd9ox foreign key (provider_id) references providers (id)
);
-- ALTER TABLE providers
--     ADD CONSTRAINT FKin8gn4o1hpiwe6qe4ey7ykwq7 FOREIGN KEY (user_id) REFERENCES users (id);

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
    id                bigint auto_increment,
    name              varchar(255),
    unit              varchar(255),
    price             decimal,
    manufacturing     varchar(255),
    expiration_date   varchar(255),
    factory_packaging varchar(255),
    enabled           boolean,
    provider_id       bigint,
    primary key (id),
    CONSTRAINT FK2o0jvgh89lemvvo17cbqvdxaa FOREIGN KEY (provider_id) REFERENCES providers (id)

);

-- ALTER TABLE providers
--     ADD CONSTRAINT FK9akjf68hho3lk17ll3ecebyc5 FOREIGN KEY (product_id) REFERENCES products (id);
