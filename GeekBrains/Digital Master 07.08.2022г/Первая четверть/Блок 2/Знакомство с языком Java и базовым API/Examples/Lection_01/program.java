package Lection_01;

import java.util.Scanner;

/**
 * Здесь можно оставить комментарий.
 */
public class program {
    public static void main(String[] args) {
        System.out.println("\nBegin!\n"); // Здесь тоже можно оставить комментарий.
        String s = " ==D";
        System.out.println(s);
        System.out.println(getType(s));
        System.out.println(s.getClass().getSimpleName()); // Вариант как узнать тип данных переменной без метода.
        int p = 23_123_34; // При объявлении значения переменной можно использовать '_' для указания
                           // разрядов.
        System.out.println(p);
        /**
         * Пример использования Класса-Обёртки (выглядит как полное название типа данных
         * и начинается с большой буквы):
         */
        System.out.println(Integer.MIN_VALUE); // Показать минимально возможное значение типа данных int.
        /**
         * Инкримент и Декримент (++ и --):
         */
        System.out.println("\nИнкремент и декремент.");
        int a = 1;
        System.out.println(a++); // Постфиксный инкремент. Выполняется после вывода.
        System.out.println(a);
        System.out.println(++a); // Предфиксный инкремент. Выполняется до вывода.
        /**
         * Приоритет инкремента и декремента.
         */
        a = 2;
        a = --a - a--;
        System.out.println(a); // 0
        a = 2;
        a = a-- - --a;
        System.out.println(a); // 2
        /**
         * Побитовые операции.
         */
        System.out.println("\nПобитовые операции.");
        a = 8; // 1000 (двоичное представление).
        System.out.println(a << 1); // 10000 или 16 (сдвиг влево).
        System.out.println(a >> 1); // 0100 или 4 (сдвиг вправо).
        int y = 5; // 101.
        int x = 2; // 010.
        System.out.println(y | x); // 7 111.
        System.out.println(y ^ x); // 7 111.
        System.out.println(y & x); // 0 000.
        System.out.println("\nЛогические операции.");
        boolean c = true;
        boolean v = true;
        System.out.println(c & v);
        System.out.println(c && v);
        System.out.println(c | v);
        System.out.println(c || v);
        System.out.println(c ^ v);
        s = "qwwe1"; // 5 знаков, индексы от 0 до 4.
        boolean b = s.length() >= 5 || s.charAt(4) == '1'; // Проверит одно из высказываний.
        System.out.println(b);
        b = s.length() >= 5 | s.charAt(4) == '1'; // Проверит оба высказывания, если индексов будет меньше - программа
                                                  // вылетит с ошибкой.
        System.out.println(b);
        /**
         * Массивы.
         */
        System.out.println("\nМассивы.");
        int[] arr = new int[10]; // Одномерный массив можно объявить так.
        System.out.println(arr.length); // 10
        arr = new int[] { 1, 2, 3, 4, 5 }; // Или одномерный массив можно объявить так.
        System.out.println(arr.length); // 5
        int[][] mat = new int[3][5];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("%d", mat[i][j]);
            }
            System.out.println();
        }
        /**
         * Получение данных из терминала.
         */
        /**
         * Строки.
         */
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        /**
         *  Для инта:
         * int name = iScanner.nextInt();
         *  Для дабла:
         * double name = iScanner.nextDouble();
         */
        System.out.printf("Привет, %s!", name);
        iScanner.close();
        System.out.println("\nEnd!\n");
    }

    static String getType(Object o) { // Метод, возвращающий тип данных нужной переменной.
        return o.getClass().getSimpleName();
    }
}