package Examples;

import java.util.Arrays;
import java.util.Random;

public class Lection_02_Sort_and_Find {
    //    Простой рандомайзер массивов.
    public static int[] arrayRandomizer(int length, int maxValue) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-maxValue, maxValue + 1);
        }
        return array;
    }


    /*
    Простые алгоритмы сортировки.
     */
//    Пузырьковая сортировка. Квадратичная сложность. O(n^2).
    public static void bubbleSort(int[] array) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        } while (!finish);
    }

    //    Сортировка выбором. Квадратичная сложность. O(n^2).
    public static void directSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }
            if (i != minPosition) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }

    //    Сортировка вставками. Квадратичная сложность. O(n^2).
    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    /*
    Алгоритмы поиска.
     */
//    Простой перебор. Линейная сложность. O(n).
    public static int simpleSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    //    Бинарный поиск. Логарифмическая сложность. O(log n).
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


    /*
    Продвинутые алгоритмы сортировки.
     */
//    Быстрая сортировка. ВременнАя сложность. Быстрее чем линейная. O(n * log n).
    public static void quickSort(int[] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
//        int pivot = array[(startPosition + endPosition) / 2];
        // Правки с вебинара.
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

    //    Пирамидальная сортировка. ВременнАя сложность. Быстрее чем линейная. O(n * log n).
    public static void heapSort(int[] array) {
        // Построение кучи (перегруппировка массива).
        for (int i = array.length / 2 - 1; i >= 0; i--) heapify(array, array.length, i);
        // Извлечение элементов кучи один за другим.
        for (int i = array.length - 1; i >= 0; i--) {
            // Перемещение текущего корня в конец.
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            // Вызов процедуры heapify на уменьшенной куче.
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex; // Инициализация наибольшего элемента как корень.
        int leftChild = 2 * rootIndex + 1; // Левый = 2 * rootIndex + 1.
        int rightChild = 2 * rootIndex + 2; // Правый = 2 * rootIndex +2.

        // Если левый дочерний элемент больше корня.
        if (leftChild < heapSize && array[leftChild] > array[largest]) largest = leftChild;
        // Если правый дочерний элемент больше самого большого элемента на данный момент.
        if (rightChild < heapSize && array[rightChild] > array[largest]) largest = rightChild;
        // Если самый большой элемент не корень.
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;
            // Рекурсивное преобразование в двоичную кучу затронутого дерева.
            heapify(array, heapSize, largest);
        }
    }


    public static void main(String[] args) {
        /*
        Алгоритмы простой сортировки.
         */
        int length = 20, maxValue = 100;
//        Пузырьковая сортировка.
        int[] array = arrayRandomizer(length, maxValue);
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

//        Сортировка выбором.
        array = arrayRandomizer(length, maxValue);
        System.out.println(Arrays.toString(array));
        directSort(array);
        System.out.println(Arrays.toString(array));

//        Сортировка вставками.
        array = arrayRandomizer(length, maxValue);
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));


        /*
        Алгоритмы поиска.
         */
        Random random = new Random();
        int unknownValue = array[random.nextInt(length)];
        System.out.println(unknownValue);
//        Простой перебор.
        System.out.println(simpleSearch(array, unknownValue));

//        Бинарный поиск. Хорошо работает с отсортированными массивами.
        System.out.println(binarySearch(array, unknownValue));


        /*
        Продвинутые алгоритмы сортировки.
        */
//        Быстрая сортировка.
        array = arrayRandomizer(length, maxValue);
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));

//        Пирамидальная сортировка.
        array = arrayRandomizer(length, maxValue);
        System.out.println(Arrays.toString(array));
        heapSort(array);
        System.out.println(Arrays.toString(array));

    }
}
