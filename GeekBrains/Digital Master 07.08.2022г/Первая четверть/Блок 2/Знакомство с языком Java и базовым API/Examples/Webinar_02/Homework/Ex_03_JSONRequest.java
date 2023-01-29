/**
 * Зачада 3**.
 * Дана json строка (можно сохранить в файл и читать из файла)
 * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
 * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
 * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
 * Написать метод(ы), который распарсит json и,
 * используя StringBuilder, создаст строки вида:
 * Студент [фамилия] получил [оценка] по предмету [предмет].
 * Пример вывода:
 * Студент Иванов получил 5 по предмету Математика.
 * Студент Петрова получил 4 по предмету Информатика.
 * Студент Краснов получил 5 по предмету Физика.
 */

package Homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_03_JSONRequest {
    public static void main(String[] args) {
        String separator = File.separator;
        String filePath = String.join(separator, "GeekBrains", "Digital Master 07.08.2022г", "Первая четверть",
                "Блок 2", "Знакомство с языком Java и базовым API", "Examples", "Webinar_02", "Homework");
        String fileName = "Ex_03.txt";

        StringBuilder sb = new StringBuilder();

        try (Scanner scan = new Scanner(new File(String.join(separator, filePath, fileName)))) {
            while (scan.hasNextLine()) {
                sb.append(scan.nextLine().replace("\"", "")).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        String[] array = sb.toString().split("\n");
        for (int i = 0; i < array.length; i++) {
            String[] temp = array[i].replace("фамилия:", "").replace("оценка:", "").replace("предмет:", "").split(",");
            System.out.printf("Студент %s получил %s по предмету %s.\n", temp[0], temp[1], temp[2]);
        }
    }
}