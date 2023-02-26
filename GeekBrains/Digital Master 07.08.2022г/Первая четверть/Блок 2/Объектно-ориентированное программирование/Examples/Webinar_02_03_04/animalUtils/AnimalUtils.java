package Webinar_02_03_04.animalUtils;

import java.util.List;
import java.util.Collections;

import Webinar_02_03_04.animal.Animal;
import Webinar_02_03_04.animal.comparator.AnimalAgeComparator;

public class AnimalUtils {

    public static <T extends Animal> void sortAnimals(List<T> animalList) {
        Collections.sort(animalList, new AnimalAgeComparator());
    }

}
