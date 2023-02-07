/**
 * Задача 2.
 * Пусть дан список сотрудников:Иван Иванов и т.д.
 * Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 */
package Homework;

import java.util.Map;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Ex_02_NameCounter {
    public static List<String> NameRandomizer() {
        Random random = new Random();
        List<String> nameList = new ArrayList<>();
        String surname = "", name = "";
        String[] names = { "Иван", "Александр", "Сергей", "Роман", "Павел" };
        String[] surnames = { "Иванов", "Петров", "Сычёв", "Пименов", "Алаев" };
        Integer length = random.nextInt(1, 20);
        for (int i = 0; i < length; i++) {
            name = names[random.nextInt(names.length)];
            surname = surnames[random.nextInt(surnames.length)];
            nameList.add(name + " " + surname);
        }
        return nameList;
    }

    public static void main(String[] args) {
        Map<String, Integer> nameCount = new LinkedHashMap<>();
        Map<String, Integer> sortedCount = new LinkedHashMap<>();
        List<String> nameList = NameRandomizer();
        System.out.println(nameList.toString());
        for (int i = 0; i < nameList.size(); i++) {
            String[] temp = nameList.get(i).split(" ");
            nameCount.putIfAbsent(temp[0], 0);
            nameCount.put(temp[0], nameCount.get(temp[0]) + 1);
        }
        nameCount.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(name -> sortedCount.put(name.getKey(), name.getValue()));
        System.out.println("Количество повторений имён: " + nameCount);
        System.out.println("Сортировка повторений по убыванию: " + sortedCount);
    }
}
