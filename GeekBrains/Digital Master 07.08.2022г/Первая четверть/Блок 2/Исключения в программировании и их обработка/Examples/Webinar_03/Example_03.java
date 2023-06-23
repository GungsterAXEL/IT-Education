package Examples.Webinar_03;

import java.io.IOException;

public class Example_03 {
    /*
    Задача 3.
    Создайте класс-счётчик, у которого есть метод add().
    Метод add() увеличивает значение внутренней int переменной на 1.
    Сделайте так, чтобы с объектом такого типа можно было работать в try-with-resources блоке.
    Подумайте что должно происходить при закрытии этого ресурса.
    Напишите метод для проверки закрыт ли ресурс.
    При попытке вызвать add() у закрытого ресурса должен выброситься IOException.
     */
    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            System.out.println(counter.getCounter());
            counter.close();
            counter.add();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
