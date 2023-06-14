package Examples.Webinar_01;

import java.util.Arrays;

public class Homework {

    /*
    1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

    2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя.
    Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
     */

    // Задача 1.
    // ArrayIndexOutOfBoundsException.
    public static void method1() {
        int[] array = new int[10];
        for (int i = 0; i <= array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // ArithmeticException.
    public static void method2() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println(i / i);
        }

    }

    // NullPointerException.
    public static int method3() {
        Integer i = null;
        return (int) i;
    }

    // Задача 2.
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) { // ArrayIndexOutOfBoundsException если количество столбцов массива меньше пяти.
                // А, если столбцов больше, то алгоритм обрабатывать их не будет.
                int val = Integer.parseInt(arr[i][j]); // NumberFormatException если строка не из целых чисел.
                sum += val; // Есть шанс превысить максимальное или минимальное значение int.
            }
        }
        return sum;
    }

    // Задача 3.
    public static int[] arrayQuotient(int[] array, int[] arr) throws RuntimeException {
        if (array.length != arr.length) throw new RuntimeException("Массивы не одинаковой длины.");
        for (int i = 0; i < array.length; i++) {
            if (arr[i] == 0) throw new RuntimeException("На ноль делить нельзя.");
            array[i] /= arr[i];
        }
        return array;
    }

    public static void main(String[] args) {

//        1.
//        method1();
//        method2();
//        method3();

//        2.
//        String[][] arr = new String[][]{{"1","1","1"},{"2","2","2"},{"3","3","3"}};
//        System.out.println(sum2d(arr));

//        3.
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int[] arra = new int[]{6, 5, 4, 3, 2};
        int[] arr = new int[]{6, 5, 4, 3, 2, 1};
        int[] ar = new int[]{6, 5, -1, 3, 2, 0};

        try {
            System.out.println(Arrays.toString(arrayQuotient(array, arr)));
//            System.out.println(Arrays.toString(arrayQuotient(array, ar)));
            System.out.println(Arrays.toString(arrayQuotient(array, arra)));
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
