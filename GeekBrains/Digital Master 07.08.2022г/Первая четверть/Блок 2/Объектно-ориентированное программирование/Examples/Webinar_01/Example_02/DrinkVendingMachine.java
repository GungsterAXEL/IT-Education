package Webinar_01.Example_02;

import java.util.ArrayList;

public class DrinkVendingMachine {
    protected ArrayList<Drink> drinks;

    public DrinkVendingMachine(ArrayList<Drink> drinks) {
        this.drinks = drinks;
    }

    public Drink getProductByName(String name) {
        for (Drink product : this.drinks) {
            if (product.getName().equals(name)) {
                Drink temp = product;
                this.drinks.remove(product);
                return temp;
            }
        }
        return null;
    }

    public ArrayList<Drink> getGoods() {
        return this.drinks;
    }

    // public void setGoods(ArrayList<Product> goods) {
    // this.goods = goods;
    // }

    protected void startOS() {
        System.out.println("System loading...");
    }

    protected void printTable(String left, String center, String right) {
        System.out.printf("| %-10s | %-5s | %-5s |\n", left, center, right);
    }

    public void menu() {
        if (!this.drinks.isEmpty()) {
            System.out.println("\nВыберите ништячки:");
            printTable("Товар", "Объём","Цена");
            for (Drink product : this.drinks) {
                printTable("----------", "-----","-----");
                printTable(product.getName(), Double.toString(product.getVolume()),Integer.toString(product.getPrice()));
            }
            System.out.println();
        } else
            System.out.println("Всё выпили! =D\nПриходите когда пополним.");
    }

    public void powerOn() {
        System.out.println("PowerIsOn.");
        this.startOS();
    }

    public void powerOff() {
        System.out.println("Sya!");
    }
}
