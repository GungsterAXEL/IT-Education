USE webinar01;



# Задача 1.
DROP TABLE IF EXISTS Cars;
CREATE TABLE Cars
(
id INT PRIMARY KEY AUTO_INCREMENT,
mark VARCHAR(20),
cost INT
);

INSERT Cars (mark, cost) VALUES
("Audi", 52642),
("Mercedes", 57127),
("Skoda", 9000),
("Volvo", 29000),
("Bentley", 350000),
("Citroen", 210000),
("Hummer", 41400),
("Volkswagen", 21600);

-- 1. Создайте представление, в которое попадут автомобили стоимостью  до 25 000 долларов.
CREATE OR REPLACE VIEW SomeCars AS
SELECT * FROM Cars
WHERE cost < 25000
ORDER BY cost;
SELECT * FROM SomeCars;

-- 2. Изменить в существующем представлении порог для стоимости: пусть цена будет до 30 000 долларов (используя оператор ALTER VIEW).
ALTER VIEW SomeCars AS
SELECT * FROM Cars
WHERE cost < 30000
ORDER BY cost;
SELECT * FROM SomeCars;

-- 3. Создайте представление, в котором будут только автомобили марки “Шкода” и “Ауди”.
CREATE OR REPLACE VIEW SkodaAudi AS
SELECT * FROM Cars
WHERE mark LIKE 'Skoda' OR mark LIKE 'Audi'
ORDER BY mark, cost;
SELECT * FROM SkodaAudi;



# Задача 2.
DROP TABLE IF EXISTS Analysis;
CREATE TABLE Analysis
(
	an_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL UNIQUE,
    an_name VARCHAR(40),
    an_cost INT,
    an_price INT,
    an_group VARCHAR(40)
);

DROP TABLE IF EXISTS GroupsA;
CREATE TABLE GroupsA
(
	gr_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL UNIQUE,
    gr_name VARCHAR(40),
    gr_temp INT
);

DROP TABLE IF EXISTS Orders;
CREATE TABLE Orders
(
	ord_id INT PRIMARY KEY AUTO_INCREMENT,
    ord_datetime DATETIME,
    ord_an INT
);

INSERT Analysis (an_name, an_cost, an_price, an_group) VALUES
("F", 500, 3000, "A"),
("S", 1000, 5000, "B"),
("T", 1500, 6000, "C"),
("G", 2000, 12000, "B");

INSERT GroupsA (gr_name, gr_temp) VALUES
("A", 0),
("B", 4),
("C", 8),
("D", 15),
("E", 27);

INSERT Orders (ord_datetime, ord_an) VALUES
("2020-03-01T07:40:55", 1),
("2020-05-02T14:59:59", 2),
("2020-07-02T15:12:43", 3),
("2020-09-02T11:25:10", 4),
("2020-11-02T09:37:15", 4),
("2020-12-02T17:24:23", 4);

-- Вывести название и цену для всех анализов, которые продавались 5 февраля 2020 и всю следующую неделю.
SELECT an_name, an_price FROM Analysis, Orders
WHERE (an_id = ord_an) AND (ord_datetime BETWEEN "2020-05-02" AND "2020-12-02")
ORDER BY an_price;



# Задача 3.
DROP TABLE IF EXISTS TrainShedule;
CREATE TABLE TrainShedule(
	train_id INT,
    station VARCHARACTER(20),
    station_time TIME);
    
INSERT TrainShedule VALUES
(110, "San Francisco", "10:00:00"),
(110, "Redwood City", "10:54:00"),
(110, "Palo Alto", "11:02:00"),
(110, "San Jose", "12:35:00"),
(120, "San Francisco", "11:00:00"),
(120, "Palo Alto", "12:49:00"),
(120, "San Jose", "13:30:00");

/*
Добавьте новый столбец под названием «время до следующей станции». time_to_next_station
Чтобы получить это значение, мы вычитаем время станций для пар смежных станций.
Мы можем вычислить это значение без использования оконной функции SQL, но это может быть очень сложно.
Проще это сделать с помощью оконной функции LEAD .
Эта функция сравнивает значения из одной строки со следующей строкой, чтобы получить результат.
В этом случае функция сравнивает значения в столбце «время» для станции со станцией сразу после нее.
*/
SELECT *,
-- Работает не полноценно.
#CONVERT((LEAD(station_time) OVER (PARTITION BY train_id) - station_time), TIME) AS time_to_next_station
-- Самый приемлемый вариант.
SUBTIME(LEAD(station_time) OVER (PARTITION BY train_id), station_time) AS time_to_next_station
-- Вывод без округления.
#TIMEDIFF(LEAD(station_time, 1, "END") OVER (PARTITION BY train_id), station_time) AS time_to_next_station
FROM TrainShedule;