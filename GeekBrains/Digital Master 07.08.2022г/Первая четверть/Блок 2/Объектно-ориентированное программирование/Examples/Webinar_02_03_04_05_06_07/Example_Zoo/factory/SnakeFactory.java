package Webinar_02_03_04_05_06_07.Example_Zoo.factory;

import Webinar_02_03_04_05_06_07.Example_Zoo.animal.Snake;

import java.util.ArrayList;
import java.util.Random;

public class SnakeFactory {
    public static ArrayList<Snake> createSnakes(int snakeCount) {
        Random random = new Random();
        ArrayList<Snake> snakes = new ArrayList<>();
        for (int i = 0; i < snakeCount; i++) {
            snakes.add(new Snake(random.nextInt(2000, 2024), 0, 0, random.nextInt(10)));
        }
        return snakes;
    }
}
