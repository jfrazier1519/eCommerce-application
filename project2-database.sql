CREATE TABLE customers (
	customer_id SERIAL PRIMARY KEY,
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
	card_expirary_date VARCHAR(50) NOT NULL
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
	payment_date INTEGER NOT NULL,
	allowed VARCHAR(50) NOT NULL
);


CREATE TABLE orders (
	order_id SERIAL PRIMARY KEY,
	customer_id INTEGER NOT NULL,
	payment_id INTEGER NOT NULL,
	order_date INTEGER NOT NULL,
	product_id INTEGER NOT NULL,
	price NUMERIC NOT NULL,
	quantity NUMERIC NOT NULL,
	total NUMERIC NOT NULL,
	FOREIGN KEY (customer_id) REFERENCES customers (customer_id),
	FOREIGN KEY (payment_id) REFERENCES payment (payment_id),
	FOREIGN KEY (product_id) REFERENCES products (product_id)
);

DROP TABLE orders;
DROP TABLE customers;
DROP TABLE products;
DROP TABLE payment;



SELECT * FROM customers;

SELECT * FROM category;

SELECT * FROM products;

SELECT * FROM payment;

SELECT * FROM orders;


INSERT INTO customers VALUES (1, 'josh', 'jr', '123 wallaby way', 'city', 12345, 'usa', 2401239567, 'myemail@gmail.com', 5000299000000000, 'visa', 0721);

--SELECT FORMAT (0234567890, '000-000-0000');

DELETE FROM customers WHERE customer_id = 1;


INSERT INTO category VALUES (1, 'weapons');
DELETE FROM category WHERE category_id = 1;


INSERT INTO products VALUES (1, 'thor hammer', 1, 4, 5000.00, 'special hammer', 'very heavy');

INSERT INTO payment VALUES (1, 'credit card', 1, 20220728, 1);
DELETE FROM payment WHERE payment_id = 1;


INSERT INTO orders VALUES (1, 1, 1, 20220727, 1, 5000.00, 1, 5100.25);
DELETE FROM orders WHERE order_id = 1;


