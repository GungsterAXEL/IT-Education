USE webinar01;

-- Задание 1.
-- Создайте функцию, которая принимает кол-во сек и форматирует их в кол-во дней, часов, минут и секунд.
-- Пример: 123456 ->'1 days 10 hours 17 minutes 36 seconds '.
DROP FUNCTION IF EXISTS SecsToDateTime;
DELIMITER //
CREATE FUNCTION SecsToDateTime(secs INT)
RETURNS VARCHAR(255)
DETERMINISTIC
BEGIN
	DECLARE days INT DEFAULT 0;
    DECLARE hours INT DEFAULT 0;
    DECLARE minutes INT DEFAULT 0;
    DECLARE seconds INT DEFAULT 0;
    DECLARE res VARCHAR(255) DEFAULT secs;
    
	SET days = secs DIV 86400;
	SET secs = secs MOD 86400;
    SET hours = secs DIV 3600;
    SET secs = secs MOD 3600;
    SET minutes = secs DIV 60;
    SET secs = secs MOD 60;
    SET seconds = secs;
    
    SET res = CONCAT(days, ' days ', hours, ' hours ', minutes, ' minutes ', seconds, ' seconds. ');
    
    RETURN res;
END //
DELIMITER ;
SELECT SecsToDateTime(123456);

-- Задание 2.
-- Выведите только четные числа от 1 до 10 включительно.
-- Пример: 2,4,6,8,10 (можно сделать через шаг +  2: х = 2, х+=2).
DROP PROCEDURE IF EXISTS evenN;
DELIMITER //
CREATE PROCEDURE evenN(n INT)
BEGIN
	DECLARE temp INT DEFAULT 2;
	DECLARE res VARCHAR(255) DEFAULT '';
    
    REPEAT
		IF n MOD 2 = 1
			THEN SET n = n - 1;
		END IF;
		SET res = CONCAT(res, ' ', temp);
        SET temp = temp + 2;
        UNTIL n < temp
	END REPEAT;
    
    SELECT res;
END //
DELIMITER ;
CALL evenN(10);