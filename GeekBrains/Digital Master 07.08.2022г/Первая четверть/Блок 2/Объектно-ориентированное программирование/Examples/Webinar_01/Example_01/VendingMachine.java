package Webinar_01.Example_01;

import java.util.ArrayList;

public class VendingMachine {
    protected ArrayList<Product> goods;

    public VendingMachine(ArrayList<Product> goods) {
        this.goods = goods;
    }

    public Product getProductByName(String name) {
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

    // public void setGoods(ArrayList<Product> goods) {
    // this.goods = goods;
    // }

    protected void printTable(String left, String right) {
        System.out.printf("| %-10s | %-5s |\n", left, right);
    }

    public void menu() {
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

    public void startOS() {
        System.out.println("System loading...");
    }

    public void powerOn() {
        System.out.println("PowerIsOn.");
        this.startOS();
    }

    public void powerOff() {
        System.out.println("Sya!");
    }
}
