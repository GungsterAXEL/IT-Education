import java.util.Map;
import java.util.Stack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Задача 2.
 * Написать программу, определяющую правильность расстановки скобок в выражении.
 * Пример 1: a+(d*3) - истина
 * Пример 2: [a+(1*3) - ложь
 * Пример 3: [6+(3*3)] - истина
 * Пример 4: {a}[+]{(d*3)} - истина
 * Пример 5: <{a}+{(d*3)}> - истина
 * Пример 6: {a+]}{(d*3)} - ложь
 */
public class Example_02 {
    public static void main(String[] args) {
        Map<Character, Character> db = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        db.put('(', ')');
        db.put('[', ']');
        db.put('{', '}');
        db.put('<', '>');
        String str = "{a}[+]{(d*3)}";

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (db.containsKey(c))
                stack.add(c);
            else if (db.containsValue(c))
                stack.pop();
        }
        boolean result = stack.empty() ? true : false;
        System.out.println(result);
    }
}