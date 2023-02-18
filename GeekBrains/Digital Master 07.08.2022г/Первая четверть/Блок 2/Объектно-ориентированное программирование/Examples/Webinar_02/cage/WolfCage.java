package Webinar_02.cage;

import java.util.Random;
import java.util.ArrayList;

import Webinar_02.animal.Wolf;
import Webinar_02.animal.Animal;

public class WolfCage implements AnimalCage {

    private int garbageVolume;
    private ArrayList<Wolf> wolfs;

    public WolfCage(int garbageVolume, ArrayList<Wolf> wolfs) {
        this.garbageVolume = garbageVolume;
        this.wolfs = wolfs;
    }

    public int getGarbageVolume() {
        return garbageVolume;
    }

    public void setGarbageVolume(int garbageVolume) {
        this.garbageVolume = garbageVolume;
    }

    public ArrayList<Wolf> getWolfs() {
        return wolfs;
    }

    public void setWolfs(ArrayList<Wolf> wolfs) {
        this.wolfs = wolfs;
    }

    @Override
    public void addAnimal(Animal wolf) {
        if (wolf instanceof Wolf)
            this.wolfs.add((Wolf) wolf);
    }

    @Override
    public void giveFood(int foodWeight) {
        int portion = foodWeight / this.animalsCount();
        for (Animal wolf : this.wolfs) {
            wolf.feed(portion);
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
        this.wolfs.forEach(wolf -> System.out.println(wolf.getType() + " Вес: " + wolf.getWeight()));
        System.out.println("Загрязнения: " + this.garbageVolume);
    }

    @Override
    public void getRandomAnimal() {
        Random random = new Random();
        Wolf temp = this.wolfs.remove(random.nextInt(wolfs.size()));
        System.out.println("Животное " + temp.getType() + " убрано из клетки.");
        System.out.println("Вес: " + temp.getWeight()
                + " Количество конечностей: " + temp.getLimbs()
                + " Год рождения: " + temp.getBirthYear());
    }

    @Override
    public int animalsCount() {
        return this.wolfs.size();
    }

}
