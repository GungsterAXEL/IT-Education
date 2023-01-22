/**
 * Задача 4*.
 * Задано уравнение вида q + w = e, q, w, e >= 0.
 * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
 * Требуется восстановить выражение до верного равенства.
 * Предложить хотя бы одно решение или сообщить, что его нет.
 * 24 45 //24 + 45 = 69 (n=2)
 */
package Homework;

public class Ex_04_WTFEquation {
    public static Integer lookingForUnknowns(String eq) {
        int count = 0;
        for (int i = 0; i < eq.length(); i++) {
            if (eq.charAt(i) == '?')
                count++;
        }
        return count;
    }

    public static Integer[][] Converter(String eq, String[] eQ, int limit) {
        Integer[][] arrC = new Integer[lookingForUnknowns(eq)][limit];
        for (int i = 0; i < limit; i++) {
            arrC[0][i] = Integer.parseInt(eQ[0].replace("?", Integer.toString(i)));
            arrC[1][i] = Integer.parseInt(eQ[2].replace("?", Integer.toString(i)));
        }
        return arrC;
    }

    public static void Resulter(Integer[][] arrC, String eq, int result) {
        int count = 0;
        for (int i = 0; i < arrC[0].length; i++) {
            for (int j = 0; j < arrC[0].length; j++) {
                if (arrC[0][i] + arrC[1][j] == result) {
                    System.out.printf("%d + %d = %d", arrC[0][i], arrC[1][j], result);
                    count++;
                }
            }
        }
        if (count == 0)
            System.out.println("Для " + eq + " нет решений!");
    }

    public static void main(String[] args) {
        int limit = 10;
        String eq = "2? + ?5 = 69";
        String[] eQ = eq.split(" ");
        int result = Integer.parseInt(eQ[4]);
        Integer[][] arrC = Converter(eq, eQ, limit);
        Resulter(arrC, eq, result);
    }
}
