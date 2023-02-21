package Webinar_02.cage;

import java.util.Random;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

import Webinar_02.animal.Wolf;
import Webinar_02.animal.Animal;
import Webinar_02.iterator.WolfIterator;
import Webinar_02.comparator.WolfComparator;

public class WolfCage implements AnimalCage, Iterable<Wolf> {

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

    public void sortWolfs() {
        Collections.sort(this.wolfs);
    }

    public void sortWolfsByWeightAndBirthYear() {
        Collections.sort(this.wolfs, new WolfComparator());
    }

    public void removeByBirthYear(int input) {
        Iterator<Wolf> wolfIterator = this.wolfs.iterator();
        while (wolfIterator.hasNext()) {
            Wolf wolf = wolfIterator.next();
            if (wolf.getBirthYear() == input)
                wolfIterator.remove();
        }
    }

    public void deleteWolfOlderThan(int limitAge) {
        Iterator<Wolf> wolfIterator = this.wolfs.iterator();
        while (wolfIterator.hasNext()) {
            Wolf wolf = wolfIterator.next();
            if (wolf.getBirthYear() > limitAge)
                wolfIterator.remove();
        }
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
        this.wolfs.forEach(wolf -> System.out.println(wolf.getType() + ": " + (this.wolfs.indexOf(wolf) + 1)
                + " Вес: " + wolf.getWeight()
                + " Год рождения: " + wolf.getBirthYear()));
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

    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(this.wolfs);
    }

}
