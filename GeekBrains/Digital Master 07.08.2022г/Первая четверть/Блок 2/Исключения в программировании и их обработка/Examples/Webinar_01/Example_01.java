package Webinar_01;

import java.util.Scanner;

import static Webinar_01.Tools.arrayRandomizer;

public class Example_01 {

    /*
    Задача 1.
    Создать метод, который принимает на вход массив целых чисел и искомое число.
    Возвращает индекс этого числа в массиве.
    Если число не найдено, то возвращается код ошибки -1.
     */
    public static int findIndex(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = arrayRandomizer(10);

        System.out.print("Введите искомое число: ");
        System.out.println(findIndex(array, scan.nextInt()));

        scan.close();
    }
}