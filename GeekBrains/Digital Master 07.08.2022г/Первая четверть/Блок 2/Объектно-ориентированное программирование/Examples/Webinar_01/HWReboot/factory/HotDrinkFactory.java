package Webinar_01.HWReboot.factory;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import Webinar_01.HWReboot.product.HotDrink;

public class HotDrinkFactory implements Factory<HotDrink> {

    private final static String TYPE = "ХотДринкБокс";

    public static String getType() {
        return TYPE;
    }

    @Override
    public List<HotDrink> randomBox() {
        Random random = new Random();
        String[] titles = { "Чай", "Кофе", "Молоко", "Какао", "Шоколад", "Бульон" };
        double[] volume = { 0.3, 0.5, 0.7, 0.9 };
        double[] temperature = { 43.5, 55.1, 62.3, 71.9, 80.0 };
        int minPrice = 75;
        int maxPrice = 150;
        int boxCapacity = random.nextInt(20);
        List<HotDrink> snackBox = new ArrayList<>();
        for (int i = 0; i < boxCapacity; i++) {
            String randomTitle = titles[random.nextInt(titles.length)];
            double randomVolume = volume[random.nextInt(volume.length)];
            double randomTemperature = temperature[random.nextInt(temperature.length)];
            int randomPrice = random.nextInt(minPrice, maxPrice);
            snackBox.add(new HotDrink<Number>(randomTitle, randomPrice, randomVolume, randomTemperature));
        }
        return snackBox;
    }
}
