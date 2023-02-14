package Webinar_01.Homework;

import java.util.ArrayList;

public class VendingMachine {
    protected ArrayList<Product> goods;

    public VendingMachine(ArrayList<Product> goods) {
        this.goods = goods;
    }

    public Product getProduct(String name) {
        for (Product product : this.goods) {
            if (product.getName().equals(name)) {
                Product temp = product;
                this.goods.remove(product);
                return temp;
            }
        }
        return null;
    }

    public ArrayList<Product> getGoods() {
        return this.goods;
    }

    protected void printTable(String left, String right) {
        System.out.printf("| %-10s | %-5s |\n", left, right);
    }

    protected void menu() {
        if (!this.goods.isEmpty()) {
            System.out.println("\nВыберите ништячки:");
            printTable("Товар", "Цена");
            for (Product product : this.goods) {
                printTable("----------", "-----");
                printTable(product.getName(), Integer.toString(product.getPrice()));
            }
            System.out.println();
        } else
            System.out.println("Весь товар закончился! =D\nПриходите когда пополним.");
    }

    protected void startOS() {
        System.out.println("System loading...");
    }

    protected void powerOn() {
        System.out.println("PowerIsOn.");
        this.startOS();
    }

    protected void powerOff() {
        System.out.println("Sya!");
    }
}
