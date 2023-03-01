package Webinar_02_03_04_05.factory;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import Webinar_02_03_04_05.animal.Lion;

public class LionsFactory {

    public static List<Lion> createLions(int lionCount) {
        Random random = new Random();
        List<Lion> lions = new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            lions.add(new Lion(random.nextInt(2000, 2024), 0, 4, random.nextInt(10)));
        }
        return lions;
    }
}
