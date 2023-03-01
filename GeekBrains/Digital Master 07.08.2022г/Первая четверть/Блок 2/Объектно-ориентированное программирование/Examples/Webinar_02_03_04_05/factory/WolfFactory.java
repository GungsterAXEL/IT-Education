package Webinar_02_03_04_05.factory;

import java.util.Random;

import Webinar_02_03_04_05.animal.Wolf;

import java.util.ArrayList;

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
