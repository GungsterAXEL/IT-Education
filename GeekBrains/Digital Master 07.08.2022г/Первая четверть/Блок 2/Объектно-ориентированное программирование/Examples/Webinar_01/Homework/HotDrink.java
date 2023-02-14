package Webinar_01.Homework;

public class HotDrink extends Drink {
    protected double temperature;

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

}
