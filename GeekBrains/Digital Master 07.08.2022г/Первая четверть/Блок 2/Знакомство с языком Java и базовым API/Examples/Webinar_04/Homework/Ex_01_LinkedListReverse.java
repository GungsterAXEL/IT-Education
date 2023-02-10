/**
 * Задача 1.
 * Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернет “перевернутый” список.
 */

package Webinar_04.Homework;

import java.util.LinkedList;

public class Ex_01_LinkedListReverse {
    // Метод с созданием второго списка.
    // public static LinkedList<Integer> LLReverse(LinkedList<Integer> ll) {
    //     LinkedList<Integer> llReversed = new LinkedList<>();
    //     int size = ll.size();
    //     for (int i = 0; i < size; i++) {
    //         int temp = ll.removeLast();
    //         llReversed.add(temp);
    //     }
    //     return llReversed;
    // }

    // Без создания второго списка.
    public static LinkedList<Integer> LLReverse(LinkedList<Integer> ll) {
        int size = ll.size();
        for (int i = 0; i < size; i++) {
            ll.offerFirst(ll.remove(i));
        }
        return ll;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        int limit = 10;
        for (int i = 0; i < limit; i++) {
            ll.add(i);
        }
        System.out.println(ll);
        ll = LLReverse(ll);
        System.out.println(ll);
    }
}
