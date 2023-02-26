package Webinar_01.HWReboot.product;

public abstract class Product<N extends Number> {

    private String name;
    private N price;

    public Product(String name, N price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public N getPrice() {
        return price;
    }

    public void setPrice(N price) {
        this.price = price;
    }

    public abstract void consume();

}
