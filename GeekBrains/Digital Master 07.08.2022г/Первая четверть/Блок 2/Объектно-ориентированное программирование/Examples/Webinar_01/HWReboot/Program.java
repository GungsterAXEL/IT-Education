package Webinar_01.HWReboot;

import java.util.List;
import java.util.Scanner;

import Webinar_01.HWReboot.product.Product;
import Webinar_01.HWReboot.vendingMachine.DrinkVendingMachine;
import Webinar_01.HWReboot.vendingMachine.HotDrinkVendingMachine;
import Webinar_01.HWReboot.factory.HotDrinkFactory;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<? extends Product> box = new HotDrinkFactory().randomBox();

        DrinkVendingMachine vendMachine = new HotDrinkVendingMachine(box);

        vendMachine.powerOn();

        boolean restart = true;
        while (restart) {

            vendMachine.menu();
            vendMachine.getProduct(scan.nextLine());

            System.out.println("Что-то ещё?\n Y = Да.");
            if (!scan.nextLine().toUpperCase().equals("Y")) {
                System.out.println("Приходите ещё!\n");
                restart = false;
            }

        }

        vendMachine.powerOff();

        scan.close();
    }
}
