package Webinar_02_03_04_05_06_07.Example_Zoo.cage;

import java.util.Random;

import Webinar_02_03_04_05_06_07.Example_Zoo.animal.Wolf;
import Webinar_02_03_04_05_06_07.Example_Zoo.animal.comparator.WolfComparator;
import Webinar_02_03_04_05_06_07.Example_Zoo.animal.iterator.WolfIterator;
import Webinar_02_03_04_05_06_07.Example_Zoo.animalUtils.AnimalUtils;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.CreateDeleteResult;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

public class WolfCage implements AnimalCage<Wolf>, Iterable<Wolf> {

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
    public void addAnimal(Wolf wolf) {
        this.wolfs.add(wolf);
    }

    @Override
    public void giveFood(int foodWeight) {
        int portion = foodWeight / this.animalsCount();
        for (Wolf wolf : this.wolfs) {
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
        AnimalUtils.sortAnimals(this.wolfs);
        this.wolfs.forEach(wolf -> System.out.printf("%3s %s\n", (this.wolfs.indexOf(wolf) + 1), wolf.toString()));
        System.out.println("Загрязнения: " + this.garbageVolume);
    }

    @Override
    public Wolf getRandomAnimal() {
        Random random = new Random();
        Wolf temp = this.wolfs.remove(random.nextInt(wolfs.size()));
        CreateDeleteResult.outcome(temp);
        return temp;
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
