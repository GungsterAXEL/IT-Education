package Webinar_01.Example_01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static ArrayList<Product> productListRandomizer() {
        Random random = new Random();
        int maxPrice = 150;
        String[] names = { "Шоколадка", "Пряник", "Печенька", "Газировка", "Сок" };
        ArrayList<Product> goods = new ArrayList<>();
        for (int i = 0; i < random.nextInt(25); i++) {
            Product product = new Product(names[random.nextInt(names.length)], random.nextInt(maxPrice));
            goods.add(product);
        }
        return goods;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Product> goods = productListRandomizer();
        VendingMachine vendingMachine = new VendingMachine(goods);

        vendingMachine.powerOn();
        while (true) {
            vendingMachine.menu();
            vendingMachine.getProductByName(scan.nextLine());

            System.out.println("Будете что-то ещё?\nY = да. Что-то другое = выход.");
            if (!scan.nextLine().toUpperCase().equals("Y")) {
                break;
            }
        }
        vendingMachine.powerOff();
        scan.close();
    }

}
