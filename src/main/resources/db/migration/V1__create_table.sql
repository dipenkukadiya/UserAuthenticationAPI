-- V1__create_table_auth.sql

CREATE TABLE IF NOT EXISTS user_authentication (
    user_id       BIGINT(20) NOT NULL AUTO_INCREMENT,
    user_name     VARCHAR(50) NOT NULL,
    email         VARCHAR(50) NOT NULL,
    password      VARCHAR(50) NOT NULL,
    user_status   BOOLEAN NOT NULL,
    PRIMARY KEY (user_id),
    UNIQUE KEY (email)
);
