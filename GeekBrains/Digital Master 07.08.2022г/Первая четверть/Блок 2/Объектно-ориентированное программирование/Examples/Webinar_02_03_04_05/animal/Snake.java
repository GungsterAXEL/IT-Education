package Webinar_02_03_04_05.animal;

public class Snake extends Animal implements Comparable<Snake>{

    private int bodyLength;

    private static final int MAX_WEIGHT = 500;
    private static final String TYPE = "Змея";

    public Snake(int birthYear, int weight, int limbsCount, int bodyLength) {
        super(birthYear, weight, limbsCount);
        this.bodyLength = bodyLength;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
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
    public int compareTo(Snake o) {
        if (this.getBirthYear() > o.getBirthYear())
            return 1;
        else if (this.getBirthYear() < o.getBirthYear())
            return -1;
        return 0;
    }
}
