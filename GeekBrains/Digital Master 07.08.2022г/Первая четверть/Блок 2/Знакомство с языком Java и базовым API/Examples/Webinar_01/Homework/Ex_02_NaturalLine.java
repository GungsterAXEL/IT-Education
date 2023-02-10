/**
 *      Задача 2.
 *      Вывести все простые числа от 1 до 1000.
 */
package Webinar_01.Homework;

public class Ex_02_NaturalLine {
    public static void main(String[] args) {
        int count = 0, n = 1000;
        for (int i = 2; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
            count = 0;
        }
    }
}
