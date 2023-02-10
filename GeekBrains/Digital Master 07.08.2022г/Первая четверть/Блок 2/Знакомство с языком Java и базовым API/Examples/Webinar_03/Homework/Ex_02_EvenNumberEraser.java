package Webinar_03.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Задача 2.
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа.
 */

public class Ex_02_EvenNumberEraser {
    public static List<Integer> ListRandomizer() {
        Random random = new Random();
        List<Integer> randomizedList = new ArrayList<>();
        for (int i = 0; i < random.nextInt(25); i++) {
            int randomNumber = random.nextInt(100);
            randomizedList.add(randomNumber);
        }
        return randomizedList;
    }

    public static List<Integer> EvenNumberEraser(List<Integer> list) {
        List<Integer> list2 = new ArrayList<>();
        for (Integer item : list) {
            if (item % 2 != 0) {
                list2.add(item);
            }
        }
        return list2;
    }

    public static void main(String[] args) {
        Scanner iSc = new Scanner(System.in);
        String restartAnswer = "";
        boolean restart = true;
        while (restart) {
            List<Integer> list = ListRandomizer();
            System.out.println("Случайно сгенерированный список: " + list);

            list = EvenNumberEraser(list);
            System.out.println("Список без чётных чисел: " + list);

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
