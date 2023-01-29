/**
 * Задача 2.
 * Реализуйте алгоритм сортировки пузырьком числового массива,
 * результат после каждой итерации запишите в лог-файл.
 */

package Homework;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Ex_02_BubbleSort {
    public static int[] BubbleSort(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                BubbleSortLogger(Arrays.toString(array));
            }
        }
        return array;
    }

    public static void BubbleSortLogger(String array) {
        Logger logger = Logger.getLogger(Ex_02_BubbleSort.class.getName());

        String separator = File.separator;
        String filePath = String.join(separator, "GeekBrains", "Digital Master 07.08.2022г", "Первая четверть",
                "Блок 2", "Знакомство с языком Java и базовым API", "Examples", "Webinar_02", "Homework");
        String fileName = "Ex_02.log";

        try {
            FileHandler fh = new FileHandler(filePath + separator + fileName, true);
            logger.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);
            logger.log(Level.INFO, array);
            fh.close();
        } catch (IOException e) {
            logger.severe(e.getMessage());
        }
    }

    public static void main(String[] args) {
        int[] array = { 4, 5, 9, 1, 0, 7, 3, 2, 8, 6 };
        array = BubbleSort(array);
    }
}
