USE webinar01;

# Операторы сортировки.
-- Табличка для работы.
CREATE TABLE staff (
id INT AUTO_INCREMENT PRIMARY KEY,
firstname VARCHAR(45),
lastname VARCHAR(45),
post VARCHAR(100),
seniority INT,
salary INT,
age INT
);

-- Наполнение данными.
INSERT INTO staff (firstname, lastname, post, seniority, salary, age)
VALUES
('Вася', 'Петров', 'Начальник', '40', 100000, 60),
('Петр', 'Власов', 'Начальник', '8', 70000, 30),
('Катя', 'Катина', 'Инженер', '2', 70000, 25),
('Саша', 'Сасин', 'Инженер', '12', 50000, 35),
('Иван', 'Иванов', 'Рабочий', '40', 30000, 59),
('Петр', 'Петров', 'Рабочий', '20', 25000, 40),
('Сидр', 'Сидоров', 'Рабочий', '10', 20000, 35),
('Антон', 'Антонов', 'Рабочий', '8', 19000, 28),
('Юрий', 'Юрков', 'Рабочий', '5', 15000, 25),
('Максим', 'Максимов', 'Рабочий', '2', 11000, 22),
('Юрий', 'Галкин', 'Рабочий', '3', 12000, 24),
('Людмила', 'Маркина', 'Уборщик', '10', 10000, 49);

## ORDER BY.
-- 1. Выведите все записи, отсортированные по полю "age" по возрастанию.
SELECT * FROM staff
ORDER BY age;

-- 2. Выведите все записи, отсортированные по полю "name".
SELECT * FROM staff
ORDER BY firstname;

-- 3. Выведите записи полей "name", "surname","age", отсортированные по полю "name" в алфавитном порядке по убыванию.
SELECT firstname AS 'name', lastname AS 'surname', age
FROM staff
ORDER BY firstname DESC;

-- 4. Выполните сортировку по полям "name" и "age" по убыванию.
SELECT * FROM staff
ORDER BY firstname DESC, age DESC;

## DISTINCT, LIMIT.
/*
DISTINCT:
SELECT DISTINCT поле1, поле2, ... 
FROM имя_таблицы;

LIMIT:
LIMIT[смещение_относительно_начала,]
количество_извлекаемых_строк
*/

-- 1. Выведите уникальные (неповторяющиеся) значения полей "name".
SELECT DISTINCT firstname AS 'name'
FROM staff;

-- 2. Выведите первые две записи из таблицы.
SELECT * FROM staff
LIMIT 2;

-- 3. Пропустите  первые 4 строки ("id" = 1, "id" = 2,"id" = 3,"id" = 4) и извлеките следующие 3 строки ("id" = 5, "id" = 6, "id" = 7).
SELECT * FROM staff
LIMIT 4, 3;

-- 4*. Пропустите две последнии строки (где id=12, id=11) и извлекаются следующие за ними 3 строки (где id=10, id=9, id=8).
SELECT * FROM staff
ORDER BY id DESC
LIMIT 2, 3;



# Агрегатные функции.
-- Таблица для работы.
CREATE TABLE employee_tbl (
id_emp INT AUTO_INCREMENT PRIMARY KEY,
id INT NOT NULL,
name VARCHAR(50) NOT NULL,
work_date DATE,
daily_typing_pages INT
);

-- Наполнение данными
INSERT INTO employee_tbl (id, name, work_date, daily_typing_pages)
VALUES
(1, 'John', '2007-01-24', 250),
(2, 'Ram', '2007-05-27', 220),
(3, 'Jack', '2007-05-06', 170),
(3, 'Jack', '2007-04-06', 100),
(4, 'Jill', '2007-04-06', 220),
(5, 'Zara', '2007-06-06', 300),
(5, 'Zara', '2007-02-06', 350);

-- 1. Рассчитайте общее количество всех страниц daily_typing_pages.
SELECT SUM(daily_typing_pages)
FROM employee_tbl;

-- 2. Выведите общее количество напечатанных страниц каждым человеком (с помощью предложения GROUP BY).
SELECT name, SUM(daily_typing_pages)
FROM employee_tbl
GROUP BY name;

-- 3. Посчитайте количество записей в таблице.
SELECT COUNT(*)
FROM employee_tbl;

-- 4. Выведите количество имен, которые являются уникальными.
SELECT COUNT(DISTINCT name)
FROM employee_tbl;

-- 5. Найдите среднее арифметическое по количеству ежедневных страниц для набора (daily_typing_pages).
SELECT AVG(daily_typing_pages)
FROM employee_tbl;



#  GROUP BY, HAVING.
-- Таблица для работы.
DROP TABLE IF EXISTS employee_salary;
CREATE TABLE employee_salary (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50) NOT NULL,
age INT,
salary INT
);

-- Наполнение данными
INSERT INTO employee_salary (name, age, salary)
VALUES
('Дима', 23, 100),
('Петя', 23, 200),
('Вася', 23, 300),
('Коля', 24, 1000),
('Иван', 24, 2000),
('Паша', 25, 700);

## GROUP BY.
/*
SELECT * FROM имя_таблицы 
WHERE условие 
GROUP BY поле_для_группировки
*/

-- 1. Сгруппируйте поля по возрасту (будет 3 группы - 23 года, 24 года и 25 лет). Для каждой группы  найдите суммарную зарплату.
SELECT age, SUM(salary)
FROM employee_salary
GROUP BY age;

-- 2. Сгруппируйте поля по возрасту (будет 3 группы - 23 года, 24 года и 25 лет). Найдите максимальную заработную плату внутри группы.
SELECT age, MAX(salary)
FROM employee_salary
GROUP BY age;

-- 3. Сгруппируйте поля по возрасту (будет 3 группы - 23 года, 24 года и 25 лет). Найдите минимальную заработную плату внутри группы.
SELECT age, MIN(salary)
FROM employee_salary
GROUP BY age;



## HAVING.
/*
GROUP BY поле HAVING условие
*/

-- 1. Выведите только те строки, в которых суммарная зарплата больше или равна 1000.
SELECT age, SUM(salary)
FROM employee_salary
GROUP BY age
HAVING SUM(salary) >= 1000;

/* Можно и через псевдоним.
SELECT age, SUM(salary) AS sumsalary
FROM employee_salary
GROUP BY age
HAVING sumsalary >= 1000;
*/

-- 2. Выведите только те группы, в которых количество строк меньше или равно двум.
SELECT age, COUNT(*) AS count
FROM employee_salary
GROUP BY age
HAVING count <= 2;

-- 3. Выведите только те группы, в которых количество строк меньше или равно двум. Для решения используйте оператор “BETWEEN”.
SELECT age, COUNT(*) AS count
FROM employee_salary
GROUP BY age
HAVING count BETWEEN 0 and 2;

-- 4.*	Выведите только те группы, в которых количество строк меньше или равно двум. Для решения используйте оператор “IN”.
SELECT age, COUNT(*) AS count
FROM employee_salary
GROUP BY age
HAVING count IN (0,1,2);