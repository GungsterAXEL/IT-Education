package Examples.Webinar_02;

import java.util.Scanner;

public class Example_01 {
    /*
    ClassCastException - ошибка преобразования типов. Unchecked.
    StackOverflowError - переполнение памяти. Unchecked. Error.
    IOError - проблемы подключения (железо). Unchecked.
    IOException - проблемы подключения. Checked.
    NullPointerException - пустые ссылки. Unchecked.
    ConcurrentModificationException - работа с потоками. Unchecked.
    IllegalArgumentException - недопустимые аргументы. Unchecked.
    EOFException - конец файла. Checked.
    ClassNotFoundException - класс не найден. Unchecked.
    ThreadDeath </aside> - поток преждевременно закрылся. Unchecked.
     */

    /*
       Задача 1.

       Посмотрите на этот код. Всё ли с ним хорошо?
       Если нет, то скорректируйте его и обоснуйте своё решение.

       Scanner scanner = new Scanner(System.in);
       int[] arr = new int[10];
       System.out.println("Укажите индекс элемента в котрый хотите записать значение 1.");
       int index = scanner.nextInt();
       try {
           arr[index] = 1;
       } catch (Exception e) {
           System.out.println("Указан индекс за пределами массива.");
       }
       */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента в котрый хотите записать значение 1.");
        String line = scanner.nextLine();
        int index = 0;
        if (line.matches("[0-9]+")) index = Integer.parseInt(line);
        if (index < arr.length && index > -1) arr[index] = 1;
        else System.out.println("Указан индекс за пределами массива.");
        scanner.close();
    }
}
