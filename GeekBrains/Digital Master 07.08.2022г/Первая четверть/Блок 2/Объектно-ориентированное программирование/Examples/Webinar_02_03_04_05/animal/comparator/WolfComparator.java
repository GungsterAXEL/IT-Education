package Webinar_02_03_04_05.animal.comparator;

import java.util.Comparator;

import Webinar_02_03_04_05.animal.Wolf;

public class WolfComparator implements Comparator<Wolf> {

    private int compareByBirthYear(Wolf o1, Wolf o2) {
        if (o1.getBirthYear() > o2.getBirthYear())
            return 1;
        else if (o1.getBirthYear() < o2.getBirthYear())
            return -1;

        return 0;
    }

    @Override
    public int compare(Wolf o1, Wolf o2) {
        if (o1.getWeight() > o2.getWeight()) {
            return 1;
        } else if (o1.getWeight() < o2.getWeight()) {
            return -1;
        }
        return  compareByBirthYear(o1, o2);
    }

}
