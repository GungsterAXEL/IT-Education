package Webinar_02;

/**
 * Дано четное число N (>0) и символы c1 и c2.
 * Написать метод, который вернет строку длины N, которая состоит из
 * чередующихся символов c1 и c2, начиная с c1.
 * N=5
 * c1=”Oleg”
 * c2=”Vasya”
 * res = “OlegVasyaOlegVasyaOleg”
 */

public class Example_01_C1C2 {
    public static void main(String[] args) {
        int n = 10;
        String c1 = "Oleg", c2 = "Vasya", res = "";
        for (int i = n; i != 0; i--)
            res = (i % 2 == 0) ? res + c1 : res + c2;
        System.out.println(res);
    }
}
