package Webinar_01;

import java.util.Arrays;
import java.util.Random;

public class Tools {
    public static int[] arrayRandomizer(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(length * length * length);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
