package Webinar_02_03_04.cage;

import java.util.List;
import java.util.Random;

import Webinar_02_03_04.animal.Snake;

public class SnakeTerrarium implements AnimalCage<Snake> {
    private int garbageVolume;
    private List<Snake> snakes;

    public SnakeTerrarium(int garbageVolume, List<Snake> snakes) {
        this.garbageVolume = garbageVolume;
        this.snakes = snakes;
    }

    public int getGarbageVolume() {
        return garbageVolume;
    }

    public void setGarbageVolume(int garbageVolume) {
        this.garbageVolume = garbageVolume;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<Snake> snakes) {
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
    public void getRandomAnimal() {
        Random random = new Random();
        Snake temp = this.snakes.remove(random.nextInt(snakes.size()));
        System.out.println("Животное " + temp.getType() + " убрано из клетки.");
        System.out.println("Вес: " + temp.getWeight()
                + " Длинна: " + temp.getBodyLength()
                + " Год рождения: " + temp.getBirthYear());
    }

    @Override
    public int animalsCount() {
        return this.snakes.size();
    }

}
