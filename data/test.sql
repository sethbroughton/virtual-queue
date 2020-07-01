INSERT INTO accounts (account_name, account_phone_number) VALUES ('Jo Mama', '6145808483');
INSERT INTO accounts (account_name, account_phone_number) VALUES ('Joe crabs', '6145808483');
INSERT INTO accounts (account_name, account_phone_number) VALUES ('Bobbys bagels', '6145808483');
INSERT INTO accounts (account_name, account_phone_number) VALUES ('Pattys cakes', '6145808483');
SELECT * from accounts;

INSERT INTO users (user_phone_number) VALUES ('6145804838');
INSERT INTO accounts_users (account_id, user_id, status, check_in_time) VALUES (1,1, true,  current_timestamp);
INSERT INTO users (user_phone_number) VALUES ('6145804838');
INSERT INTO accounts_users (account_id, user_id, status, check_in_time) VALUES (1,2, true,  current_timestamp);
INSERT INTO users (user_phone_number) VALUES ('6145804838');
INSERT INTO accounts_users (account_id, user_id, status, check_in_time) VALUES (1,3, true,  current_timestamp);

INSERT INTO users (user_phone_number) VALUES ('6145804838');
INSERT INTO accounts_users (account_id, user_id, status, check_in_time) VALUES (1,4, true,  current_timestamp);


INSERT INTO users (user_phone_number) VALUES ('6145804838');
INSERT INTO accounts_users (account_id, user_id, status, check_in_time) VALUES (1,5, true,  current_timestamp);

UPDATE accounts_users SET status = false
WHERE user_id = 1 and account_id = 1;

SELECT * from accounts_users WHERE account_id =1 AND status =true ORDER BY check_in_time;