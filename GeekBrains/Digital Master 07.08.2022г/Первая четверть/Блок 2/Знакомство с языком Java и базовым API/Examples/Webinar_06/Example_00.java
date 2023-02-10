package Webinar_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6,
 * 3}. Распечатайте содержимое данного множества.
 * 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4,
 * 5, 6, 3}. Распечатайте содержимое данного множества.
 * 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6,
 * 3}. Распечатайте содержимое данного множества.
 */

public class Example_00 {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        System.out.println(set1);
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Iterator<Integer> iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
        System.out.println();

        Cat Barsic = new Cat();
        System.out.println(Barsic);
        Barsic.Print();

        Cat Pushok = new Cat("Pushok", "Black");
        Pushok.Print();
    }
}
