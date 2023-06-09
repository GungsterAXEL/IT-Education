package Examples;

import java.util.Arrays;
import java.util.Random;

import static Examples.Lection_02_Sort_and_Find.arrayRandomizer;
import static java.lang.System.currentTimeMillis;

public class Webinar_02_Sort_and_Find {
    /*
Задача 1.
Написать две простые сортировки сложностью O(n^2).
Для массива размером в 1000 случайных чисел.
 */
    public static void bubble(int[] array) {
        long count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                count++;
            }
        }
        System.out.println("Итераций " + count);
    }

    public static void bubbleSort(int[] array) {
        boolean finish;
        long count = 0;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
                count++;
            }
        } while (!finish);
        System.out.println("Итераций " + count);
    }

    public static void directSort(int[] array) {
        long count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
                count++;
            }
            if (i != minPosition) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
        System.out.println("Итераций " + count);
    }

    public static void insertSort(int[] array) {
        long count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                count++;
            }
        }
        System.out.println("Итераций " + count);
    }


    /*
    Задача 2.
    Написать алгоритм быстрой сортировки.
     */
    public static void quickSort(int[] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[startPosition + (endPosition - startPosition) / 2];

        do {
            while (array[leftPosition] < pivot) leftPosition++;
            while (array[rightPosition] > pivot) rightPosition--;

            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        } while (leftPosition <= rightPosition);

        if (leftPosition < endPosition) quickSort(array, leftPosition, endPosition);
        if (startPosition < rightPosition) quickSort(array, startPosition, rightPosition);
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }


    /*
    Задача 3.
    Сделать проверку скорости сортировки для массива из 10000 элементов реализованными способами.
     */
//    long start = nanoTime(), end = nanoTime();
//    System.out.println("Времязатраты " + (end - start));
//    или
//    long start = currentTimeMillis(), end = currentTimeMillis();
//    System.out.println("Времязатраты " + (end - start) + "мс");


    /*
    Задача 4.
    Написать алгоритм Линейного и Бинарного поиска.
     */
    public static int simpleSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value, int min, int max) {
        int midpoint;
        if (max < min) return -1;
        else midpoint = (max - min) / 2 + min;

        if (array[midpoint] < value) return binarySearch(array, value, midpoint + 1, max);
        else if (array[midpoint] > value) return binarySearch(array, value, min, midpoint - 1);
        else return midpoint;
    }

    public static int binarySearch(int[] array, int value) {
        return binarySearch(array, value, 0, array.length - 1);
    }


    public static void main(String[] args) {
        Random random = new Random();
        int length = 30000, maxValue = length;
        long start = currentTimeMillis(), end = currentTimeMillis();
        int[] array = arrayRandomizer(length, maxValue),
                arra = Arrays.copyOf(array, length),
                arr = Arrays.copyOf(array, length),
                ar = Arrays.copyOf(array, length);
        int valueToFind = array[random.nextInt(length)];

//        1. + 3.
        start = currentTimeMillis();
        bubbleSort(array);
        end = currentTimeMillis();
        System.out.println("BubbleSort " + (end - start) + "мс");

        start = currentTimeMillis();
        directSort(arra);
        end = currentTimeMillis();
        System.out.println("DirectSort: " + (end - start) + "мс");

        start = currentTimeMillis();
        insertSort(arr);
        end = currentTimeMillis();
        System.out.println("InsertSort: " + (end - start) + "мс");

//        2. + 3.
        start = currentTimeMillis();
        quickSort(ar);
        end = currentTimeMillis();
        System.out.println("QuickSort: " + (end - start) + "мс");

//        4.
        System.out.println("Значение для поиска: " + valueToFind);
        start = currentTimeMillis();
        System.out.println("Позиция элемента: " + simpleSearch(array, valueToFind));
        end = currentTimeMillis();
        System.out.println("SimpleSearch: " + (end - start) + "мс");

        start = currentTimeMillis();
        System.out.println("Позиция элемента: " + binarySearch(array, valueToFind));
        end = currentTimeMillis();
        System.out.println("BinarySearch: " + (end - start) + "мс");
    }
}
