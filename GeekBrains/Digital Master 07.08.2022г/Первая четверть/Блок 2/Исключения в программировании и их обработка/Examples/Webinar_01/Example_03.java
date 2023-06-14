package Webinar_01;

import java.util.Scanner;

import static Webinar_01.Tools.arrayRandomizer;

public class Example_03 {

    /*
    Задача 3.
    Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
    Метод ищет в массиве заданное значение и возвращает его индекс.
    При этом:
    1. Если длина массива меньше некоторого заданного минимума, метод возвращает -1 в качестве кода ошибки.
    2. Если искомый элемент не найден, метод вернёт -2 в качестве кода ошибки.
    3. Если вместо массива пришёл null, метод вернёт -3 в качестве кода ошибки.
    Придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.

    Задача 3.1.
    Напишите метод, в котором реализуется взаимодействие с пользователем.
    Т.е. этот метод запросит искомое число у пользователя, обработает возвращённое значение и выведет сообщение.
    Например, если вернулось -2, пользователю выведется сообщение: "Искомый элемент не найден".
     */
    public static int lightChecker(int[] array, int number, int minSize) {
        if (array == null) return -3;
        else if (array.length < minSize) return -1;
        else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) return i;
            }
            return -2;
        }
    }

    public static void lightAnalyzer(int test) {
        Scanner scan = new Scanner(System.in);
        int[] array = arrayRandomizer(test);
        System.out.print("Введите искомое значение: ");
        int state = -1;
        if (scan.hasNextInt()) state = lightChecker(array, scan.nextInt(), test * test);

        if (state == -1) System.out.println("Минимально допустимый размер массива " + test * test + ".");
        else if (state == -2) System.out.println("Искомый элемент не найден.");
        else if (state == -3) System.out.println("Работа с пустым массивом не поддерживается.");
        else System.out.println("Индекс искомого значения: " + state);

        scan.close();
    }

    public static void main(String[] args) {
        lightAnalyzer(1);
        lightAnalyzer(2);
    }
}
