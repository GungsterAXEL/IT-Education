package Webinar_02_03_04.zoo;

import Webinar_02_03_04.animal.Wolf;
import Webinar_02_03_04.animal.Lion;
import Webinar_02_03_04.animal.Snake;
import Webinar_02_03_04.cage.AnimalCage;

public class Zoo {

    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snakeTerrarium;

    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeTerrarium) {
        this.wolfCage = wolfCage;
        this.lionCage = lionCage;
        this.snakeTerrarium = snakeTerrarium;
    }

}
