package Lection_02.Example_04;

public abstract class BaseHero {

    public BaseHero(String name, int hp) {
        System.out.println("Вызван BaseHero(String name, int hp)");
    }

    public BaseHero() {
        this("", 0);
        System.out.println("Вызван BaseHero()");
    }
}