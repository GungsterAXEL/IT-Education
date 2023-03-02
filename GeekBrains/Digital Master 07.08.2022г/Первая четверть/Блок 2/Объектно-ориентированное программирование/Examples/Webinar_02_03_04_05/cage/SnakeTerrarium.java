package Webinar_02_03_04_05.cage;

import java.util.ArrayList;
import java.util.Random;

import Webinar_02_03_04_05.animal.Snake;

public class SnakeTerrarium implements AnimalCage<Snake> {
    private int garbageVolume;
    private ArrayList<Snake> snakes;

    public SnakeTerrarium(int garbageVolume, ArrayList<Snake> snakes) {
        this.garbageVolume = garbageVolume;
        this.snakes = snakes;
    }

    public int getGarbageVolume() {
        return garbageVolume;
    }

    public void setGarbageVolume(int garbageVolume) {
        this.garbageVolume = garbageVolume;
    }

    public ArrayList<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }

    @Override
    public void addAnimal(Snake snake) {
        this.snakes.add(snake);
    }

    @Override
    public void giveFood(int foodWeight) {
        int portion = foodWeight / this.animalsCount();
        for (Snake snake : this.snakes) {
            snake.feed(portion);
        }
        this.garbageVolume++;
    }

    @Override
    public void cleanCage() {
        this.garbageVolume = 0;
        System.out.println("Клетка очищена.\n" + "Загрязнения: " + this.garbageVolume);
    }

    @Override
    public void checkStatus() {
        this.snakes.forEach(snake -> System.out
                .println(snake.getType() + ": " + (this.snakes.indexOf(snake) + 1)
                        + " Вес: " + snake.getWeight()
                        + " Длинна: " + snake.getBodyLength()
                        + " Год рождения: " + snake.getBirthYear()));
        System.out.println("Загрязнения: " + this.garbageVolume);
    }

    @Override
    public Snake getRandomAnimal() {
        Random random = new Random();
        Snake temp = this.snakes.remove(random.nextInt(snakes.size()));
        System.out.println("Животное " + temp.getType() + " убрано из клетки.");
        System.out.println("Вес: " + temp.getWeight()
                + " Длинна: " + temp.getBodyLength()
                + " Год рождения: " + temp.getBirthYear());
        return temp;
    }

    @Override
    public int animalsCount() {
        return this.snakes.size();
    }

}
