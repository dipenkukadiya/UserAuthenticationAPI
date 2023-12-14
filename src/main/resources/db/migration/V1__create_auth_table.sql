CREATE TABLE IF NOT EXISTS user_authentication
(
    user_id             bigint(20) not null AUTO_INCREMENT,
    user_name         varchar(50) not null,
    email               varchar(50) not null,
    password             varchar(50) not null,
    user_status           boolean  not null,
    primary key (user_id),
    unique key (email)
);
INSERT INTO user_authentication (user_name, email, password, user_status)
VALUES
    ('JohnDoe', 'john.doe@example.com', 'password123', true),
    ('JaneSmith', 'jane.smith@example.com', 'securepass', false),
    ('BobJohnson', 'bob.johnson@example.com', 'qwerty', true),

    ('RandomUser', 'random.user@example.com', 'randompassword', false);