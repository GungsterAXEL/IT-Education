package Webinar_02_03_04_05_06.Example_Zoo.animal.comparator;

import java.util.Comparator;

import Webinar_02_03_04_05_06.Example_Zoo.animal.Lion;

public class LionComparator implements Comparator<Lion> {

    @Override
    public int compare(Lion o1, Lion o2) {
        if (o1.getManeVolume() > o2.getManeVolume())
            return 1;
        else if (o1.getManeVolume() < o2.getManeVolume())
            return -1;
        return 0;
    }

}
