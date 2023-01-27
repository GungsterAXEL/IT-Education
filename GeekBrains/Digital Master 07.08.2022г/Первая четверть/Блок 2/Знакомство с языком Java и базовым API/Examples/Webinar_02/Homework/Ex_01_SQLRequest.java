/**
 * Задача 1.
 * Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации:
 * String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
 * Результат "select * from students where “name” = “Ivanov” and “country”=”Russia” …
 */
package Homework;
public class Ex_01_SQLRequest {
    public static void main(String[] args) {
        String sqlRequest = "select * from students where ";
        String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        
    }
}