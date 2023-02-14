package Webinar_01.Example_02;

public class Drink extends Product {
    protected double volume;

    public Drink(String name, int price, double volume) {
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
