/**
 * Задача:
 * Создать наследника реализованного класса HotDrink с дополнительным полем int температура.
 * Создать класс HotDrinkVendingMachine наследника VendingMachine и
 * реализовать перегруженный метод getProduct(String name, double volume, double temperature),
 * выдающий продукт соответствующего имени, объема и температуры.
 * Используйте при итерации конструкцию:
 * if (product instance of HotDrink){ HotDrink ht = (HotDrink) product; }
 * В main проинициализировать несколько экземпляров HotDrink, один HotDrinkVendingMachine и
 * воспроизвести логику заложенную в программе.
 * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.
 */

package Webinar_01.Homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static ArrayList<Product> productListRandomizer() {
        Random random = new Random();
        String[] titleList = { "Орешки", "Сухарики", "Сникерс", "Твикс", "Баунти", "Марс" };
        int minPrice = 100;
        int maxPrice = 150;
        int maxCapacity = 20;
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < maxCapacity; i++) {
            products.add(new Product(titleList[random.nextInt(titleList.length)], random.nextInt(minPrice, maxPrice)));
        }
        return products;
    }

    public static ArrayList<Drink> drinkListRandomizer() {
        Random random = new Random();
        String[] titleList = { "Вода", "Минералка", "Сок", "Кола", "Спрайт", "Фанта" };
        double[] volumes = { 0.3, 0.5, 0.7 };
        int minPrice = 100;
        int maxPrice = 150;
        int maxCapacity = 20;
        ArrayList<Drink> drinks = new ArrayList<>();
        for (int i = 0; i < maxCapacity; i++) {
            drinks.add(new Drink(titleList[random.nextInt(titleList.length)], random.nextInt(minPrice, maxPrice),
                    volumes[random.nextInt(volumes.length)]));
        }
        return drinks;
    }

    public static ArrayList<HotDrink> hotDrinkListRandomizer() {
        Random random = new Random();
        String[] titleList = { "Чай", "Кофе", "Какао", "Шоколад", "Молоко",
                "Глинтвейн" };
        double[] volumes = { 0.3, 0.5, 0.7 };
        double[] temperature = { 40.5, 60.7, 70.3 };
        int minPrice = 100;
        int maxPrice = 150;
        int maxCapacity = 20;
        ArrayList<HotDrink> hotDrinks = new ArrayList<>();
        for (int i = 0; i < maxCapacity; i++) {
            hotDrinks.add(new HotDrink(titleList[random.nextInt(titleList.length)],
                    random.nextInt(minPrice, maxPrice),
                    volumes[random.nextInt(volumes.length)],
                    temperature[random.nextInt(temperature.length)]));
        }
        return hotDrinks;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Product> productList = productListRandomizer();
        // ArrayList<Drink> drinkList = drinkListRandomizer();
        ArrayList<HotDrink> hotDrinkList = hotDrinkListRandomizer();

        // productList.forEach(product -> product.consume(product));
        // drinkList.forEach(drink -> drink.consume(drink));
        // hotDrinkList.forEach(hotDrink -> hotDrink.consume(hotDrink));

        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(productList, hotDrinkList);
        hotDrinkVendingMachine.powerOn();

        while (true) {
            hotDrinkVendingMachine.menu(hotDrinkList);

            System.out.println("Напишите что будем пить в формате Название Объём Температура:");
            String input = scan.nextLine().replace(",", ".");
            String[] insert = input.split(" ");
            /**
             * Долго не мог понять почему не отрабатывают методы,
             * как оказалось в массиве insert почему-то "теряется" нулевой элемент (если он написан кириллицей).
             * Как заставить видеть кириллицу я в уме не приложу.
             */
            hotDrinkVendingMachine.getProduct(insert[0], Double.parseDouble(insert[1]), Double.parseDouble(insert[2]));

            System.out.println("Будете что-то ещё?\nY = да. Что-то другое = выход.");
            if (!scan.nextLine().toUpperCase().equals("Y")) {
                break;
            }
        }

        hotDrinkVendingMachine.powerOff();
        scan.close();
    }
}
