USE webinar01;

CREATE TABLE  AUTO 
(       
	REGNUM VARCHAR(10) PRIMARY KEY, 
	MARK VARCHAR(10), 
	COLOR VARCHAR(15),
	RELEASEDT DATE, 
	PHONENUM VARCHAR(15)
);
INSERT INTO AUTO (REGNUM, MARK,	COLOR, RELEASEDT, PHONENUM )
VALUES  (111114,'LADA', 'КРАСНЫЙ', date'2008-01-01', '9152222221'),
		(111115,'VOLVO', 'КРАСНЫЙ', date'2013-01-01', '9173333334'),
		(111116,'BMW', 'СИНИЙ', date'2015-01-01', '9173333334'),
		(111121,'AUDI', 'СИНИЙ', date'2009-01-01', '9173333332'),
		(111122,'AUDI', 'СИНИЙ', date'2011-01-01', '9213333336'),
        (111113,'BMW', 'ЗЕЛЕНЫЙ', date'2007-01-01', '9214444444'),
        (111126,'LADA', 'ЗЕЛЕНЫЙ', date'2005-01-01', null),
        (111117,'BMW', 'СИНИЙ', date'2005-01-01', null),
        (111119,'LADA', 'СИНИЙ', date'2017-01-01', 9213333331);

-- Задание 1. Вывести на экран, сколько машин каждого цвета  для машин марок BMW и LADA.
SELECT mark, color, COUNT(*) AS models_count
FROM auto
WHERE mark IN ('BMW', 'LADA')
GROUP BY mark, color
ORDER BY mark, color;

-- Задание 2. Вывести на экран марку авто(количество) и количество авто не этой марки.
SELECT mark, COUNT(*) AS count
FROM auto
GROUP BY mark;

SELECT COUNT(*) AS total,
(SELECT COUNT(mark) FROM auto WHERE mark IN ('BMW')) AS BMW,
(SELECT COUNT(mark) FROM auto WHERE mark IN ('LADA')) AS LADA,
(SELECT COUNT(mark) FROM auto WHERE mark IN ('AUDI')) AS AUDI,
(SELECT COUNT(mark) FROM auto WHERE mark IN ('VOLVO')) AS VOLVO
FROM auto;

SELECT COUNT(mark) AS total,
(SELECT COUNT(*) FROM auto WHERE mark IN('BMW')) AS BMW,
(SELECT COUNT(*) FROM auto WHERE mark NOT IN('BMW')) AS 'not BMW'
FROM auto;

-- Задание 3. Даны 2 таблицы, созданные следующим образом:
create table test_a (id INT, test varchar(10));
create table test_b (id INT);
insert into test_a(id, test) values
(10, 'A'),
(20, 'A'),
(30, 'F'),
(40, 'D'),
(50, 'C');
insert into test_b(id) values
(10),
(30),
(50);

-- Напишите запрос, который вернет строки из таблицы test_a, id которых нет в таблице test_b, НЕ используя ключевого слова NOT.
SELECT *
FROM test_a
LEFT JOIN test_b
ON test_a.id = test_b.id
WHERE test_b.id IS NULL;