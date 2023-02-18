package Webinar_02.animal;

public class Wolf extends Animal {
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
}
