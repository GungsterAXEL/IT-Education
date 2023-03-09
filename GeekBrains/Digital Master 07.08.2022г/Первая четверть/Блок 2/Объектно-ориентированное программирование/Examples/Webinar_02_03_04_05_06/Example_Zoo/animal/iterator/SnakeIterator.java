package Webinar_02_03_04_05_06.Example_Zoo.animal.iterator;

import Webinar_02_03_04_05_06.Example_Zoo.animal.Snake;

import java.util.ArrayList;
import java.util.Iterator;

public class SnakeIterator implements Iterator<Snake> {
    private ArrayList<Snake> snakes;
    private int position;

    public SnakeIterator(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }

    @Override
    public boolean hasNext() {
        return position < this.snakes.size();
    }

    @Override
    public Snake next() {
        return this.snakes.get(position++);
    }

}
