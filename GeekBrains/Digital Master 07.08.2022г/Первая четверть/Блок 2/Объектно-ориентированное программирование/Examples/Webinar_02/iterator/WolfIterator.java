package Webinar_02.iterator;

import java.util.Iterator;
import java.util.ArrayList;

import Webinar_02.animal.Wolf;

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
