INSERT INTO customers (customer_id, username, password, first_name, last_name, address, city, postal_code, country, tel_no, email, credit_card, credit_card_type, card_expirary_date) VALUES(1, 'username', 'password', 'josh', 'frazier', '123 wallaby way', 'city', 12345, 'usa', 2401239567, 'myemail@gmail.com', 5000299000000000, 'visa', 0721);


INSERT INTO category (category_id, category_name) VALUES (1, 'weapons');
INSERT INTO category (category_id, category_name) VALUES (2, 'artifacts');
INSERT INTO category (category_id, category_name) VALUES (3, 'gadgets');
INSERT INTO category (category_id, category_name) VALUES (4, 'armor');

INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (1, 'thor hammer', 1, 3, 5000.00, 'special hammer we managed to replicate', 'very heavy');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (2, 'infinity stones', 2, 6, 2000000.00, 'yes, its those stones', 'are these even real?');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (3, 'grappling hook', 3, 50, 100.00, 'adaptable fit to any wrist type', 'fits like a glove');

INSERT INTO orders (order_id, order_status, order_date, total_quantity, price_total, customer_fk) VALUES (2,'previousOrder', '2022-8-22', 1 , 100, 1);
--We have to specify the rows we're inserting into.