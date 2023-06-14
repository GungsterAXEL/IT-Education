package Webinar_01;

import static Webinar_01.Tools.arrayRandomizer;

public class Example_02 {

    /*
    Задача 2.
    Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
    Если длина массива меньше некоторого заданного минимума, метод возвращает -1
    в качестве кода ошибки, иначе - длину массива.
    */
    public static int lengthChecker(int[] array, int minLength) {
        return array.length < minLength ? -1 : array.length;
    }

    public static void main(String[] args) {
        int test = 10;
        int[] array = arrayRandomizer(test);

        System.out.println("Проверка на длину массива: " + lengthChecker(array, test * test));
        System.out.println("Проверка на длину массива: " + lengthChecker(array, test));
    }
}
