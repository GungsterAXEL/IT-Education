package Webinar_03.Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задача 1.
 * Реализовать алгоритм сортировки слиянием.
 * 
 * Подробный алгоритм сортировки.
 * Для решения задачи сортировка делится на три этапа и они выглядят так:
 * 1. Сортируемый массив разбивается на две части примерно одинакового размера;
 * 2. Каждая из получившихся частей сортируется отдельно, например — тем же
 * самым алгоритмом;
 * 3. Два упорядоченных массива половинного размера соединяются в один.
 * 
 * 1.1. — 2.1. Рекурсивное разбиение задачи на меньшие происходит до тех пор,
 * пока размер массива не достигнет единицы (любой массив длины 1 можно считать
 * упорядоченным).
 * 3.1. Соединение двух упорядоченных массивов в один.
 * Основную идею слияния двух отсортированных массивов можно объяснить на
 * следующем примере.
 * Пусть мы имеем два уже отсортированных по возрастанию подмассива.
 * Тогда:
 * 3.2. Слияние двух подмассивов в третий результирующий массив.
 * На каждом шаге мы берём меньший из двух первых элементов подмассивов и
 * записываем его в результирующий массив.
 * Счётчики номеров элементов результирующего массива и подмассива,
 * из которого был взят элемент, увеличиваем на 1.
 * 3.3. «Прицепление» остатка.
 * Когда один из подмассивов закончился, мы добавляем все оставшиеся элементы
 * второго подмассива
 * в результирующий массив.
 */

public class Ex_01_MergeSort {
    private static Integer[] ArrayRandomizer() {
        Random random = new Random();
        Integer[] arrayToSort = new Integer[random.nextInt(30)];
        for (int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = random.nextInt(100);
        }
        return arrayToSort;
    }

    private static Integer[] MergeSort(Integer[] arrayToSort) {
        if (arrayToSort.length == 1 || arrayToSort.length == 0)
            return arrayToSort;

        Integer[] stack1 = MergeSort(Arrays.copyOfRange(arrayToSort, 0, arrayToSort.length / 2));
        Integer[] stack2 = MergeSort(Arrays.copyOfRange(arrayToSort, arrayToSort.length / 2, arrayToSort.length));

        int counter1 = 0, counter2 = 0, counter3 = 0;
        Integer[] sortedArray = new Integer[stack1.length + stack2.length];

        while (counter1 < stack1.length && counter2 < stack2.length) {
            if (stack1[counter1] <= stack2[counter2]) {
                sortedArray[counter3] = stack1[counter1];
                counter1 += 1;
            } else {
                sortedArray[counter3] = stack2[counter2];
                counter2 += 1;
            }
            counter3 += 1;
        }

        while (counter1 < stack1.length) {
            sortedArray[counter3] = stack1[counter1];
            counter1 += 1;
            counter3 += 1;
        }

        while (counter2 < stack2.length) {
            sortedArray[counter3] = stack2[counter2];
            counter2 += 1;
            counter3 += 1;
        }

        for (int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = sortedArray[i];
        }

        return arrayToSort;
    }

    public static void main(String[] args) {
        Scanner iSc = new Scanner(System.in);
        String restartAnswer = "";
        boolean restart = true;
        while (restart) {
            Integer[] arrayToSort = ArrayRandomizer();
            System.out.println("Массив до сортировки: " + Arrays.toString(arrayToSort));
            arrayToSort = MergeSort(arrayToSort);
            System.out.println("Массив после сортировки: " + Arrays.toString(arrayToSort));

            System.out.println("\nПовторим?\nВведите Stop для выхода.");
            if (iSc.hasNextLine())
                restartAnswer = iSc.nextLine();
            if (restartAnswer.equals("Stop")) {
                System.out.println("Пока-пока!");
                iSc.close();
                restart = false;
            }
        }
    }
}