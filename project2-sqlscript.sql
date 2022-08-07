
CREATE TABLE accounts(
	account_id SERIAL PRIMARY KEY
	, username VARCHAR(50) NOT NULL
	, password VARCHAR(50) NOT NULL
);

CREATE TABLE customers (
	customer_id SERIAL PRIMARY KEY,
	account_id INTEGER,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	address VARCHAR(50) NOT NULL,
	city VARCHAR(50) NOT NULL,
	postal_code INTEGER NOT NULL,
	country VARCHAR(50) NOT NULL,
	tel_no NUMERIC NOT NULL,
	email VARCHAR(50) NOT NULL,
	credit_card VARCHAR(50) NOT NULL,
	credit_card_type VARCHAR(50) NOT NULL,
	card_expirary_date VARCHAR(50) NOT NULL,
	FOREIGN KEY (account_id) REFERENCES accounts (account_id)
);

CREATE TABLE category (
	category_id SERIAL PRIMARY KEY,
	category_name VARCHAR(50) NOT NULL
);




CREATE TABLE products (
	product_id SERIAL PRIMARY KEY,
	product_name VARCHAR(50) NOT NULL,
	category_id INTEGER NOT NULL,
	quantity INTEGER NOT NULL,
	price NUMERIC NOT NULL,
	product_desc VARCHAR(250) NOT NULL,
	product_review VARCHAR(250) NOT NULL,
	FOREIGN KEY (category_id) REFERENCES category (category_id)
);





CREATE TABLE payment (
	payment_id SERIAL PRIMARY KEY,
	payment_type VARCHAR(50) NOT NULL,
	payment_status NUMERIC NOT NULL,
	payment_date DATE DEFAULT CURRENT_TIMESTAMP,
	allowed VARCHAR(50) NOT NULL
);


CREATE TABLE orders (
	order_id SERIAL PRIMARY KEY,
	customer_id INTEGER NOT NULL,
	payment_id INTEGER NOT NULL,
	order_date DATE DEFAULT CURRENT_TIMESTAMP, --STILL DOESN'T WORK?
	product_id INTEGER NOT NULL,
	price NUMERIC NOT NULL,
	quantity NUMERIC NOT NULL,
	total NUMERIC NOT NULL,
	FOREIGN KEY (customer_id) REFERENCES customers (customer_id),
	FOREIGN KEY (payment_id) REFERENCES payment (payment_id),
	FOREIGN KEY (product_id) REFERENCES products (product_id)
);

CREATE TABLE shopping_cart (
	cart_id SERIAL PRIMARY KEY
	, customer_id INTEGER NOT NULL
	, product_id INTEGER NOT NULL
	, price NUMERIC NOT NULL
	, quantity NUMERIC NOT NULL
	, total NUMERIC NOT NULL
	, FOREIGN KEY (customer_id) REFERENCES customers (customer_id)
	, FOREIGN KEY (product_id) REFERENCES products (product_id)
	, FOREIGN KEY (price) REFERENCES products (product_id)
);

DROP TABLE accounts;
DROP TABLE orders;
DROP TABLE customers;
DROP TABLE products;
DROP TABLE payment;
DROP TABLE category;


SELECT * FROM accounts;

SELECT * FROM customers;

SELECT * FROM category;

SELECT * FROM products;

SELECT * FROM payment;

SELECT * FROM orders;


INSERT INTO accounts VALUES (1, 'username', 'password');

INSERT INTO customers VALUES (1, 1, 'josh', 'frazier', '123 wallaby way', 'city', 12345, 'usa', 2401239567, 'myemail@gmail.com', 5000299000000000, 'visa', 0721);

--SELECT FORMAT (0234567890, '000-000-0000');

DELETE FROM customers WHERE customer_id = 1;


INSERT INTO category VALUES (1, 'weapons');
DELETE FROM category WHERE category_id = 1;


INSERT INTO products VALUES (1, 'thor hammer', 1, 4, 5000.00, 'special hammer', 'very heavy');

INSERT INTO payment VALUES (1, 'credit card', 1, '07/28/2022', 1);
DELETE FROM payment WHERE payment_id = 1;


INSERT INTO orders VALUES (1, 1, 1, '07/27/2022', 1, 5000.00, 1, 5100.25);
DELETE FROM orders WHERE order_id = 1;




-----------------------------------ACCOUNT METHODS-----------------------------

SELECT * FROM accounts;

SELECT customers.customer_id, accounts.username, accounts.password, customers.first_name, customers.last_name 
FROM accounts
INNER JOIN customers
ON accounts.account_id = customers.account_id
WHERE accounts.username = username AND accounts.PASSWORD = PASSWORD;
 




-----------------------------------CATEGORY METHODS-----------------------------




-----------------------------------CUSTOMER METHODS-----------------------------

SELECT customer_id, first_name, last_name, address, city, postal_code, country, tel_no, email
FROM customers
WHERE customer_id = 1;

UPDATE customers 
SET customer_id = 1, first_name = 'josh', last_name = 'frazier', address = '123 wallaby way', city = 'Austin', postal_code = 75793, country = 'usa', tel_no = 9031280534, email = 'myemail@gmail.com'
WHERE customer_id = 1;






-----------------------------------ORDER METHODS-----------------------------






-----------------------------------PAYMENT METHODS-----------------------------





-----------------------------------PRODUCT METHODS-----------------------------

SELECT * FROM products;
SELECT * FROM category;
INSERT INTO products VALUES (1, 'thor hammer', 1, 3, 5000.00, 'special hammer we managed to replicate', 'very heavy');
INSERT INTO products VALUES (2, 'infinity stones', 2, 6, 2000000.00, 'yes, its those stones', 'are these even real?');
INSERT INTO products VALUES (3, 'grappling hook', 3, 50, 100.00, 'adaptable fit to any wrist type', 'fits like a glove');

--INSERT INTO category VALUES(4, 'armor');

SELECT products.product_name, products.quantity, products.price, products.product_desc, products.product_review
FROM products 
INNER JOIN category
ON products.category_id  = category.category_id;


SELECT products.product_name, products.quantity, products.price, products.product_desc, products.product_review
FROM products 
INNER JOIN category
ON products.category_id  = category.category_id 
WHERE category_name = 'weapons';
