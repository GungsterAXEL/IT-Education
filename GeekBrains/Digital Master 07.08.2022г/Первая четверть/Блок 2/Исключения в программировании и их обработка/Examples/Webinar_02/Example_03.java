package Examples.Webinar_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example_03 {

    /*
    Задача 3.

    Запишите в файл следующие строки:
    Анна=4
    Елена=5
    Марина=6
    Владимир=?
    Константин=?
    Иван=4

    Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
    (либо HashMap, если студенты с ним знакомы).
    В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?,
    заменить его на соответствующее число (количество символов в имени).
    Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение.
    Записать в тот же файл данные с заменёнными символами ?.
     */
//    Examples/Webinar_02/Example_03.txt
    public static void read() {
        File file = new File("Examples/Webinar_02/Example_03.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (scan.hasNext()) {
            String line = scan.nextLine();
            line = checkLine(line);
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        scan.close();

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String checkLine(String line) {
        String[] strings = line.split("=");
        char[] chars = strings[1].toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!(Character.isDigit(chars[i]) || chars[i] == '?')) throw new RuntimeException("Некорректная запись.");
        }
        if (strings[1].equals("?")) strings[1] = String.valueOf(strings[0].length());
        return strings[0] + "=" + strings[1];
    }

    public static void main(String[] args) {
        read();
    }
}
