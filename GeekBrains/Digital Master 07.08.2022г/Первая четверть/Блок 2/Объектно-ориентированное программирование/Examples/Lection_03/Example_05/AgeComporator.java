package Lection_03.Example_05;

import java.util.Comparator;

public class AgeComporator implements Comparator<Worker>{

    @Override
    public int compare(Worker o1, Worker o2) {
        return Integer.compare(o1.age, o2.age);
    }
    
}