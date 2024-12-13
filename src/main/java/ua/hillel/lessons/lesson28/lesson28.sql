CREATE TABLE IF NOT EXISTS users (
	id SERIAL PRIMARY KEY,
	name VARCHAR(100) NOT NULL,
	email VARCHAR(150) UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS orders (
	order_id SERIAL PRIMARY KEY,
	order_date DATE NOT NULL,
	order_cost NUMERIC(10, 2) NOT NULL,
	user_id INT NOT NULL
);


ALTER TABLE orders 
ADD CONSTRAINT fk_user_orders
FOREIGN KEY (user_id) 
REFERENCES users(id);



INSERT INTO users (name, email) VALUES 
('Den', 'den@gmail.com'),
('Oleg', 'oleg@gmail.com'),
('Ivan', 'ivan@gmail.com'),
('Alex', 'alex@gmail.com');


SELECT * FROM users


INSERT INTO orders (order_date, order_cost, user_id) VALUES
('2024-01-01', 250, 1),
('2024-01-02', 150, 1),
('2024-01-03', 220, 2),
('2024-01-04', 550, 3),
('2024-01-05', 111, 2),
('2024-01-06', 444, 2),
('2024-02-02', 555, 3),
('2024-04-04', 111, 3),
('2024-11-11', 222, 4);



INSERT INTO orders (order_date, order_cost, user_id) VALUES
('2024-01-01', 111, 1)


SELECT * FROM orders WHERE user_id = 3 AND order_cost > 500 OR user_id = 1;



SELECT * FROM orders ORDER BY order_cost, user_id;



SELECT * FROM orders ORDER BY order_cost, user_id LIMIT 5;

SELECT * FROM orders ORDER BY order_cost, user_id LIMIT 5 OFFSET 3; 



SELECT * FROM orders WHERE user_id = (SELECT id FROM users WHERE email = 'ivan@gmail.com');



SELECT * FROM orders WHERE user_id IN (SELECT id FROM users WHERE email = 'ivan@gmail.com' OR email = 'alex@gmail.com');



SELECT order_id, order_date, (SELECT id FROM users WHERE email = 'ivan@gmail.com') AS user_id FROM orders;





SELECT AVG(order_cost) AS avg_cost, user_id, order_date
FROM orders
GROUP BY user_id, order_date;


SELECT user_id, COUNT(order_id) AS order_count, SUM(order_cost) AS total_cost, AVG(order_cost) AS avg_cost
FROM orders4
GROUP BY user_id
HAVING SUM(order_cost) > 700



INSERT INTO orders (order_date, order_cost, user_id) VALUES
('2024-01-15', 250, 1),
('2024-01-15', 250, 1);

SELECT  order_date, order_cost, user_id, 'Large Orders' AS category
FROM orders
WHERE order_cost > 300
UNION ALL
SELECT  order_date, order_cost, user_id, 'Small Orders' AS category
FROM orders
WHERE order_cost <= 300
ORDER BY category





SELECT orders.order_date, orders.order_cost, orders.user_id, users.name, users.email
FROM orders 
INNER JOIN users ON orders.user_id = users.id



SELECT o.order_date, o.order_cost, o.user_id, u.name, u.email
FROM orders AS o
INNER JOIN users AS u ON o.user_id = u.id 


SELECT o.order_date, o.order_cost, o.user_id, u.name, u.email
FROM orders AS o
INNER JOIN users AS u ON o.user_id = u.id AND u.email = 'den@gmail.com'



SELECT o.order_date, o.order_cost, o.user_id, u.name, u.email
FROM orders AS o
LEFT JOIN users AS u ON o.user_id = u.id AND u.email = 'den@gmail.com'



SELECT o.order_date, o.order_cost, o.user_id, u.name, u.email
FROM orders AS o
RIGHT JOIN users AS u ON o.user_id = u.id AND u.email = 'den@gmail.com'



SELECT o.order_date, o.order_cost, o.user_id, u.name, u.email
FROM orders AS o
FULL JOIN users AS u ON o.user_id = u.id AND (u.email = 'den@gmail.com' OR u.email = 'ivan@gmail.com')



SELECT * FROM users


SELECT * FROM orders


ALTER TABLE users ADD COLUMN balance DECIMAL(10, 2) DEFAULT 500


UPDATE users SET balance = 100 WHERE id = 1



DO $$
DECLARE user_balance DECIMAL(10, 2);
BEGIN
SELECT balance INTO user_balance FROM users WHERE id = 1;

IF user_balance >= 33
THEN
	INSERT INTO orders(user_id, order_date, order_cost) VALUES (1, '2024-12-13', 33);

	UPDATE users SET balance = balance - 33 WHERE id = 1;

	--COMMIT;
	RAISE NOTICE 'Замовлення успішно додано';
ELSE
	ROLLBACK;
	RAISE NOTICE 'Недостатньо коштів на балансі';
END IF;
END $$





BEGIN;

INSERT INTO orders(user_id, order_date, order_cost) VALUES (1, '2024-12-15', 123);
SAVEPOINT first_savepoint;

INSERT INTO orders(user_id, order_date, order_cost) VALUES (1, '2024-12-16', 456);
SAVEPOINT second_savepoint;

INSERT INTO orders(user_id, order_date, order_cost) VALUES (1, '2024-12-17', 333);

ROLLBACK TO SAVEPOINT second_savepoint;
RELEASE SAVEPOINT second_savepoint;

--ROLLBACK TO SAVEPOINT first_savepoint;
--RELEASE SAVEPOINT first_savepoint;

COMMIT;




SELECT * FROM orders;













