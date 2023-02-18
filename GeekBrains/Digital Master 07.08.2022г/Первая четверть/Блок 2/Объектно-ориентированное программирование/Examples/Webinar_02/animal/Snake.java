package Webinar_02.animal;

public class Snake extends Animal {

    private int bodyLength;

    private static final int MAX_WEIGHT = 500;
    private static final String TYPE = "Змея";

    public Snake(int birthYear, int weight, int limbs, int bodyLength) {
        super(birthYear, weight, limbs);
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
}
