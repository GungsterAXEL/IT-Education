package Webinar_02.iterator;

import java.util.Iterator;
import java.util.ArrayList;

import Webinar_02.animal.Lion;

public class LionIterator implements Iterator<Lion> {
    private ArrayList<Lion> lions;
    private int position;

    public LionIterator(ArrayList<Lion> lions) {
        this.lions = lions;
    }

    @Override
    public boolean hasNext() {
        return position < this.lions.size();
    }

    @Override
    public Lion next() {
        return this.lions.get(position++);
    }

}
