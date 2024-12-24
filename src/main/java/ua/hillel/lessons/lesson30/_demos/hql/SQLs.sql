
-- БАЗА ДАНИХ
-- Можливість створення БД з метою уникнення некваліфікованих
-- дій, краще залишити за розробником.
-- Тому такий функціонал у додатку не прописуємо.
-- Можемо створити БД через візуальний інструмент, наприклад, PGAdmin
CREATE DATABASE demo_db;

-- ТАБЛИЦІ
-- Можливість створення таблиць БД, з метою уникнення некваліфікованих
-- дій, краще залишити за розробником.
-- Тому такий функціонал у додатку не прописуємо.
-- Попередньо, необхідно спроектувати таблиці та їх зв'язки,
-- на основі сутностей реального світу.
-- Можемо створити таблиці БД через візуальний інструмент, наприклад, PGAdmin

CREATE TABLE IF NOT EXISTS contacts
( id SERIAL PRIMARY KEY,
  first_name VARCHAR(128) NOT NULL,
  last_name VARCHAR(128) NOT NULL,
  phone VARCHAR(56) NOT NULL,
  email VARCHAR(128) NOT NULL
);


-- Порівняння HQL та SQL

-- HQL
INSERT INTO Contact (firstName, lastName, phone, email) VALUES (:firstName, :lastName, :phone, :email)
-- SQL
INSERT INTO contacts (first_name, last_name, phone, email) VALUES (:first_name, :last_name, :phone, :email)


-- HQL
FROM Contact
-- SQL
SELECT * FROM contacts


-- HQL
UPDATE Contact SET phone = :phone WHERE id = :id
-- SQL
UPDATE contacts SET phone = :phone WHERE id = :id


-- HQL
DELETE FROM Contact WHERE id = :id
-- SQL
DELETE FROM contacts WHERE id = :id;
