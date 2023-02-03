/**
 * Задача 2.
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди.
 * dequeue() - возвращает первый элемент из очереди и удаляет его.
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

package Homework;

import java.util.LinkedList;
import java.util.Random;

public class Ex_02_MyQueue {
    public static LinkedList<Integer> LLRandomizer() {
        LinkedList<Integer> ll = new LinkedList<>();
        Random random = new Random();
        int size = random.nextInt(15);
        for (int i = 0; i < size; i++) {
            ll.add(random.nextInt(10));
        }
        return ll;
    }

    public static void Enqueue(LinkedList<Integer> ll, Integer element) {
        ll.addLast(element);
    }

    public static Integer Dequeue(LinkedList<Integer> ll) {
        return ll.pollFirst();
    }

    public static Integer First(LinkedList<Integer> ll) {
        return ll.peekFirst();
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = LLRandomizer();
        System.out.println("Случайно сгенерированный список: " + ll);
        Enqueue(ll, 9);
        System.out.println("Добавили к нему элемент в конец очереди: " + ll);
        Integer a = Dequeue(ll);
        System.out.println("Удаление первого элемента и присваивание его в переменную: " + a);
        System.out.println("Результат после удаления: " + ll);
        a = First(ll);
        System.out.println("Присваивание значения первого элемента списка в переменную: " + a);
        System.out.println("Элемент из списка не удалён: " + ll);
    }
}
