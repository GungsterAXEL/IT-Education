package Examples.Webinar_02.Homework;

import java.util.Scanner;

public class Ex_01 {
    /*
    Задача 1.
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
    Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных.
    */
    public static float floatInput(Scanner scanner) {
        float input = 0f;
        while (true) {
            System.out.println("Введите float значение: ");
            if (scanner.hasNextFloat()) {
                input = scanner.nextFloat();
                break;
            }
            System.out.println("Введите корректное значение.");
            scanner.nextLine();
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введённое значение: " + floatInput(scanner));
        scanner.close();
    }
}
