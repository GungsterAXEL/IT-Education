package Lection_04;

import java.util.PriorityQueue;

public class Example_02_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Наивысший приоритет имеет наименьший элемент.
        // Добавляем элементы.
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        // Выводим очередь.
        System.out.println(pq); // [1, 3, 13, 123];
        System.out.println(pq.poll()); // Извлечение и удаление элемента коллекции по приоритету.
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll()); // Если коллекция пустая - вернёт null.
    }
}
