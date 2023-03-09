package Webinar_02_03_04_05_06.Example_Zoo.animal.iterator;

import java.util.Iterator;

import Webinar_02_03_04_05_06.Example_Zoo.animal.Lion;

import java.util.ArrayList;

public class LionIterator<L extends Lion> implements Iterator<L> {
    private ArrayList<L> lions;
    private int position;

    public LionIterator(ArrayList<L> lions) {
        this.lions = lions;
    }

    @Override
    public boolean hasNext() {
        return position < this.lions.size();
    }

    @Override
    public L next() {
        return this.lions.get(position++);
    }

}
