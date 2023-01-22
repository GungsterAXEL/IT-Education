/**
 *      Задача 3.
 *      Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *).
 *      int a ; int b; String op (op!=”Stop”); (char != ’b’)
 */
package Homework;

import java.util.Scanner;

public class Ex_03_LowLvlCalc {
    public static String inputCorrector(String strExpression) {
        strExpression = strExpression.replaceAll("\\s", "")
                .replace(",", ".")
                .replace("+", " + ")
                .replace("-", " - ")
                .replace("*", " * ")
                .replace("/", " / ");
        return strExpression;
    }

    public static double Operations(double a, double b, String operation) {
        double result;
        if (operation.equals("+"))
            result = a + b;
        else if (operation.equals("-"))
            result = a - b;
        else if (operation.equals("/"))
            result = a / b;
        else
            result = a * b;
        return result;
    }

    public static void main(String[] args) {
        Scanner iSc = new Scanner(System.in);
        boolean restart = true;
        double result = 0;
        String strExpression = "";
        String[] mathExpression;
        while (restart) {
            System.out.print("Введите математическое выражение: ");
            if (iSc.hasNextLine())
                strExpression = iSc.nextLine();
            if (strExpression.equals("Stop") || strExpression.equals("b")) {
                System.out.println("Пока-пока!");
                iSc.close();
                restart = false;
            } else {
                strExpression = inputCorrector(strExpression);
                mathExpression = strExpression.split(" ");
                result = Operations(Double.parseDouble(mathExpression[0]), Double.parseDouble(mathExpression[2]),
                        mathExpression[1]);
                System.out.println(strExpression + " = " + result);
            }
        }
    }
}