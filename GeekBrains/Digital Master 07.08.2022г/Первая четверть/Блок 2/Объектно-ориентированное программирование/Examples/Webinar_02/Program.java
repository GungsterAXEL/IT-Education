package Webinar_02;

import java.util.ArrayList;

import Webinar_02.animal.Lion;
import Webinar_02.cage.LionCage;
import Webinar_02.factory.LionsFactory;

public class Program {
    public static void main(String[] args) {
        ArrayList<Lion> lions = LionsFactory.createLions(20);
        LionCage lionCage = new LionCage(0, lions);
        lionCage.checkStatus();
        lionCage.giveFood(200);
        System.out.println("-----------------------");
        lionCage.checkStatus();
        if (lionCage.getGarbageVolume() > 0) {
            lionCage.cleanCage();
        }
        lionCage.getRandomAnimal();
    }
}
