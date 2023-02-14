package Webinar_01.Example_02;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static ArrayList<Drink> drinksListRandomizer() {
        Random random = new Random();
        int maxPrice = 150;
        double[] volume = { 0.3, 0.5, 0.7, 0.9 };
        String[] names = { "Кофе", "Вода", "Чай", "Газировка", "Сок" };
        ArrayList<Drink> goods = new ArrayList<>();
        for (int i = 0; i < random.nextInt(25); i++) {
            Drink product = new Drink(names[random.nextInt(names.length)],
                    random.nextInt(maxPrice), volume[random.nextInt(volume.length)]);
            goods.add(product);
        }
        return goods;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Drink> drinks = drinksListRandomizer();
        DrinkVendingMachine vendingMachine = new DrinkVendingMachine(drinks);

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
