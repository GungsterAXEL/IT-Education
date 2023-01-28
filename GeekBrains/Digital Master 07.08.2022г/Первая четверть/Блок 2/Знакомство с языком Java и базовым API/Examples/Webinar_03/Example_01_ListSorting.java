import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Задача 1.
 * Заполнить список десятью случайными числами.
 * Отсортировать список методом sort() и вывести его на экран.
 */

public class Example_01_ListSorting {
    public static void ListRandomizer(List<Integer> list) {
        Random random = new Random();
        int randomLength = random.nextInt(3,25);
        for (int i = 0; i < randomLength; i++) {
            int rand = random.nextInt(100);
            list.add(rand);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ListRandomizer(list);
        list.sort(null);
        for(Integer item:list){System.out.print(item);}
        System.out.println();
    }
}
