package Webinar_02.Example_01.animals;

public abstract class Animal {
    protected int birthYear;
    protected int weight;
    protected int limbCount;

    public Animal(int birthYear, int weight, int limbCount) {
        this.birthYear = birthYear;
        this.weight = weight;
        this.limbCount = limbCount;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLimbCount() {
        return limbCount;
    }

    public void setLimbCount(int limbCount) {
        this.limbCount = limbCount;
    }

    public abstract String getType();

    public abstract int getMaxWeight();

    public void feed(int foodWeight) {
        this.weight = this.weight + foodWeight;
        if (this.weight > getMaxWeight())
            this.weight = getMaxWeight();
    }

}
