package Webinar_06;

import java.time.LocalDateTime;

/**
 * Задача 1.
 * Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
 * приложения, которое является
 * а) информационной системой ветеринарной клиники
 * б) архивом выставки котов
 * в) информационной системой Театра кошек Ю. Д. Куклачёва
 * Можно записать в текстовом виде, не обязательно реализовывать в java.
 */

public class Cat {
    String name;
    String color;
    LocalDateTime date;
    String breed;

    void Print() {
        System.out.println(name + " " + color + " " + date + " " + breed);
    }

    Cat(String n, String c, LocalDateTime d, String b) {
        name = n;
        color = c;
        date = d;
        breed = b;
    }

    // Cat(LocalDateTime d, String n, String c, String b){
    // name = n;
    // color = c;
    // date = d;
    // breed = b;
    // }
    Cat() {
        name = "Gray";
        color = "Black";
        date = LocalDateTime.now();
        breed = "scotland";
    }

    Cat(String name, String color) {
        this.name = name;
        this.color = color;
        date = LocalDateTime.now();
        breed = "scotland";
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Cat compareCat = (Cat) obj;
        if (this.name.equals(compareCat.name) && this.color.equals(compareCat.color))
            return true;
        return false;
    }
    // @Override
    // public int hashCode() {
    // this.name.hashCode() + this.color.hashCode();
    // // TODO Auto-generated method stub
    // return super.hashCode();
    // }
}
