import java.util.Stack;

public class Example_04_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1); // Поместить элемент вверх стека.
        stack.push(12);
        stack.push(123);
        System.out.println(stack.pop()); // 123. Извлечь значение и удалить верхний элемент стека.
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1
    }
}
