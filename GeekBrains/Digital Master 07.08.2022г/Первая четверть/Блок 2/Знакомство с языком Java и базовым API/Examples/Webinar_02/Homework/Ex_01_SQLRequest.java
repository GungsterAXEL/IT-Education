/**
 * Задача 1.
 * Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации:
 * String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
 * Результат "select * from students where “name” = “Ivanov” and “country” = ”Russia” …
 */

package Homework;

public class Ex_01_SQLRequest {
    public static StringBuilder SQLRequest(StringBuilder sqlString, String str) {
        String[] strArray = str.split(",");
        for (int i = 0; i < strArray.length; i++) {

            if (!strArray[i].contains("null")) {
                if (i > 0)
                    sqlString.append(" and ");
                sqlString.append(strArray[i]
                        .replace("{", "")
                        .replace("}", "")
                        .replace("\'", "\"")
                        .replace(":", " = "));
            }
        }
        return sqlString;
    }

    public static void main(String[] args) {
        StringBuilder sqlString = new StringBuilder("select * from students where ");
        String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        sqlString = SQLRequest(sqlString, str);
        System.out.println(sqlString.toString());
    }
}