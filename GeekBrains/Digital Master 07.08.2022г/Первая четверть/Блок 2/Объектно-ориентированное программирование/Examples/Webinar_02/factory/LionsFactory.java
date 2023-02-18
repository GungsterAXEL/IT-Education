package Webinar_02.factory;

import java.util.ArrayList;

import Webinar_02.animal.Lion;

public class LionsFactory {

    public static ArrayList<Lion> createLions(int lionCount) {
        ArrayList<Lion> lions = new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            lions.add(new Lion(0, 0, 4, 0));
        }
        return lions;
    }
}
