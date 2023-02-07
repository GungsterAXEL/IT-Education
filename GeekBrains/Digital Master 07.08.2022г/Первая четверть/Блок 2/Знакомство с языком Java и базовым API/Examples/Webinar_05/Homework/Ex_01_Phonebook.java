/**
 * Задача 1. 
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
 * что 1 человек может иметь несколько телефонов.
 */
package Homework;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Ex_01_Phonebook {
    public static String[] UserInput(Scanner scan) {
        String[] name = new String[] {};
        if (scan.hasNextLine())
            name = scan.nextLine().split(";");
        return name;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> mymap = new HashMap<>();

        while (true) {
            System.out.println("Введите контакт в формате <Имя Фамилия;Номер телефона;>:");
            String[] name = UserInput(scan);

            if (name.length > 1) {
                String key = name[0];
                String value = name[1];
                if (mymap.containsKey(key)) {
                    mymap.put(key, mymap.get(key) + ";" + value);
                    System.out.println("Контакт обновлён.");
                } else {
                    mymap.put(key, value);
                    System.out.println("Контакт добавлен");
                }
            } else if (name.length != 0 && name[0].equals("Stop")) {
                System.out.println("Пока-пока!");
                break;
            } else if (name.length != 0 && name[0].equals("Print")) {
                if (mymap.isEmpty())
                    System.out.println("Нечего выводить!");
                else
                    System.out.println(mymap.toString());
            }
        }
        scan.close();
    }
}
