INSERT INTO customers (customer_id, username, password, first_name, last_name, address, city, postal_code, country, tel_no, email, credit_card, credit_card_type, card_expirary_date) VALUES(1, 'username', 'password', 'josh', 'frazier', '123 wallaby way', 'city', 12345, 'usa', 2401239567, 'myemail@gmail.com', 5000299000000000, 'visa', 0721);


INSERT INTO category (category_id, category_name) VALUES (1, 'weapons');
INSERT INTO category (category_id, category_name) VALUES (2, 'artifacts');
INSERT INTO category (category_id, category_name) VALUES (3, 'gadgets');
INSERT INTO category (category_id, category_name) VALUES (4, 'armor');

INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (1, 'MjölnirMk2', 1, 3, 50000.00, 'Mass produced hammer of mysterious origins', 'very heavy');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (2, 'Mesmeric Orb', 2, 6, 2000000.00, 'Cant sleep? Trapped by marriage? Robbing a bank? Buy the next best sleeping aid today!', 'Highly recommend you cover with a cloth for storage. Keep forgetting to avert my eyes when I walk by.');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (3, 'Grappling Hook', 3, 50, 250.00, 'Adaptable fit for any wrist type', 'Quality is great. Do yall offer refunds though? My marriage is in danger if Im caught playing hero again.');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (4, 'Wonder Cape', 4, 20, 250000.00, 'Fits like a glove...or a cape.', 'Dont use for target practice. This thing can literally reflect bullets. ');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (5, 'Infinity Stones', 2, 6, 2000000.00, 'Thanos sends his regards', 'What a rip-off piece of junk. Waited months for that green one to show up and it doesnt even...wait. What year is it?');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (6, 'Wonder Bread', 1, 50000, 2400.00, 'Mass-produced genetically altered bread. Comes in packs of 6.', 'Bought this as a joke. Burned my house down. Give me my life back.');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (7, 'Earrings of Spite', 3, 6, 2000000.00, 'Erects an air-shield around you in times of crisis', 'These are great! Careful to read the fine print though. Random bouts of excitement may lower the crisis threshold.');
INSERT INTO products (product_id, product_name, category_category_id, quantity, price, product_desc, product_review) VALUES (8, 'Boots of Hermes', 4, 100.00, 100.00, 'Why fly first class when you can fly S-class?', 'Perfect example of high supply, low demand. Theres been an increased rate of death by flight lately. Youve been warned.');

INSERT INTO orders (order_id, order_status, order_date, total_quantity, price_total, customer_fk) VALUES (2,'previousOrder', '2022-8-22', 1 , 100, 1);
--We have to specify the rows we're inserting into.