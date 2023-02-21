package Webinar_02.factory;

import java.util.Random;
import java.util.ArrayList;

import Webinar_02.animal.Wolf;

public class WolfFactory {
    public static ArrayList<Wolf> createWolfs(int lionCount) {
        Random random = new Random();
        ArrayList<Wolf> lions = new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            lions.add(new Wolf(random.nextInt(2000, 2024), random.nextInt(50), 4));
        }
        return lions;
    }
}
