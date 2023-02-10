package Lection_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example_03_ArrayList {
    public static void main(String[] args) {
        // Инициализация ArrayList.
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);
        ArrayList<Integer> list4 = new ArrayList<>(list3);
        System.out.println(list3);
        list3.add(123);
        System.out.println(list4);

        // Работа с ArrayList.
        ArrayList list = new ArrayList();
        list.add(2809); // Забрасываем (Object)2809 в list. При извлечении данных из list необходимо
                        // будет сделать проверку типа извлекаемых данных.

        ArrayList<Integer> newList = new ArrayList<Integer>(); // Обобщение типа данных для списка, чтобы не делать
                                                               // проверку типа извлекаемых данных.
        newList.add(2808);

        for (Object o : list) {
            System.out.println(o);
        }
        for (Integer o : newList) {
            System.out.println(o);
        }

        // Добавление переменных в массив, добавление массива в список.
        System.out.println();
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = {day,month,year};
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); //[29, 9, 1990]
        
    }
}
