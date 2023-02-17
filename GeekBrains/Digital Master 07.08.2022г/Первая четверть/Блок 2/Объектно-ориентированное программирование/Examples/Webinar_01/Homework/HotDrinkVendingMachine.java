package Webinar_01.Homework;

import java.util.ArrayList;

public class HotDrinkVendingMachine extends VendingMachine {
    private ArrayList<HotDrink> hotDrinks;

    public HotDrinkVendingMachine(ArrayList<Product> goods, ArrayList<HotDrink> hotDrinks) {
        super(goods);
        this.hotDrinks = hotDrinks;
    }

    public ArrayList<HotDrink> getHotDrinks() {
        return hotDrinks;
    }

    public void setHotDrinks(ArrayList<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    public HotDrink getProduct(String name, double volume, double temperature) {
        for (HotDrink hotDrink : this.hotDrinks) {
            System.out.println(hotDrink.getName());
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume
                    && hotDrink.getTemperature() == temperature) {
                hotDrink.consume(hotDrink);
                return hotDrink;
            }
        }
        return null;
    }

    protected void printTable(String name, String volume, String temperature, String price) {
        System.out.printf("| %-10s | %-5s | %-5s | %-5s |\n", name, volume, temperature, price);
    }

    public void menu(ArrayList<HotDrink> hotDrinks) {
        if (!this.hotDrinks.isEmpty()) {
            System.out.println("\nВыберите ништячки:");
            printTable("Товар", "Объём", "C°", "Цена");
            for (Product product : this.hotDrinks) {
                if (product instanceof HotDrink) {
                    HotDrink ht = (HotDrink) product;
                    this.printTable("----------", "-----", "-----", "-----");
                    this.printTable(ht.getName(),
                            Double.toString(ht.getVolume()),
                            Double.toString(ht.getTemperature()),
                            Integer.toString(ht.getPrice()));
                }
            }
            System.out.println();
        } else
            System.out.println("Весь товар закончился! =D\nПриходите когда пополним.");
    }

}
