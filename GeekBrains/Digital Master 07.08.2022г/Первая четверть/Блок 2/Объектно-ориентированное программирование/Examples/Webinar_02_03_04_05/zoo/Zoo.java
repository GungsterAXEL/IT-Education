package Webinar_02_03_04_05.zoo;

import Webinar_02_03_04_05.animal.Wolf;
import Webinar_02_03_04_05.animal.Lion;
import Webinar_02_03_04_05.animal.Snake;
import Webinar_02_03_04_05.cage.AnimalCage;

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

    public Lion deleteLion() {
        return this.getLionCage().getRandomAnimal();
    }

    public void createLion(Lion lion) {
        this.getLionCage().addAnimal(lion);
    }

}
