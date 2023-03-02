package Webinar_02_03_04_05.cage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import Webinar_02_03_04_05.animal.Lion;
import Webinar_02_03_04_05.animal.comparator.LionComparator;
import Webinar_02_03_04_05.animal.iterator.LionIterator;

public class LionCage implements AnimalCage<Lion>, Iterable<Lion> {

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

    // Реализация сортировки через Comparable<E>.
    public void sortLions() {
        Collections.sort(this.lions);
    }

    // Реализация сортировки через Comparator<E>.
    public void sortLionsByMane() {
        Collections.sort(this.lions, new LionComparator());
    }

    // Удаление с помощью итератора.
    public void removeByBirthYear(int input) {
        Iterator<Lion> lionIterator = this.lions.iterator();
        while (lionIterator.hasNext()) {
            Lion lion = lionIterator.next();
            if (lion.getBirthYear() == input)
                lionIterator.remove();
        }
    }

    // Удаление львов старше определённого возраста.
    public void deleteLionOlderThan(int limitAge) {
        Iterator<Lion> lionIterator = this.lions.iterator();
        while (lionIterator.hasNext()) {
            Lion lion = lionIterator.next();
            if (lion.getBirthYear() > limitAge)
                lionIterator.remove();
        }
    }

    @Override
    public void addAnimal(Lion lion) {
        this.lions.add(lion);
    }

    @Override
    public void giveFood(int foodWeight) {
        int portion = foodWeight / this.animalsCount();
        for (Lion lion : this.lions) {
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
                .println(lion.getType() + ": " + (this.lions.indexOf(lion) + 1)
                        + " Вес: " + lion.getWeight()
                        + " Грива: " + lion.getManeVolume()
                        + " Год рождения: " + lion.getBirthYear()));
        System.out.println("Загрязнения: " + this.garbageVolume);
    }

    @Override
    public Lion getRandomAnimal() {
        Random random = new Random();
        Lion temp = this.lions.remove(random.nextInt(lions.size()));
        System.out.println("Животное " + temp.getType() + " убрано из клетки.");
        System.out.println("Вес: " + temp.getWeight()
                + " Количество конечностей: " + temp.getLimbsCount()
                + " Год рождения: " + temp.getBirthYear());
        return temp;
    }

    @Override
    public int animalsCount() {
        return this.lions.size();
    }

    @Override
    public Iterator<Lion> iterator() {
        return new LionIterator(this.lions);
    }

}