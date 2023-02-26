package Webinar_01.HWReboot.product;

public class Snack<N extends Number> extends Product<N> {

    final static String TYPE = "Закуска";

    public Snack(String name, N price) {
        super(name, price);
    }

    public static String getType() {
        return TYPE;
    }

    @Override
    public void consume() {
        System.out.printf("%s %s потреблён.\n", getType(), getName());
    }

}
