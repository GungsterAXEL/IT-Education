package Webinar_01.Homework;

import java.util.ArrayList;

public class DrinkVendingMachine extends VendingMachine {
    private ArrayList<Drink> drinks;

    public DrinkVendingMachine(ArrayList<Product> goods, ArrayList<Drink> drinks) {
        super(goods);
        this.drinks = drinks;
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<Drink> drinks) {
        this.drinks = drinks;
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public Drink getProduct(String name) {
        for (Drink product : this.drinks) {
            if (product.getName().equals(name))
                return product;

        }
        return null;
    }
}
