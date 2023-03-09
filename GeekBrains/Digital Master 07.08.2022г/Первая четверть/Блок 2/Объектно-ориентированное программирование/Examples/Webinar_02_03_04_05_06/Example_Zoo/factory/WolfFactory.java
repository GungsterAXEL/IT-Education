package Webinar_02_03_04_05_06.Example_Zoo.factory;

import java.util.ArrayList;
import java.util.Random;

import Webinar_02_03_04_05_06.Example_Zoo.animal.Wolf;


public class WolfFactory {
    public static ArrayList<Wolf> createWolfs(int wolfCount) {
        Random random = new Random();
        ArrayList<Wolf> wolfs = new ArrayList<>();
        for (int i = 0; i < wolfCount; i++) {
            wolfs.add(new Wolf(random.nextInt(2000, 2024), random.nextInt(50), 4));
        }
        return wolfs;
    }
}
