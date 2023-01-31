
/**
 * Задача 2.
 * Реализовать консольное приложение, которое:
 * 1) Принимает от пользователя и “запоминает” строки.
 * 2) Если введено print, выводит строки так,
 * чтобы последняя введенная была первой в списке, а первая - последней.
 * 3) Если введено revert, удаляет предыдущую введенную строку из памяти
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Example_02_StringRevert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        while (true) {
            String str = scan.nextLine();
            if (str.equals("print")) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    System.out.println(list.get(i));
                }
            } else if (str.equals("revert")) {
                list.remove(list.size() - 1);
            } else if (str.equals("stop"))
                break;
            else
                list.add(str);
        }
        scan.close();
    }
}
