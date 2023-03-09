package Webinar_02_03_04_05_06.Example_Zoo.zoo;

import Webinar_02_03_04_05_06.Example_Zoo.animal.Wolf;
import Webinar_02_03_04_05_06.Example_Zoo.animal.Lion;
import Webinar_02_03_04_05_06.Example_Zoo.animal.Snake;
import Webinar_02_03_04_05_06.Example_Zoo.cage.AnimalCage;

import java.util.Iterator;


public class Zoo {

    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snakeTerrarium;

    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeTerrarium) {
        this.setWolfCage(wolfCage);
        this.setLionCage(lionCage);
        this.setSnakeTerrarium(snakeTerrarium);
    }

    public AnimalCage<Wolf> getWolfCage() {
        return wolfCage;
    }

    public void setWolfCage(AnimalCage<Wolf> wolfCage) {
        this.wolfCage = wolfCage;
    }

    public AnimalCage<Lion> getLionCage() {
        return lionCage;
    }

    public void setLionCage(AnimalCage<Lion> lionCage) {
        this.lionCage = lionCage;
    }

    public AnimalCage<Snake> getSnakeTerrarium() {
        return snakeTerrarium;
    }

    public void setSnakeTerrarium(AnimalCage<Snake> snakeTerrarium) {
        this.snakeTerrarium = snakeTerrarium;
    }

    /*
     * Добавление-удаление животных в клетку.
     */
    public Lion deleteLion() {
        return this.getLionCage().getRandomAnimal();
    }

    public void createLion(Lion lion) {
        this.getLionCage().addAnimal(lion);
    }

    public Wolf deleteWolf() {
        return this.getWolfCage().getRandomAnimal();
    }

    public void createWolf(Wolf wolf) {
        this.getWolfCage().addAnimal(wolf);
    }

    public Snake deleteSnake() {
        return this.getSnakeTerrarium().getRandomAnimal();
    }

    public void createSnake(Snake snake) {
        this.getSnakeTerrarium().addAnimal(snake);
    }

    /*
     * Проверка информации о зоопарке.
     */
    public void checkStatus() {
        this.lionCage.checkStatus();
        System.out.println("---------------");
        this.wolfCage.checkStatus();
        System.out.println("---------------");
        this.snakeTerrarium.checkStatus();
        System.out.println("---------------");
    }

}
