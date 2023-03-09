package Webinar_02_03_04_05_06.Example_Zoo.cage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import Webinar_02_03_04_05_06.Example_Zoo.animal.Lion;
import Webinar_02_03_04_05_06.Example_Zoo.animal.comparator.LionComparator;
import Webinar_02_03_04_05_06.Example_Zoo.animal.iterator.LionIterator;
import Webinar_02_03_04_05_06.Example_Zoo.animalUtils.AnimalUtils;
import Webinar_02_03_04_05_06.Example_Zoo.terminal.CreateDeleteResult;

public class LionCage<L extends Lion> implements AnimalCage<L>, Iterable<L> {

    private int garbageVolume;
    private ArrayList<L> lions;

    public LionCage(int garbageVolume, ArrayList<L> lions) {
        this.garbageVolume = garbageVolume;
        this.lions = lions;
    }

    public int getGarbageVolume() {
        return garbageVolume;
    }

    public void setGarbageVolume(int garbageVolume) {
        this.garbageVolume = garbageVolume;
    }

    public ArrayList<L> getLions() {
        return lions;
    }

    public void setLions(ArrayList<L> lions) {
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
        Iterator<L> lionIterator = this.lions.iterator();
        while (lionIterator.hasNext()) {
            L lion = lionIterator.next();
            if (lion.getBirthYear() == input)
                lionIterator.remove();
        }
    }

    // Удаление львов старше определённого возраста.
    public void deleteLionOlderThan(int limitAge) {
        Iterator<L> lionIterator = this.lions.iterator();
        while (lionIterator.hasNext()) {
            L lion = lionIterator.next();
            if (lion.getBirthYear() > limitAge)
                lionIterator.remove();
        }
    }

    @Override
    public void addAnimal(L lion) {
        this.lions.add(lion);
    }

    @Override
    public void giveFood(int foodWeight) {
        int portion = foodWeight / this.animalsCount();
        for (L lion : this.lions) {
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
        AnimalUtils.sortAnimals(this.lions);
        this.lions.forEach(lion -> System.out
                .printf("%3s %s\n",(this.lions.indexOf(lion) + 1), lion.toString()));
        System.out.println("Загрязнения: " + this.garbageVolume);
    }

    @Override
    public L getRandomAnimal() {
        Random random = new Random();
        L temp = this.lions.remove(random.nextInt(lions.size()));
        CreateDeleteResult.outcome(temp);
        return temp;
    }

    @Override
    public int animalsCount() {
        return this.lions.size();
    }

    @Override
    public Iterator<L> iterator() {
        return new LionIterator(this.lions);
    }

}