
/**
 * Задача 3.
 * 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
 * 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Example_03_ArrayToStack {
    public static void InputInStack(Integer[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println(stack.toString());
        while(!stack.isEmpty()) System.out.println(stack.pop());
    }

    public static void InputInQueue(Integer[] array) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < array.length; i++) {
            deque.add(array[i]);
        }
        System.out.println(deque.toString());
        while(!deque.isEmpty()) System.out.println(deque.poll());
    }

    public static void main(String[] args) {
        Integer[] array = { 1, 4, 3, 7, 1, 7, 5, 8, 3, 4, 7, 1, 6, 2, 3, 4 };
        InputInStack(array);
        InputInQueue(array);
    }
}
