package Webinar_01.HWReboot.vendingMachine;

import java.util.List;

import Webinar_01.HWReboot.product.HotDrink;

public class HotDrinkVendingMachine<H extends HotDrink> extends DrinkVendingMachine<H>{

    public HotDrinkVendingMachine(List<H> drinkBox) {
        super(drinkBox);
    }

    @Override
    public void getProduct(String userInput) {
        String[] splitInput = userInput.replace(",", ".").split(" ");
        if (splitInput.length == 3) {
            String title = splitInput[0];
            String volume = splitInput[1];
            String temperature = splitInput[2];
            int count = 0;
            for (H drink : drinkBox) {
                count++;
                if (title.toLowerCase().equals(drink.getName().toLowerCase())
                        && volume.equals(String.valueOf(drink.getVolume()))
                        && temperature.equals(String.valueOf(drink.getVolume()))) {
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
            for (H drink : drinkBox) {
                printDelimiter();
                this.printRow(drink);
            }
            printDelimiter();
            System.out.println("Введите название продукта в формате 'Название Объём Температура': ");
        } else {
            System.out.println("Вся продукция закончилась... =(\n Не преживайте, скоро пополним!\n");
        }
    }

    @Override
    public void printHead() {
        System.out.printf("| %10s | %10s | %10s | %10s |\n",
                "Название", "Объём", "°C", "Цена");
    }

   
    public void printRow(H hotDrink) {
        System.out.printf("| %10s | %10s | %10s | %10s |\n",
                hotDrink.getName(), hotDrink.getVolume(), hotDrink.getTemperature(), hotDrink.getPrice());
    }

    @Override
    public void printDelimiter() {
        String delimiter = "----------";
        System.out.printf("| %10s | %10s | %10s | %10s |\n",
                delimiter, delimiter, delimiter, delimiter);
    }

}
