package Webinar_04;

/**
 * Задача 0.
 * 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
 * 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
 * Сравните с предыдущим.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example_00_TimeComparing {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int items = 10000;
        long start = System.nanoTime();

        for (int i = 0; i < items; i++) {
            arrayList.add(i);
        }
        long end = System.nanoTime();
        System.out.println(end - start);

        start = System.nanoTime();
        for (int i = 0; i < items; i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println(end - start);
    }
}
