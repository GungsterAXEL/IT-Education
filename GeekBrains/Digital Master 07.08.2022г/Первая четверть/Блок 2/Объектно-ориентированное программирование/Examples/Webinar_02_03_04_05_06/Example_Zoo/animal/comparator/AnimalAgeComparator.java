package Webinar_02_03_04_05_06.Example_Zoo.animal.comparator;

import java.util.Comparator;

import Webinar_02_03_04_05_06.Example_Zoo.animal.Animal;

public class AnimalAgeComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getBirthYear() > o2.getBirthYear())
            return 1;
        else if (o1.getBirthYear() < o2.getBirthYear())
            return -1;
        return 0;
    }

}
