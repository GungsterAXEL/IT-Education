package Webinar_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Example_02 {
//    1. Напишите метод, который заполнит массив из 1000 элементов случайными
//    цифрами от 0 до 24.
//    2. Создайте метод, в который передайте заполненный выше массив и с
//    помощью Set вычислите процент уникальных значений в данном массиве и
//    верните его в виде числа с плавающей запятой.
//    Для вычисления процента используйте формулу:
//    процент уникальных чисел = количество уникальных чисел * 100 / общее
//    количество чисел в массиве.

    public static void main(String[] args) {
        Integer[] newarr = ArrayRandom(1000, 25);
        System.out.println(Arrays.toString(newarr));
        System.out.println(PercentUnique(newarr));
    }
    public static Double PercentUnique(Integer[] array){
        Double percent = 0.0;
        Set<Integer> newSet = new HashSet<Integer>(Arrays.asList(array));
        percent = newSet.size() * 100.0 / array.length;
        return percent;
    }
    public static Integer[] ArrayRandom(int size, int max){
        Random rand = new Random();
        Integer[] randomArray = new Integer[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = rand.nextInt(max);
        }
        return randomArray;
    }
}