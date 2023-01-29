/**
 * Напишите метод, который принимает на вход строку (StringBulder)
 * и определяет является ли строка палиндромом (возвращает boolean значение).
 * equals и StringBulder для revers
 */

public class Example_03_StringPalindrom {
    public static void isPalindrom(String s){
        String reversed = new StringBuilder(s).reverse().toString();
        if (s.equals(reversed)) System.out.println("Палиндром.");
        else System.out.println("Не палиндром.");
    }
    public static void main(String[] args) {
        String s = "asdsa";
        isPalindrom(s);
}    
}