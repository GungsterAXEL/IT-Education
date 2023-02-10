package Webinar_01;

import java.time.*;
import java.util.Scanner;

/**
 * В консоли запросить имя пользователя.
 * В зависимости от текущего времени, вывести приветствие вида
 * "Доброе утро, <Имя>!", если время от 05:00 до 11:59
 * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
 * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
 * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 * 
 */

public class Example_01_Base {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String name = "Valeriy"; // iScanner.nextLine();
        iScanner.close();
        timeNamePrinter(name);
    }

    public static void timeNamePrinter(String name) {
        LocalTime now = LocalTime.now();
        if (now.isAfter(LocalTime.of(5, 0)) && now.isBefore(LocalTime.of(11, 59))) {
            System.out.println("Доброе утро, " + name);
        } else if (now.isAfter(LocalTime.of(12, 0)) && now.isBefore(LocalTime.of(17, 59))) {
            System.out.println("Добрый день, " + name);
        } else if (now.isAfter(LocalTime.of(18, 0)) && now.isBefore(LocalTime.of(22, 59))) {
            System.out.println("Добрый вечер, " + name);
        } else {
            System.out.println("Доброй ночи, " + name);
        }
    }
}
