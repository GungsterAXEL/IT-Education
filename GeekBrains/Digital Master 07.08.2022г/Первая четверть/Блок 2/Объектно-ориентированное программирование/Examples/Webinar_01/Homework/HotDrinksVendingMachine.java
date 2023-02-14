package Webinar_01.Homework;

import java.util.ArrayList;

public class HotDrinksVendingMachine extends VendingMachine {

    public HotDrinksVendingMachine(ArrayList<Product> goods) {
        super(goods);
    }

    public ArrayList<Product> getProduct(String input, ArrayList<Product> hotDrinksList) {
        for (Product product : hotDrinksList) {
            if (product.getName().equals(input)) {
                hotDrinksList.remove(product);
                product.consume();
                break;
            }
        }
        return hotDrinksList;
    }

    protected void printTable(String name, String volume, String temperature, String price) {
        System.out.printf("| %-10s | %-5s | %-11s | %-5s |\n", name, volume, temperature, price);
    }

    protected void menu(ArrayList<Product> drinks) {
        if (!drinks.isEmpty()) {
            System.out.println("\nВыберите что попить:");
            this.printTable("Товар", "Объём", "Температура", "Цена");
            for (Product product : drinks) {
                if (product instanceof HotDrink) {
                    HotDrink ht = (HotDrink) product;
                    this.printTable("----------", "-----", "-----------", "-----");
                    this.printTable(ht.getName(), Double.toString(ht.getVolume()),
                            Double.toString(ht.getTemperature()), Integer.toString(ht.getPrice()));
                }
            }
            System.out.println();
        } else
            System.out.println("Всё выпили! =D\nПриходите когда пополним.");
    }

}
