package Webinar_01.HWReboot.vendingMachine;

import Webinar_01.HWReboot.product.Product;

public interface VendingMachineInterface<P extends Product> {

    void getProduct(String userInput);

    void menu();

    void printHead();

    void printRow(P product);

    void printDelimiter();

    private void startOS() {
        System.out.println("System loading...\n");
    }

    private void closeOS() {
        System.out.println("\nShutting down...");
    }

    default void powerOn() {
        System.out.println("\nPowerIsOn.");
        this.startOS();
    }

    default void powerOff() {
        this.closeOS();
        System.out.println("TurnOffThePower.\n");
    }
}
