package Webinar_02_03_04_05_06_07.Example_Zoo.animal.iterator;

import java.util.Iterator;

import Webinar_02_03_04_05_06_07.Example_Zoo.animal.Wolf;

import java.util.ArrayList;

public class WolfIterator implements Iterator<Wolf>{
    private ArrayList<Wolf> wolfs;
    private int position;

    public WolfIterator(ArrayList<Wolf> wolfs) {
        this.wolfs = wolfs;
    }

    @Override
    public boolean hasNext() {
        return position < this.wolfs.size();
    }

    @Override
    public Wolf next() {
        return this.wolfs.get(position++);
    }

}
