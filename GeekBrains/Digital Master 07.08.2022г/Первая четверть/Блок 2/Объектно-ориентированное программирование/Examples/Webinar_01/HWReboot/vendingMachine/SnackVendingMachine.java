package Webinar_01.HWReboot.vendingMachine;

import java.util.List;

import Webinar_01.HWReboot.product.Snack;

public class SnackVendingMachine<S extends Snack> implements VendingMachineInterface<S> {

    private List<S> snackBox;

    public SnackVendingMachine(List<S> snackBox) {
        this.snackBox = snackBox;
    }

    public List<S> getSnackBox() {
        return snackBox;
    }

    public void setSnackBox(List<S> snackBox) {
        this.snackBox = snackBox;
    }

    @Override
    public void getProduct(String userInput) {
        int count = 0;
        for (S snack : this.snackBox) {
            count++;
            if (userInput.toLowerCase().equals(snack.getName().toLowerCase())) {
                snack.consume();
                this.snackBox.remove(snack);
                break;
            } else if (count == this.snackBox.size()) {
                System.out.println("Такого продукта нет в списке.");
            }
        }
    }

    @Override
    public void menu() {
        if (!this.snackBox.isEmpty()) {
            System.out.println("Меню:\n");
            this.printHead();
            for (S snack : snackBox) {
                printDelimiter();
                printRow(snack);
            }
            printDelimiter();
            System.out.println("Введите название продукта: ");
        }else{System.out.println("Вся продукция закончилась... =(\n Не преживайте, скоро пополним!\n");}
    }

    @Override
    public void printHead() {
        System.out.printf("| %10s | %10s |\n", "Название", "Цена");
    }

    @Override
    public void printRow(S snack) {
        System.out.printf("| %10s | %10s |\n", snack.getName(), snack.getPrice());
    }

    @Override
    public void printDelimiter() {
        String delimiter = "----------";
        System.out.printf("| %10s | %10s |\n", delimiter, delimiter);
    }

}
