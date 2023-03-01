package Webinar_02_03_04_05;

import java.util.Scanner;

import Webinar_02_03_04_05.animal.Wolf;
import Webinar_02_03_04_05.cage.WolfCage;
import Webinar_02_03_04_05.factory.WolfFactory;
import Webinar_02_03_04_05.animalUtils.*;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /**
         * Волки.
         */
        ArrayList<Wolf> wolfs = WolfFactory.createWolfs(20);
        AnimalUtils.sortAnimals(wolfs);
        WolfCage wolfCage = new WolfCage(0, wolfs);

        wolfCage.checkStatus();

        // System.out.println("-----------------------");
        // wolfCage.sortWolfsByWeightAndBirthYear();
        // wolfCage.checkStatus();

        // System.out.println("-----------------------");
        // System.out.println("Введите младше какого года рождения волков оставим в
        // клетке:");
        // wolfCage.deleteWolfOlderThan(Integer.parseInt(scan.nextLine()));
        // wolfCage.checkStatus();

        // System.out.println("-----------------------");
        // wolfCage.sortWolfs();
        // wolfCage.checkStatus();

        /**
         * ЛЬВЫ.
         */
        // ArrayList<Lion> lions = LionsFactory.createLions(20);
        // LionCage lionCage = new LionCage(0, lions);
        // lionCage.checkStatus();
        // System.out.println("-----------------------");

        /**
         * Кормление львов и чистка клетки.
         */
        // lionCage.giveFood(200);
        // lionCage.checkStatus();
        // if (lionCage.getGarbageVolume() > 0) {
        // lionCage.cleanCage();
        // }
        // lionCage.getRandomAnimal();

        /**
         * Сортировка львов через Comparable<E> по году рождения.
         */
        // lionCage.sortLions();
        // lionCage.checkStatus();
        // Collections.reverse(lions);
        // lionCage.checkStatus();

        /**
         * Сортировка львов через Comparator<E> по объёму гривы.
         */
        // lionCage.sortLionsByMane();
        // lionCage.checkStatus();
        // Collections.reverse(lions);
        // lionCage.checkStatus();

        /**
         * Iterator<E>
         */
        // System.out.println("Введите год рождения льва для последующего удаления льва
        // из клетки:");
        // lionCage.removeByBirthYear(Integer.parseInt(scan.nextLine()));
        // lionCage.checkStatus();

        /**
         * Iterable<E>
         */
        // System.out.println("Введите младше какого года рождения львов оставим в
        // клетке:");
        // lionCage.deleteLionOlderThan(Integer.parseInt(scan.nextLine()));
        // lionCage.checkStatus();

        scan.close();
    }
}