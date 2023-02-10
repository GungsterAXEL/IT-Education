package Webinar_06.Homework;

import java.util.LinkedList;
import java.util.Random;

public class NotebookListRandomizer {
    public static LinkedList<Notebook> NotebookListRandomizer() {
        Random random = new Random();

        String[] name = { "ASUS", "ACER", "Sony", "Samsung", "Honor", "HP", "VAIO", "Xiaomi" };
        Double[] screenSize = { 10.3, 12.9, 13.7, 15.6, 17.1 };
        String[] graphics = { "VooDoo", "NVidia", "AMD", "Intel" };
        Integer[] gpu = { 2, 4, 6, 8 };
        Integer[] hdd = { 128, 256, 512, 1024, 2048 };
        Integer[] ram = { 3, 4, 6, 12, 16 };

        LinkedList<Notebook> notebookSet = new LinkedList<>();// new LinkedHashSet<>();

        for (int i = 0; i < random.nextInt(5, 20); i++) {
            String randomName = name[random.nextInt(name.length)];
            Double randomScreenSize = screenSize[random.nextInt(screenSize.length)];
            String randomGraphics = graphics[random.nextInt(graphics.length)];
            Integer randomGPU = gpu[random.nextInt(gpu.length)];
            Integer randomHDD = hdd[random.nextInt(hdd.length)];
            Integer randomRAM = ram[random.nextInt(ram.length)];
            Integer randomPrice = random.nextInt(1000, 10000);
            notebookSet.add(new Notebook(randomName, randomScreenSize, randomGraphics, randomGPU, randomHDD, randomRAM,
                    randomPrice));
        }
        return notebookSet;
    }
}
