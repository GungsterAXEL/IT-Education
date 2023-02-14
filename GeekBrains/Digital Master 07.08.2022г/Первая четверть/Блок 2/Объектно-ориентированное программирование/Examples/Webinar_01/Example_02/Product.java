package Webinar_01.Example_02;

public class Product {
    private String name;
    private Integer price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void consume(){
        System.out.println("Продукт потреблён.");
    }
}
