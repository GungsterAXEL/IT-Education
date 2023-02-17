package Webinar_01.Homework;

public class HotDrink extends Drink {
    private double temperature;

    public HotDrink(String name, int price, double volume, double temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void consume(HotDrink hotDrink) {
        System.out.printf("Пусть %s не остынет.\n", hotDrink.getName());
    }
}
