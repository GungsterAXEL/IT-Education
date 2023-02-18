package Webinar_02.animal;

public class Lion extends Animal {

    private int maneVolume;

    private static final int MAX_WEIGHT = 500;
    private static final String TYPE = "Лев";

    public Lion(int birthYear, int weight, int limbsCount, int maneVolume) {
        super(birthYear, weight, limbsCount);
        this.maneVolume = maneVolume;
    }

    public int getManeVolume() {
        return maneVolume;
    }

    public void setManeVolume(int maneVolume) {
        this.maneVolume = maneVolume;
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
