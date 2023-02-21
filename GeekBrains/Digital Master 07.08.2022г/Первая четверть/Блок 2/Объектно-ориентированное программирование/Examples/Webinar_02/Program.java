package Webinar_02;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

import Webinar_02.animal.Lion;
import Webinar_02.animal.Wolf;
import Webinar_02.cage.LionCage;
import Webinar_02.cage.WolfCage;
import Webinar_02.factory.LionsFactory;
import Webinar_02.factory.WolfFactory;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Wolf> wolfs = WolfFactory.createWolfs(20);
        WolfCage wolfCage = new WolfCage(0, wolfs);

        wolfCage.checkStatus();
        System.out.println("-----------------------");
        wolfCage.sortWolfsByWeightAndBirthYear();
        wolfCage.checkStatus();

        System.out.println("-----------------------");
        System.out.println("Введите младше какого года рождения волков оставим в клетке:");
        wolfCage.deleteWolfOlderThan(Integer.parseInt(scan.nextLine()));
        wolfCage.checkStatus();

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