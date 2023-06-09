package Examples;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Webinar_01_Algorithm_Complexity {
    /*
    Задача 1.
    Найти сумму чисел от 1 до N.
    int sum = (number + 1) * number / 2; - при использовании формулы сложность алгоритма будет константной.
    */
    public static int sumNumbers(int num) {
        return (num + 1) * num / 2;
    } // Константная сложность.

    public static int summNumbers(int num) { // Линейная сложность. O(n).
        int sum = 0;
        for (int i = 1; i <= num; sum += i, i++) ;
        return sum;
    }

    /*
    Задача 2.
    Написать алгоритм поиска простых чисел.
     */
    public static void primeNumbers(int num) { // Квадратичная сложность. O(n^2).
        List<Integer> primeList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primeList.add(i);
            }
        }
        System.out.println(primeList);
    }

    /*
    Задача 3.
    Написать алгоритм поиска всех доступных комбинаций для количества кубиков K с количеством граней N.
    Можно либо строго ограничить количество кубиков, либо сделать динамическим.
     */
    public static List<List<Integer>> getDiceCombinations(int cubes, int faces) { // Экспоненциальная сложность. O(cubes^faces).
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> combination = new ArrayList<>(cubes);

        if (faces > 0) {
            // Создание стартовой комбинации.
            for (int i = 0; i < cubes; combination.add(1), i++) ;

            // Остальная деятельность.
            while (true) {
                combinations.add(new ArrayList<>(combination));
                int index = cubes - 1;
                // Условие смены позиции.
                while (index >= 0 && combination.get(index) == faces) {
                    index--;
                }
                // С отрицательным индексом не работаем.
                if (index < 0) {
                    break;
                }
                combination.set(index, combination.get(index) + 1);
                // Возвращаем стартовое значение для кубиков справа от текущего индекса.
                for (int i = index + 1; i < cubes; combination.set(i, 1), i++) ;
            }
        }
        return combinations;
    }

    public static void quadroO() { // Сложность в четвёртой степени. O(n^4).
        int numberCube = 4, numberSides = 6, cnt = 0;
        List<String> simpleList = new ArrayList<>();
        for (int i1 = 1; i1 <= numberSides; i1++) {
            for (int i2 = 1; i2 <= numberSides; i2++) {
                for (int i3 = 1; i3 <= numberSides; i3++) {
                    for (int i4 = 1; i4 <= numberSides; i4++) {
                        simpleList.add(" " + i1 + i2 + i3 + i4);
                    }
                }
            }
        }
        System.out.println(simpleList);
    }

    /*
    Задача 4.
    Написать алгоритм вычисления чисел Фибоначчи рекурсивно.
     */
    public static int fibRec(int n) {
        if (n <= 2) return 1;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    /*
    Задача 5.
    Написать алгоритм вычисления чисел Фибоначчи без рекурсии.
     */
    public static List<Integer> fibList(int number) {
        int fib0 = 0, fib1 = 1;
        List<Integer> negative = new ArrayList<>();
        negative.add(fib0);
        negative.add(fib1);
        for (int i = 2; i < number; i++) {
            int fn = negative.get(i - 2) - negative.get(i - 1);
            negative.add(fn);
        }

        List<Integer> positive = new ArrayList<>();
        positive.add(fib0);
        positive.add(fib1);
        for (int i = 2; i <= number; i++) {
            int fn = positive.get(i - 1) + positive.get(i - 2);
            positive.add(fn);
        }

        List<Integer> result = new ArrayList<>();
        negative.remove(0);
        Collections.reverse(negative);
        result.addAll(negative);
        result.addAll(positive);
        return result;
    }


    public static void main(String[] args) {
//        1.
        int n = 200;
        long start = System.nanoTime();
        System.out.print(summNumbers(n) + " ");
        long end = System.nanoTime();
        System.out.println(end - start);

        start = System.nanoTime();
        System.out.print(summNumbers(n) + " ");
        end = System.nanoTime();
        System.out.println(end - start);

//        2.
        int nu = 200;
        primeNumbers(nu);

//        3.
        int cubes = 2, faces = 2;
        System.out.println(getDiceCombinations(cubes, faces));
        getDiceCombinations(cubes, faces).stream().forEach(System.out::println);
        quadroO();

//        4.
        int num = 30;
        start = System.nanoTime();
        System.out.print(fibRec(num));
        end = System.nanoTime();
        System.out.println(" " + (end - start));

//        5.
        int numb = num;
        start = System.nanoTime();
        System.out.println(fibList(numb));
        end = System.nanoTime();
        System.out.println(end - start);

    }
}