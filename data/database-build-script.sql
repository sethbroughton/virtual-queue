-- CREATE SCHEMA public;
 --BEGIN TRANSACTION;

DROP TABLE IF EXISTS accounts;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS accounts_users;

CREATE TABLE accounts (
 account_id SERIAL PRIMARY KEY,
 account_name varchar NOT NULL, 
 account_phone_number varchar NOT NULL

);

CREATE TABLE users (
 user_id SERIAL PRIMARY KEY,
 user_phone_number varchar NOT NULL
);

CREATE TABLE accounts_users (
 account_id integer NOT NULL,
 user_id integer NOT NULL,
 status boolean NOT NULL,
 check_in_time timestamp NOT NULL,
 CONSTRAINT pk_account_id PRIMARY KEY (account_id, user_id),
 CONSTRAINT fk_user_id FOREIGN KEY(user_id) REFERENCES users (user_id),
 CONSTRAINT fk_account_id FOREIGN KEY(account_id) REFERENCES accounts (account_id)
);


