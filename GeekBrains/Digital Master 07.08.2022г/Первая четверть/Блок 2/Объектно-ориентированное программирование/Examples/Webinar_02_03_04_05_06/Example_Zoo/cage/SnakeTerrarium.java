package Webinar_02_03_04_05_06.Example_Zoo.cage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import Webinar_02_03_04_05_06.Example_Zoo.animal.Snake;
import Webinar_02_03_04_05_06.Example_Zoo.animal.iterator.SnakeIterator;
import Webinar_02_03_04_05_06.Example_Zoo.animalUtils.AnimalUtils;
import Webinar_02_03_04_05_06.Example_Zoo.terminal.CreateDeleteResult;

public class SnakeTerrarium implements AnimalCage<Snake>, Iterable<Snake> {
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
        AnimalUtils.sortAnimals(this.snakes);
        this.snakes.forEach(snake -> System.out.printf("%3s %s\n", (this.snakes.indexOf(snake) + 1), snake.toString()));
        System.out.println("Загрязнения: " + this.garbageVolume);
    }

    @Override
    public Snake getRandomAnimal() {
        Random random = new Random();
        Snake temp = this.snakes.remove(random.nextInt(snakes.size()));
        CreateDeleteResult.outcome(temp);
        return temp;
    }

    @Override
    public int animalsCount() {
        return this.snakes.size();
    }

    @Override
    public Iterator<Snake> iterator() {
        return new SnakeIterator(this.snakes);
    }

}
