package Webinar_01.HWReboot.factory;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import Webinar_01.HWReboot.product.Snack;

public class SnackFactory implements Factory<Snack> {

    private final static String TYPE = "СнекБокс";

    public static String getType() {
        return TYPE;
    }

    @Override
    public List<Snack> randomBox() {
        Random random = new Random();
        String[] titles = { "Nuts", "Biscuit", "Chips", "Crackers", "Snickers", "Mars" };
        int minPrice = 75;
        int maxPrice = 150;
        int boxCapacity = random.nextInt(20);
        List<Snack> snackBox = new ArrayList<>();
        for (int i = 0; i < boxCapacity; i++) {
            String randomTitle = titles[random.nextInt(titles.length)];
            int randomPrice = random.nextInt(minPrice, maxPrice);
            snackBox.add(new Snack<Number>(randomTitle, randomPrice));
        }
        return snackBox;
    }

}
