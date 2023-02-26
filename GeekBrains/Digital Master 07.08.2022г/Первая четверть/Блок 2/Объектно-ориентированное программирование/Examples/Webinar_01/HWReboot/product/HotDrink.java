package Webinar_01.HWReboot.product;

public class HotDrink<N extends Number> extends Drink<N> {

    final static String TYPE = "Горячий напиток";

    private N temperature;

    public HotDrink(String name, N price, N volume, N temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public static String getType() {
        return TYPE;
    }

    public N getTemperature() {
        return temperature;
    }

    public void setTemperature(N temperature) {
        this.temperature = temperature;
    }

    @Override
    public void consume() {
        System.out.printf("%s %s %sмл %s°C выпит.\n", getType(), getName(), getVolume(), getTemperature());
    }

}
