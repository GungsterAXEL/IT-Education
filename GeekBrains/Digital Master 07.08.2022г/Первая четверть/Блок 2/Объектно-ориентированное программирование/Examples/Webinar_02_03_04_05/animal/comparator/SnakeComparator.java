package Webinar_02_03_04_05.animal.comparator;

import Webinar_02_03_04_05.animal.Snake;

import java.util.Comparator;

public class SnakeComparator implements Comparator<Snake> {

    @Override
    public int compare(Snake o1, Snake o2) {
        if (o1.getBodyLength() > o2.getBodyLength())
            return 1;
        else if (o1.getBodyLength() < o2.getBodyLength())
            return -1;
        return 0;
    }
}
