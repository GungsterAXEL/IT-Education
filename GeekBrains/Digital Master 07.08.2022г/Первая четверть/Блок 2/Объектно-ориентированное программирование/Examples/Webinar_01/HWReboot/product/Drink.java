package Webinar_01.HWReboot.product;

public class Drink<N extends Number> extends Product<N> {

    final static String TYPE = "Напиток";

    private N volume;

    public Drink(String name, N price, N volume) {
        super(name, price);
        this.volume = volume;
    }

    public static String getType() {
        return TYPE;
    }

    public N getVolume() {
        return volume;
    }

    public void setVolume(N volume) {
        this.volume = volume;
    }

    @Override
    public void consume() {
        System.out.printf("%s %s %s выпит.\n", getType(), getName(), getVolume());
    }

}
