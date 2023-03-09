package Webinar_02_03_04_05_06.Example_Zoo.factory;

import java.util.Random;
import java.util.ArrayList;

import Webinar_02_03_04_05_06.Example_Zoo.animal.Lion;

public class LionsFactory {

    public static ArrayList<Lion> createLions(int lionCount) {
        Random random = new Random();
        ArrayList<Lion> lions = new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            lions.add(new Lion(random.nextInt(2000, 2024), 0, 4, random.nextInt(10)));
        }
        return lions;
    }
}
