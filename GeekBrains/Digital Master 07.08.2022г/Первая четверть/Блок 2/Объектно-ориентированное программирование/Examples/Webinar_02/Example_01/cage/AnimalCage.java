package Webinar_02.Example_01.cage;

import Webinar_02.Example_01.animals.Animal;

public interface AnimalCage {
    int addAnimal(Animal animal);

    int getFeed(int foodWeight);

    int cleanStatus(int garbageCount);
}
