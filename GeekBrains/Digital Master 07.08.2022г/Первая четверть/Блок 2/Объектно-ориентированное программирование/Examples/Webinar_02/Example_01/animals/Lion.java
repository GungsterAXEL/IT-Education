package Webinar_02.Example_01.animals;

public class Lion extends Animal {
    protected int maneVolume;

    protected static final int MAX_WEIGHT = 500;
    protected static final String TYPE = "Лев";

    public Lion(int birthYear, int weight, int limbCount, int maneVolume) {
        super(birthYear, weight, limbCount);
        this.maneVolume = maneVolume;
    }

    public int getManeVolume() {
        return this.maneVolume;
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
