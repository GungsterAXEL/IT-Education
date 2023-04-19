# ДЗ 1.
/*
1. Создайте таблицу с мобильными телефонами (mobile_phones), используя графический интерфейс.
	Заполните БД данными.
	Добавьте скриншот на платформу в качестве ответа на ДЗ.

2. Выведите название, производителя и цену для товаров, количество которых превышает 2.

3. Выведите весь ассортимент товаров марки “Samsung”.

4*. С помощью регулярных выражений найти:
	4.1. Товары, в которых есть упоминание "Iphone"
	4.2. Товары, в которых есть упоминание "Samsung"
	4.3. Товары, в которых есть ЦИФРЫ
	4.4. Товары, в которых есть ЦИФРА "8"
*/
USE webinar01;

-- 1. Создал таблицу. Данные заполнил выражениями.
INSERT INTO mobile_phones (product_name, manufacturer, product_count, price)  
VALUES ("iPhone X", "Apple", 3, 76000);

INSERT INTO mobile_phones (product_name, manufacturer, product_count, price) 
VALUES ("iPhone 8", "Apple", 2, 51000);

INSERT INTO mobile_phones (product_name, manufacturer, product_count, price) 
VALUES ("Galaxy S9", "Samsung", 2, 56000);

INSERT INTO mobile_phones (product_name, manufacturer, product_count, price) 
VALUES ("Galaxy S8", "Samsung", 1, 41000);

INSERT INTO mobile_phones (product_name, manufacturer, product_count, price) 
VALUES ("P20 Pro", "Huawei", 5, 36000);

-- 2.
SELECT product_name, manufacturer, price
FROM mobile_phones
WHERE product_count > 2;

-- 3.
SELECT *
FROM mobile_phones
WHERE manufacturer="Samsung";

-- 4.
-- 4.1.
SELECT *
FROM mobile_phones
WHERE product_name LIKE "%iPhone%" OR manufacturer LIKE "%iPhone%";

-- 4.2.
SELECT *
FROM mobile_phones
WHERE product_name LIKE "%Samsung%" OR manufacturer LIKE "%Samsung%";

-- 4.3.
SELECT *
FROM mobile_phones
WHERE product_name REGEXP "[0-9]";

-- 4.4.
SELECT *
FROM mobile_phones
WHERE product_name REGEXP "[8]";