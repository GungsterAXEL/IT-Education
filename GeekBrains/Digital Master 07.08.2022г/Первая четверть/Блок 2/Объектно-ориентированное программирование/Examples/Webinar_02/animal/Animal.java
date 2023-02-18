package Webinar_02.animal;

public abstract class Animal {

    private int birthYear;
    private int weight;
    private int limbsCount;

    public Animal(int birthYear, int weight, int limbsCount) {
        this.birthYear = birthYear;
        this.weight = weight;
        this.limbsCount = limbsCount;
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

    public int getLimbs() {
        return limbsCount;
    }

    public void setLimbs(int limbs) {
        this.limbsCount = limbs;
    }

    public void feed(int foodWeight) {
        this.weight = foodWeight + this.weight > getMaxWeight() ? getMaxWeight() : foodWeight + this.weight;
    }

    public abstract String getType();

    public abstract int getMaxWeight();

}