package Webinar_02.cage;

import Webinar_02.animal.Animal;

public interface AnimalCage {

    void addAnimal(Animal animal);

    void giveFood(int foodWeight);

    void cleanCage();

    void checkStatus();

    void getRandomAnimal();

    int animalsCount();
}
