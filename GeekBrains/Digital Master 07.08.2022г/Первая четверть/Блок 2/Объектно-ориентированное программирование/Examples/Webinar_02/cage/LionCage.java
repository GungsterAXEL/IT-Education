package Webinar_02.cage;

import java.util.ArrayList;
import java.util.Random;

import Webinar_02.animal.Animal;
import Webinar_02.animal.Lion;

public class LionCage implements AnimalCage {
    private int garbageVolume;
    private ArrayList<Lion> lions;

    public LionCage(int garbageVolume, ArrayList<Lion> lions) {
        this.garbageVolume = garbageVolume;
        this.lions = lions;
    }

    public int getGarbageVolume() {
        return garbageVolume;
    }

    public void setGarbageVolume(int garbageVolume) {
        this.garbageVolume = garbageVolume;
    }

    public ArrayList<Lion> getLions() {
        return lions;
    }

    public void setLions(ArrayList<Lion> lions) {
        this.lions = lions;
    }

    @Override
    public void addAnimal(Animal lion) {
        if (lion instanceof Lion)
            this.lions.add((Lion) lion);
    }

    @Override
    public void giveFood(int foodWeight) {
        int portion = foodWeight / this.animalsCount();
        for (Animal lion : this.lions) {
            lion.feed(portion);
        }
        this.garbageVolume++;
    }

    @Override
    public void cleanCage() {
        this.garbageVolume = 0;
        System.out.println("Клетка очищена.\n" + "Загрязнения: " + this.garbageVolume);
    }

    @Override
    public void checkStatus() {
        this.lions.forEach(lion -> System.out
                .println(lion.getType() + " Вес: " + lion.getWeight() + " Грива: " + lion.getManeVolume()));
        System.out.println("Загрязнения: " + this.garbageVolume);
    }

    @Override
    public void getRandomAnimal() {
        Random random = new Random();
        Lion temp = this.lions.remove(random.nextInt(lions.size()));
        System.out.println("Животное " + temp.getType() + " убрано из клетки.");
        System.out.println("Вес: " + temp.getWeight()
                + " Количество конечностей: " + temp.getLimbs()
                + " Год рождения: " + temp.getBirthYear());
    }

    @Override
    public int animalsCount() {
        return this.lions.size();
    }

}