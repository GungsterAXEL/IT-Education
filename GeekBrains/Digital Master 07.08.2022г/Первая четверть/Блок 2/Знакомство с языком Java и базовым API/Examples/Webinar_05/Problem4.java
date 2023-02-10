package Webinar_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem4 {
//    Написать программу, определяющую правильность расстановки скобок в выражении.
//            Пример 1: a+(d*3) - истина
//    Пример 2: [a+(1*3) - ложь
//    Пример 3: [6+(3*3)] - истина
//    Пример 4: {a}[+]{(d*3)} - истина
//    Пример 5: <{a}+{(d*3)}> - истина
//    Пример 6: {a+]}{(d*3)} - ложь
    public static void main(String[] args) {
        String expr = "{a+(1*3)";
        String expr1 = "{a+(1*3)}";
        String expr2 = "([(a+(1*3))])";
        System.out.println(Check(expr));
        System.out.println(Check(expr1));
        System.out.println(Check(expr2));
    }
    public static Boolean Check(String expr){
        Map<Character, Character> newMap = new HashMap<>();
        newMap.put('{', '}');
        newMap.put('(', ')');
        newMap.put('[',']');
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            if(newMap.containsKey(expr.charAt(i))){
                charStack.push(expr.charAt(i));
            }
            else if (newMap.containsValue(expr.charAt(i))){
                if (charStack.isEmpty()) return false;
                    if (Character.compare(expr.charAt(i), charStack.get(charStack.size() - 1)) > 0){
                           charStack.pop();}
            }
        }
        System.out.println(charStack);
        return charStack.isEmpty();
    }
}
