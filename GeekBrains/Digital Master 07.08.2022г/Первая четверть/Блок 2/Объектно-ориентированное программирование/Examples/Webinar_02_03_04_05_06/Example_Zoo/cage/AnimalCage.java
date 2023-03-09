package Webinar_02_03_04_05_06.Example_Zoo.cage;

import java.util.List;
import java.util.Collections;

import Webinar_02_03_04_05_06.Example_Zoo.animal.Animal;
import Webinar_02_03_04_05_06.Example_Zoo.animal.comparator.AnimalAgeComparator;

public interface AnimalCage<T extends Animal> {

    void addAnimal(T animal);

    void giveFood(int foodWeight);

    void cleanCage();

    void checkStatus();

    T getRandomAnimal();

    int animalsCount();

    default void sortByAge(List<T> animalList) {
        Collections.sort(animalList, new AnimalAgeComparator());
    }
}
