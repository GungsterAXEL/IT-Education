package Webinar_01.Homework;

public class Drink extends Product {
    private double volume;

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

    
    public void consume(Drink drink) {
        System.out.printf("Напиток %s выпит.\n", drink.getName());
    }

}
