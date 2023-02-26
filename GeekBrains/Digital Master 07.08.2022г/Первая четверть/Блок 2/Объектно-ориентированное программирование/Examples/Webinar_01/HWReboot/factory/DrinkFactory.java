package Webinar_01.HWReboot.factory;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import Webinar_01.HWReboot.product.Drink;

public class DrinkFactory implements Factory<Drink> {
    
    private final static String TYPE = "ДринкБокс";

    public static String getType() {
        return TYPE;
    }

    @Override
    public List<Drink> randomBox() {
        Random random = new Random();
        String[] titles = { "Water", "Soda", "Juice", "Lemonade", "Morse", "Compote" };
        double[] volume = { 0.3, 0.5, 0.7, 0.9 };
        int minPrice = 75;
        int maxPrice = 150;
        int boxCapacity = random.nextInt(20);
        List<Drink> snackBox = new ArrayList<>();
        for (int i = 0; i < boxCapacity; i++) {
            String randomTitle = titles[random.nextInt(titles.length)];
            double randomVolume = volume[random.nextInt(volume.length)];
            int randomPrice = random.nextInt(minPrice, maxPrice);
            snackBox.add(new Drink<Number>(randomTitle, randomPrice, randomVolume));
        }
        return snackBox;
    }

}
