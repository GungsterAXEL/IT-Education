package Examples.Webinar_02.Homework;

import java.util.Scanner;

public class Ex_04 {
    /*
    Задача 4.
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    Далее запросить повторный ввод строки.
     */
    static String inputMessage = "Введите текст: ",
            errorMessage = "Пустые строки вводить нельзя!",
            outputMessage = "Вы ввели:\n";

    public static void checkLine(Scanner scanner) {
        while (true) {
            System.out.println(inputMessage);
            String input = scanner.nextLine();
            if (checkInput(input))
                System.out.println(errorMessage);
            else {
                System.out.println(outputMessage + input);
                break;
            }
        }
    }

    public static void checkLine2(Scanner scanner) {
        String input;
        while (true) {
            try {
                System.out.println(inputMessage);
                input = scanner.nextLine();
                if (checkInput(input)) {
                    throw new Exception(errorMessage);
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                continue;
            }
            System.out.println(outputMessage + input);
            break;
        }
    }

    public static boolean checkInput(String input) {
        if (input.isEmpty() || input.trim().isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        checkLine2(scanner);
        scanner.close();
    }
}
