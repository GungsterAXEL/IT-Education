package Webinar_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Задача 3.
 * Создать список типа ArrayList<String>.
 * Поместить в него как строки, так и целые числа.
 * Пройти по списку, найти и удалить целые числа.
 */

public class Example_03_IntEraser {
    public static void main(String[] args) {
        String[] items = { "ФЫАРЛОА", "5", "5.1", "фваощш" };
        List<String> list = Arrays.asList(items);
        List<String> list2 = new ArrayList<>();
        for (String item : list) {
            try{
                Integer.parseInt(item);
            }catch(Exception e){
                System.out.println(e.getMessage());
                list2.add(item);
            }
        }
        System.out.println(list);
        System.out.println(list2);
    }
}
