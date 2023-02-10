package Webinar_03.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Задача 3.
 * Задан целочисленный список ArrayList.
 * Найти минимальное, максимальное и среднее арифметическое из этого списка.
 */

public class Ex_03_MinMaxArithmeticMeanFinder {
    public static List<Integer> ListRandomizer() {
        Random random = new Random();
        List<Integer> randomizedList = new ArrayList<>();
        for (int i = 0; i < random.nextInt(25); i++) {
            int randomNumber = random.nextInt(100);
            randomizedList.add(randomNumber);
        }
        return randomizedList;
    }

    public static void MinMaxArithmeticMeanFinder(List<Integer> list) {
        int minValue = list.get(0), maxValue = list.get(0);
        double arithmeticMean = 0;
        for (Integer item : list) {
            if (minValue > item)
                minValue = item;
            if (maxValue < item)
                maxValue = item;
            arithmeticMean += item;
        }
        arithmeticMean /= list.size();
        System.out.println("Минимальное число в списке: " + minValue);
        System.out.println("Максимальное число в списке: " + maxValue);
        System.out.println("Среднее арифметическое списка: " + arithmeticMean);
    }

    public static void main(String[] args) {
        Scanner iSc = new Scanner(System.in);
        String restartAnswer = "";
        boolean restart = true;
        while (restart) {
            List<Integer> list = ListRandomizer();
            System.out.println("\nСлучайно сгенерированный список: " + list);

            if (list.isEmpty() || list.size() == 1)
                System.out.println("Нечего считать!");
            else
                MinMaxArithmeticMeanFinder(list);

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
