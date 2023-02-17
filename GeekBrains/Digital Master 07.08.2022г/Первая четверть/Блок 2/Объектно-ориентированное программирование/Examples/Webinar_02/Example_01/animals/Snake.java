package Webinar_02.Example_01.animals;

public class Snake extends Animal {
    protected int bodyLenght;

    static final int MAX_WEIGHT = 5;
    static final String TYPE = "Змея";

    public Snake(int birthYear, int weight, int limbCount, int bodyLenght) {
        super(birthYear, weight, limbCount);
        this.bodyLenght = bodyLenght;
    }

    public int getBodyLenght() {
        return bodyLenght;
    }

    public void setBodyLenght(int bodyLenght) {
        this.bodyLenght = bodyLenght;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

}
