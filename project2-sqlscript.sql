
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
	order_status_id integer, 
	FOREIGN KEY (customer_id) REFERENCES customers (customer_id),
	FOREIGN KEY (payment_id) REFERENCES payment (payment_id),
	FOREIGN KEY (product_id) REFERENCES products (product_id),
	FOREIGN KEY (order_status_id) REFERENCES order_status (order_status_id)
);

CREATE TABLE order_status(
	order_status_id SERIAL PRIMARY KEY,
	order_status VARCHAR NOT NULL
);




DROP TABLE accounts;
DROP TABLE orders;
DROP TABLE customers;
DROP TABLE products;
DROP TABLE payment;
DROP TABLE category;
DROP TABLE shopping_cart ;

SELECT * FROM accounts;

SELECT * FROM customers;

SELECT * FROM category;

SELECT * FROM products;

SELECT * FROM payment;

SELECT * FROM orders;

SELECT * FROM order_status;

<<<<<<< HEAD
INSERT INTO accounts VALUES (DEFAULT, 'username', 'password');
INSERT INTO accounts VALUES (DEFAULT, 'dawn', 'thepass');
INSERT INTO accounts VALUES (DEFAULT, 'eye', 'pizza');

INSERT INTO customers VALUES (DEFAULT,DEFAULT,'josh', 'frazier', '123 wallaby way', 'city', 12345, 'usa', 2401239567, 'myemail@gmail.com', 5000299000000000, 'visa', 0721);
INSERT INTO customers VALUES 
(DEFAULT,DEFAULT,'Dawn','EverGreen','66 hillway','city',54321,'island',5556669999,'email@evergreen.com',1111222233334444,'master',3000
);
=======

>>>>>>> 3debcdf69cb28a76b06452cf05b838f5153929cc


--SELECT FORMAT (0234567890, '000-000-0000');

DELETE FROM customers WHERE customer_id = 1;


INSERT INTO category VALUES (1, 'weapons');
INSERT INTO category VALUES (2, 'artifacts');
INSERT INTO category VALUES (3, 'gadgets');
INSERT INTO category VALUES (4, 'armor');

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
<<<<<<< HEAD
WHERE accounts.username = username AND accounts.PASSWORD = PASSWORD; 
=======
WHERE accounts.username = 'username' AND accounts.PASSWORD = 'password';

SELECT * FROM accounts;
SELECT * FROM customers;
>>>>>>> b7afdf39475fe54ea20e2d475d99340ba2c63946
 
INSERT INTO accounts VALUES (DEFAULT, 'username', 'password');



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

INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (1, 'MjölnirMk2', 1, 3, 50000.00, 'Mass produced hammer of mysterious origins', 'very heavy');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (2, 'Mesmeric Orb', 2, 6, 2000000.00, 'Cant sleep? Trapped by marriage? Robbing a bank? Buy the next best sleeping aid today!', 'Highly recommend you cover with a cloth for storage. Keep forgetting to avert my eyes when I walk by.');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (3, 'Grappling Hook', 3, 50, 250.00, 'Adaptable fit for any wrist type', 'Quality is great. Do yall offer refunds though? My marriage is in danger if Im caught playing hero again.');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (4, 'Wonder Cape', 4, 20, 250000.00, 'Fits like a glove...or a cape.', 'Dont use for target practice. This thing can literally reflect bullets. ');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (5, 'Infinity Stones', 2, 6, 2000000.00, 'Thanos sends his regards', 'What a rip-off piece of junk. Waited months for it to show up and it doesnt even...wait. What year is it?');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (6, 'Wonder Bread', 1, 6, 2400.00, 'Mass-produced genetically altered bread. Comes in packs of 6.', 'Bought this as a joke. Burned my house down. Give me my life back.');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (7, 'Earrings of Spite', 3, 6, 2000000.00, 'Erects an air-shield around you in times of crisis', 'These are great! Careful to read the fine print though. Random bouts of excitement may lower the crisis threshold.');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (8, 'Boots of Hermes', 4, 100.00, 100.00, 'adaptable fit to any wrist type', 'Perfect example of high supply, low demand. Theres been an increased rate of death by flight lately. Youve been warned.');


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
