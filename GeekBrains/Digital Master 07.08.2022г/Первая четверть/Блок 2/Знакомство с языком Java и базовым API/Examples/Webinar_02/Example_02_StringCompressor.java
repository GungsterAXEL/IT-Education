/**
 * Напишите метод, который сжимает строку.
 * Пример: вход aaaabbbcdd.
 * Выход abcd
 * charAt(i) и indefOf(s)
 */

public class Example_02_StringCompressor {
    public static String StringCompressor(String a) {
        String res = "";
        for (int i = 0; i < a.length(); i++) {
            if (res.indexOf(a.charAt(i)) == -1)
                res += a.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String a = "aaaabbbcdd";
        String res = StringCompressor(a);
        System.out.println(res);
    }
}