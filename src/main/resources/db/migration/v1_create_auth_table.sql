CREATE TABLE user_authentication
(
    user_id             bigint(20) not null AUTO_INCREMENT,
    user_name         varchar(50) not null,
    email               varchar(50) not null,
    password             varchar(50) not null,
    user_status           boolean  not null,
    primary key (user_id),
    unique key (email)
);
