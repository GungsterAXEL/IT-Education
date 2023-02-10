package Lection_04;

import java.util.LinkedList;
import java.util.Queue;

public class Example_01_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4); // Добавление элемента в очередь.
        System.out.println(queue); // [1, 2, 3, 4]
        int item = queue.remove(); // Извлечение первого добавленного элемента в очередь с последующим его удалением.
        // .remove() может вызвать исключение java.util.NoSuchElementException;
        System.out.println(item);
        System.out.println(queue); // [2, 3, 4]
        queue.offer(2809);
        item = queue.remove();
        System.out.println(queue); // [3, 4, 2809]
        item = queue.remove();
        System.out.println(queue); // [4, 2809]
        item = queue.remove();
        System.out.println(queue); // [2809]
        System.out.println(queue.peek());
    }
}
