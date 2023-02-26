package Webinar_02_03_04.animal.iterator;

import java.util.Iterator;

import Webinar_02_03_04.animal.Lion;

import java.util.ArrayList;

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
