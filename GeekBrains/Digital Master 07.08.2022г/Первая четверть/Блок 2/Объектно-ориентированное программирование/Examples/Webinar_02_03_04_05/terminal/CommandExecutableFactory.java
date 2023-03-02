package Webinar_02_03_04_05.terminal;

import Webinar_02_03_04_05.zoo.Zoo;

public class CommandExecutableFactory {

    private Zoo zoo;

    public CommandExecutableFactory(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(String[] input) {

        switch (input[0]) {
            case "Help" -> {
                System.out.println("Break - Выход.");
                System.out.println("LionCageInfo - Просмотр информации о клетке со львами.");
                System.out.println("WolfCageInfo - Просмотр информации о клетке с волками.");
                System.out.println("SnakeCageInfo - Просмотр информации о террариуме со змеями.");
                System.out.println("CagesInfo - Просмотр информации о всех клетках.\n");
                System.out.println("Львы:");
                System.out.println("CreateLion - Добавить рандомного льва в клетку.");
                System.out.println("DeleteLion - Удалить рандомного льва из клетки.\n");
                System.out.println("Волки:");
                System.out.println("CreateWolf - Добавить рандомного волка в клетку.");
                System.out.println("DeleteWolf - Удалить рандомного волка из клетки.\n");
                System.out.println("Змеи:");
                System.out.println("CreateSnake - Добавить рандомную змею в клетку.");
                System.out.println("DeleteSnake - Удалить рандомную змею из клетки.\n");
            }
            case "LionCageInfo" -> {
                this.zoo.getLionCage().checkStatus();
            }
            case "WolfCageInfo" -> {
                this.zoo.getWolfCage().checkStatus();
            }
            case "SnakeCageInfo" -> {
                this.zoo.getSnakeTerrarium().checkStatus();
            }
            case "CagesInfo" -> {
                this.zoo.checkInfo();
            }
            case "CreateLion" -> {
                CreateLionExecutable newLion = new CreateLionExecutable(zoo);
                newLion.execute();
                System.out.println("Лев добавлен.");
            }
            case "DeleteLion" -> {
                DeleteLionExecutable oldLion = new DeleteLionExecutable(zoo);
                oldLion.execute();
                System.out.println("Лев удалён.");
            }
            case "CreateWolf" -> {
                CreateWolfExecutable newWolf = new CreateWolfExecutable(zoo);
                newWolf.execute();
                System.out.println("Волк добавлен.");
            }
            case "DeleteWolf" -> {
                DeleteWolfExecutable oldWolf = new DeleteWolfExecutable(zoo);
                oldWolf.execute();
                System.out.println("Волк удалён.");
            }
            case "CreateSnake" -> {
                CreateSnakeExecutable newSnake = new CreateSnakeExecutable(zoo);
                newSnake.execute();
                System.out.println("Змея добавлена.");
            }
            case "DeleteSnake" -> {
                DeleteSnakeExecutable oldSnake = new DeleteSnakeExecutable(zoo);
                oldSnake.execute();
                System.out.println("Змея удалёна.");
            }

            default -> System.out.println("Команда " + input[0] + " не распознана.");
        }
        return null;

    }
}
