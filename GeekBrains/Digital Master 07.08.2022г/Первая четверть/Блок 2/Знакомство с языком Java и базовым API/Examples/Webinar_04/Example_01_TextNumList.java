package Webinar_04;

/**
 * Задача 1.
 * Реализовать консольное приложение, которое:
 * 1) Принимает от пользователя строку вида text~num.
 * 2) Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
 * 3) Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */

import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class Example_01_TextNumList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> names = new LinkedList<>();
        while (true) {
            String str = scan.nextLine();
            if (str.equals(""))
                break;
            String[] array = str.split("~"); // array[0] = names; array[1] = numbers;
            int number = Integer.parseInt(array[1]);

            if (array[0].equals("print")) {
                try {
                    System.out.println(names.get(number));
                    names.remove(0);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (number != names.size()) {
                System.out.println("Incorrect index, should be " + names.size());
                continue;
            } else
                names.add(number, array[0]);
        }
        scan.close();
    }
}
