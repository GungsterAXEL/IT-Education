/**
 * Задача.
 * 
 * Создать наследника реализованного класса HotDrink с дополнительным полем int температура.
 * 
 * Создать класс HotDrinkVendingMachine наследника VendingMachine и реализовать перегруженный
 * метод getProduct(String name, double volume, double temperature),
 * выдающий продукт соответствующего имени, объема и температуры.
 * 
 * Используйте при итерации конструкцию:
 * if (product instanceof HotDrink){ HotDrink ht = (HotDrink) product; }
 * 
 * В main проинициализировать несколько экземпляров HotDrink, один HotDrinkVendingMachine и
 * воспроизвести логику заложенную в программе.
 * 
 * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
package Webinar_01.Homework;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Program {
    public static ArrayList<Product> HotDrinksListRandomizer() {
        Random random = new Random();
        int maxCapacity = 30;
        String[] names = { "Чай", "Кофе", "Какао", "Глинтвейн", "Бульон" };
        double[] volumes = { 0.3, 0.4, 0.5 };
        int lowerPrice = 100, higherPrice = 200;
        int[] temperature = { 40, 50, 60, 70, 80 };
        ArrayList<Product> hotDrinksList = new ArrayList<>();
        for (int i = 0; i < random.nextInt(maxCapacity); i++) {
            Product hotDrink = new HotDrink(names[random.nextInt(names.length)],
                    random.nextInt(lowerPrice, higherPrice),
                    volumes[random.nextInt(volumes.length)],
                    temperature[random.nextInt(temperature.length)]);
            hotDrinksList.add(hotDrink);
        }
        return hotDrinksList;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Product> hotDrinksList = HotDrinksListRandomizer();
        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine(hotDrinksList);
        hotDrinksVendingMachine.powerOn();
        while (true) {
            hotDrinksVendingMachine.menu(hotDrinksList);
            hotDrinksList = hotDrinksVendingMachine.getProduct(scan.nextLine(), hotDrinksList);

            System.out.println("Будете что-то ещё?\nY = да. Что-то другое = выход.");
            if (!scan.nextLine().toUpperCase().equals("Y")) {
                break;
            }
        }
        hotDrinksVendingMachine.powerOff();
        scan.close();
    }
}
