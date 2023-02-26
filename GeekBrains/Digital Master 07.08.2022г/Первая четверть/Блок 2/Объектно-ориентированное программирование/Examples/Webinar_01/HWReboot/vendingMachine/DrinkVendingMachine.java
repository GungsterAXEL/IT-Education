package Webinar_01.HWReboot.vendingMachine;

import java.util.List;

import Webinar_01.HWReboot.product.Drink;

public class DrinkVendingMachine<D extends Drink> implements VendingMachineInterface<Drink> {

    List<D> drinkBox;

    public DrinkVendingMachine(List<D> drinkBox) {
        this.drinkBox = drinkBox;
    }

    public List<D> getDrinkBox() {
        return drinkBox;
    }

    public void setDrinkBox(List<D> drinkBox) {
        this.drinkBox = drinkBox;
    }

    @Override
    public void getProduct(String userInput) {
        String[] splitInput = userInput.replace(",", ".").split(" ");
        if (splitInput.length == 2) {
            String title = splitInput[0];
            String volume = splitInput[1];
            int count = 0;
            for (D drink : this.drinkBox) {
                count++;
                if (title.toLowerCase().equals(drink.getName().toLowerCase())
                        && volume.equals(String.valueOf(drink.getVolume()))) {
                    drink.consume();
                    this.drinkBox.remove(drink);
                    break;
                } else if (count == this.drinkBox.size()) {
                    System.out.println("Такого продукта нет в списке.");
                }
            }
        } else {
            System.out.println("Такого продукта нет в списке.");
        }
    }

    @Override
    public void menu() {
        if (!this.drinkBox.isEmpty()) {
            System.out.println("Меню:\n");
            this.printHead();
            for (D drink : drinkBox) {
                printDelimiter();
                printRow(drink);
            }
            printDelimiter();
            System.out.println("Введите название продукта в формате 'Название Объём': ");
        } else {
            System.out.println("Вся продукция закончилась... =(\n Не преживайте, скоро пополним!\n");
        }
    }

    @Override
    public void printHead() {
        System.out.printf("| %10s | %10s | %10s |\n", "Название", "Объём", "Цена");
    }

    @Override
    public void printRow(Drink drink) {
        System.out.printf("| %10s | %10s | %10s |\n", drink.getName(), drink.getVolume(), drink.getPrice());
    }

    @Override
    public void printDelimiter() {
        String delimiter = "----------";
        System.out.printf("| %10s | %10s | %10s |\n", delimiter, delimiter, delimiter);
    }

}
