package Webinar_02.Example_01.cage;

import java.util.ArrayList;

import Webinar_02.Example_01.animals.Animal;
import Webinar_02.Example_01.animals.Lion;

public class LionCage implements AnimalCage {
    protected int garbage;
    protected ArrayList lions;

    public LionCage(ArrayList lions) {
        this.lions = lions;
    }

    @Override
    public int getFeed(int foodWeight) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int cleanStatus(int garbage) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int addAnimal(Animal animal) {
        if (animal.getType().equals("Лев"))
            lions.add((Lion) animal);
        return lions.size();
    }

}
