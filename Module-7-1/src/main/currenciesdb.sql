DROP DATABASE IF EXISTS currencies;
CREATE DATABASE currencies;
USE currencies;

CREATE TABLE currency (

      id INT NOT NULL AUTO_INCREMENT,
      abbreviation VARCHAR(3) NOT NULL,
      name VARCHAR(50) NOT NULL,
      rate_to_usd DECIMAL(12, 6) NOT NULL,
      PRIMARY KEY (id)
);

INSERT INTO currency (abbreviation, name, rate_to_usd) VALUES
    ('USD', 'US Dollar', 1.000000),
    ('EUR', 'Euro', 1.100000),
    ('GBP', 'British Pound', 1.310000),
    ('PHP', 'Philippine Peso', 0.016000),
    ('MXN', 'Mexican Peso', 0.051000),
    ('SGD', 'Singaporean Dollar', 0.780000),
    ('PKR', 'Pakistani Rupee', 0.003600),
    ('RUB', 'Russian Rouble', 0.012000);

DROP USER IF EXISTS 'appuser'@'139.112.64.8';
CREATE USER 'appuser'@'139.112.64.8' IDENTIFIED BY '123pass';
GRANT SELECT ON currencies.* TO 'appuser'@'139.112.64.8';