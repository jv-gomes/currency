CREATE DATABASE currency_db;
CREATE DATABASE history_db;

CREATE USER currency_user WITH ENCRYPTED PASSWORD 'currency_pass';
CREATE USER history_user WITH ENCRYPTED PASSWORD 'history_pass';

GRANT ALL PRIVILEGES ON DATABASE currency_db TO currency_user;
GRANT ALL PRIVILEGES ON DATABASE history_db TO history_user;
