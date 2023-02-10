/**
 *      Задача 1.
 *      Вычислить n-ое треугольного число(сумма чисел от 1 до n),
 *      n! (произведение чисел от 1 до n).
 */
package Webinar_01.Homework;

import java.util.Scanner;

public class Ex_01_ArithmeticFactorial {
    public static void main(String[] args) {
        Scanner iSc = new Scanner(System.in);
        System.out.print("Введите число: ");
        Integer n = iSc.nextInt();
        iSc.close();
        int sumResult = 0, multResult = 1;
        for (int i = n; i > 0; i--) {
            sumResult += i;
            multResult *= i;
        }
        System.out.println("Арифметическая прогрессия до " + n + " = " + sumResult + ".");
        System.out.println(n + "!" + " = " + multResult + ".");
    }

}
