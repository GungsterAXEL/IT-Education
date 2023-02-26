package Webinar_02_03_04.cage;

import java.util.List;
import java.util.Collections;

import Webinar_02_03_04.animal.Animal;
import Webinar_02_03_04.animal.comparator.AnimalAgeComparator;

public interface AnimalCage<T extends Animal> {

    void addAnimal(T animal);

    void giveFood(int foodWeight);

    void cleanCage();

    void checkStatus();

    void getRandomAnimal();

    int animalsCount();

    default void sortByAge(List<T> animalList) {
        Collections.sort(animalList, new AnimalAgeComparator());
    }
}
