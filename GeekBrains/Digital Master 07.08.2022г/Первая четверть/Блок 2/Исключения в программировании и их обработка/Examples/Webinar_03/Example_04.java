package Examples.Webinar_03;

import Examples.Webinar_03.Exceptions.FileNotExistException;
import Examples.Webinar_03.Exceptions.NullObjectException;
import Examples.Webinar_03.Exceptions.ZeroDivideException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example_04 {
    /*
    1. Создайте класс исключения, который будет выбрасываться при делении на 0.
    Исключение должно отображать понятное для пользователя сообщение об ошибке.

    2. Создайте класс исключений, которое будет возникать при обращении к пустому элементу
    в массиве ссылочного типа. Исключение должно отображать понятное для
    пользователя сообщение об ошибке

    3. Создайте класс исключения, которое будет возникать при попытке открыть
    несуществующий файл. Исключение должно отображать понятное для пользователя сообщение
    об ошибке.
     */
    public static void test() throws ZeroDivideException {
        System.out.println("Тест 1. Начало.");
        try {
            throw new ZeroDivideException();
        } catch (ZeroDivideException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Тест 1. Завершение.");
    }

    public static void test2() throws ZeroDivideException {
        System.out.println("Тест 2. Начало.");
        try {
            int a = 10, b = 1;
            int c = a / b;
        } catch (ArithmeticException e) {
            throw new ZeroDivideException(e);
        }
        System.out.println("Тест 2. Завершение.");
    }

    public static void test3() throws NullObjectException {
        System.out.println("Тест 3. Начало.");
        String[] strings = new String[5];
        try {
//            strings[0].length();
        } catch (NullPointerException e) {
            throw new NullObjectException("Обращение к пустому элементу");
        }
        System.out.println("Тест 3. Завершение.");
    }

    public static void test4() throws FileNotExistException {
        System.out.println("Тест 4. Начало.");
        try {
            FileReader reader = new FileReader("ttt.txt");
        } catch (FileNotFoundException e) {
            throw new FileNotExistException("Файл не найден");
        }
        System.out.println("Тест 4. Завершение.");
    }

    public static void main(String[] args) {
        System.out.println("Старт работы.");
        try {
            test();
            test2();
            test3();
            test4();
        } catch (ZeroDivideException | NullObjectException | FileNotExistException e) {
            e.printStackTrace();
        }
        System.out.println("Конец работы.");
    }
}
