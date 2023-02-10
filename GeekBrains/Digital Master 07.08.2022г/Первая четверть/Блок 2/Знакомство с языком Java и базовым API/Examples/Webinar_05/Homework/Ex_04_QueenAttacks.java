/**
 * Задача 4*.
 * На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
 */
package Webinar_05.Homework;

import java.util.Arrays;

public class Ex_04_QueenAttacks {
    static String elements[] = { "◽", "◾", "♕" };
    static int[] chessline = { 0, 0, 0, 0, 0, 0, 0, 0 };
    static String[][] chessboard = new String[chessline.length][chessline.length];
    static int index = 0;
    static int variant = 0;

    public static boolean BoardChecker() {
        boolean result = true;
        if (index == 0) {
            result = true;
        }
        if (chessline[index] > 7) {
            chessline[index] = 0;
            index--;
            result = false;
        }
        for (int i = 0; i < index; i++) {
            if ((chessline[index] == chessline[i]) || ((Math.abs(chessline[index] - chessline[i])) == (index - i))) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        while (chessline[0] < chessline.length) {
            if (BoardChecker()) {
                if (index == chessline.length - 1) {
                    variant += 1;
                    for (int i = 0; i < chessboard.length; i++) {
                        for (int j = 0; j < chessline.length; j++) {
                            if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1))
                                chessboard[i][j] = "◽";
                            else
                                chessboard[i][j] = "◾";
                        }
                        chessboard[i][chessline[i]] = elements[2];
                    }
                    System.out.println("Вариант " + variant);
                    Arrays.stream(chessboard).map(Arrays::toString).forEach(System.out::println);
                    chessline[index]++;
                } else {
                    index++;
                }
            } else {
                chessline[index]++;
            }
        }
    }
}