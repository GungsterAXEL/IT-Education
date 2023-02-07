/**
 * Задача 3.
 * Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */
package Homework;

import java.util.Arrays;
import java.util.Random;

public class Ex_03_HeapSort {
    public static Integer[] ArrayRandomizer() {
        Random random = new Random();
        Integer size = random.nextInt(100);
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static void HeapSort(Integer[] array, int lenght) {
        int temp = 0;
        int size = lenght - 1;
        for (int i = (lenght / 2); i >= 0; i--) {
            HeapMaker(array, i, size);
        }

        for (int i = size; i >= 0; i--) {
            temp = array[0];
            array[0] = array[size];
            array[size] = temp;
            size--;
            HeapMaker(array, 0, size);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void HeapMaker(Integer[] array, int index, int size) {
        int left = 2 * index;
        int right = 2 * index + 1;
        int bigger = left <= size && array[left] > array[index] ? left : index;
        bigger = right <= size && array[right] > array[bigger] ? right : bigger;
        if (bigger != index) {
            int temp = array[index];
            array[index] = array[bigger];
            array[bigger] = temp;
            HeapMaker(array, bigger, size);
        }
    }

    public static void main(String[] args) {
        Integer[] array = ArrayRandomizer();
        System.out.println(Arrays.toString(array));
        HeapSort(array, array.length);
    }
}
