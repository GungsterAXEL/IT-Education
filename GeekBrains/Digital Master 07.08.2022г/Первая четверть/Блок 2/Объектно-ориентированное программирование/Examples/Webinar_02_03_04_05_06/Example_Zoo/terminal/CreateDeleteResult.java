package Webinar_02_03_04_05_06.Example_Zoo.terminal;

import Webinar_02_03_04_05_06.Example_Zoo.animal.Animal;

public class CreateDeleteResult {
    public static <T extends Animal> void outcome(T animal) {
        System.out.println("Животное\n" + animal.toString() + "\nубрано из клетки.");
    }

    public static <T extends Animal> void income(T animal) {
        System.out.println("Животное\n" + animal.toString() + "\nдобавлено в клетку.");
    }
}
