package Webinar_02.Example_01.factory;

import java.util.ArrayList;
import java.util.Random;

import Webinar_02.Example_01.animals.Lion;

public class LionsFactory {
    public static ArrayList<Lion> createLions(int lionCount) {
        Random random = new Random();
        ArrayList<Lion> lions = new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            Lion lion = new Lion(2023, random.nextInt(1, 3), 4, random.nextInt(3));
            lions.add(lion);
        }
        return lions;
    }
}
