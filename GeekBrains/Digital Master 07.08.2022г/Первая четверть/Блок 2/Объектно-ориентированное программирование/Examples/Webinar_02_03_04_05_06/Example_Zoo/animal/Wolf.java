package Webinar_02_03_04_05_06.Example_Zoo.animal;

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

    @Override
    public String toString() {
        return String.format("%s: Вес: %3s Год рождения: %4s",
                this.getType(), this.getWeight(), this.getBirthYear());
//                this.getType() + ": "
//                + " Вес: " + this.getWeight()
//                + " Год рождения: " + this.getBirthYear();
    }
}
