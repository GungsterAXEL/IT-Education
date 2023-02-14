package Webinar_01.Homework;

public class Drink extends Product {
    protected double volume;

    Drink(String name, int price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

}
