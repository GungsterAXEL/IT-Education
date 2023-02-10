/**
 * Задача 1.
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
 * Реализовать в java.
 * Создать множество ноутбуков.
 * 1. Написать метод, который будет запрашивать у пользователя критерий фильтрации
 * и выведет выборку: имя ноутбука и выбранный критерий . Критерии фильтрации можно хранить в Map.
 * Сделать выборку.
 * Например:
 * Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * Пользователь ввел 1. Вывести в виде.
 * | Имя    | ОЗУ    |
 * |--------|--------|
 * | Asus   | 2ГБ    |
 * | HP     | 4ГБ    |
 * | MSI    | 6ГБ    |
 * 2. Отфильтровать ноутбуки первоначального множества.
 * По имени ноутбука в алфавитном порядке, по цене по убыванию
 * Например, по алфавиту
 * | Имя    | ОЗУ    | Цена   |
 * |--------|--------|--------|
 * | Asus   | 2ГБ    | 4666   |
 * | MSI    | 4ГБ    | 6600   |
 * | HP     | 6ГБ    | 5555   |
 */
package Webinar_06.Homework;

import java.util.Scanner;
import java.util.LinkedList;

public class Ex_01_NotebookSort {

    public static void PrintTableHead() {
        System.out.printf("| %-10s | %-10s | %-10s | %-5s | %-5s | %-5s | %-5s |\n",
                "Бренд", "Диагональ", "Видеокарта", "GPU", "HDD", "RAM", "Цена");
    }

    public static void PrintTableDelimiter() {
        System.out.printf("| %-10s | %-10s | %-10s | %-5s | %-5s | %-5s | %-5s |\n",
                "----------", "----------", "----------", "-----", "-----", "-----", "-----");
    }

    public static boolean InputChecker(Scanner scan, LinkedList<Notebook> notebookSet, boolean restart) {
        if (scan.hasNextLine()) {
            String input = "";
            input = scan.nextLine().toString();
            if (input.equals("1")) {
                NotebookSortingMethods.SortByName(notebookSet);
            } else if (input.equals("2")) {
                NotebookSortingMethods.SortByScreenSize(notebookSet);
            } else if (input.equals("3")) {
                NotebookSortingMethods.SortByGPU(notebookSet);
            } else if (input.equals("4")) {
                NotebookSortingMethods.SortByHDD(notebookSet);
            } else if (input.equals("5")) {
                NotebookSortingMethods.SortByRAM(notebookSet);
            } else if (input.equals("6")) {
                NotebookSortingMethods.SortByPrice(notebookSet);
            } else if (input.equals("7")) {
                System.out.println("Всего хорошего!");
                return false;
            } else {
                System.out.println("Нераспознанная команда. Повторите ввод.");
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<Notebook> notebookSet = NotebookListRandomizer.NotebookListRandomizer();

        System.out.println("Весь каталог:");
        PrintTableHead();
        PrintTableDelimiter();
        notebookSet.forEach(item -> item.Print());
        PrintTableDelimiter();

        boolean restart = true;
        while (restart) {
            NotebookSortingMethods.SortingMenuPrint();
            restart = InputChecker(scan, notebookSet, restart);

            if (restart == true) {
                System.out.println("Результат сортировки:");
                PrintTableHead();
                PrintTableDelimiter();
                notebookSet.forEach(item -> item.Print());
                PrintTableDelimiter();
            }
            System.out.println("Выйти? Y = Да");
            String input = scan.nextLine();
            if (input.toLowerCase().equals("y")) {
                System.out.println("Пока-пока!");
                restart = false;
            }
        }
        scan.close();
    }
}