package Webinar_02.animal;

public class Wolf extends Animal implements Comparable<Wolf> {
    private static final int MAX_WEIGHT = 100;
    private static final String TYPE = "Волк";

    public Wolf(int birthYear, int weight, int limbsCount) {
        super(birthYear, weight, limbsCount);
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public int compareTo(Wolf o) {
        if (this.getBirthYear() > o.getBirthYear())
            return 1;
        else if (this.getBirthYear() < o.getBirthYear())
            return -1;
        return 0;
    }
}
