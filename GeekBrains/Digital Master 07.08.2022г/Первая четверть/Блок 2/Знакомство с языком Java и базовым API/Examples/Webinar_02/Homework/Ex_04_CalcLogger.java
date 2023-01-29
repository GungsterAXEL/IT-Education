/**
 * Задача 4.
 * К калькулятору из предыдущего ДЗ добавить логирование.
 */

package Homework;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Ex_04_CalcLogger {
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

    public static void CalcLogger(String result) {
        Logger logger = Logger.getLogger(Ex_02_BubbleSort.class.getName());

        String separator = File.separator;
        String filePath = String.join(separator, "GeekBrains", "Digital Master 07.08.2022г", "Первая четверть",
                "Блок 2", "Знакомство с языком Java и базовым API", "Examples", "Webinar_02", "Homework");
        String fileName = "Ex_04.log";

        try {
            FileHandler fh = new FileHandler(filePath + separator + fileName, true);
            logger.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);
            logger.log(Level.INFO, result);
            fh.close();
        } catch (IOException e) {
            logger.severe(e.getMessage());
        }
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
                CalcLogger("Исследование завершено!");
            } else {
                strExpression = inputCorrector(strExpression);
                mathExpression = strExpression.split(" ");
                result = Operations(Double.parseDouble(mathExpression[0]), Double.parseDouble(mathExpression[2]),
                        mathExpression[1]);
                System.out.println(strExpression + " = " + result);
                CalcLogger(strExpression + " = " + result);
            }
        }
    }
}
