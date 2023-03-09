package Webinar_02_03_04_05_06.Example_Zoo.terminal.command;

public class Command {
    private static String COMMANDLIST = "Break - Выход.\n" +
            "LionCageInfo - Просмотр информации о клетке со львами.\n" +
            "WolfCageInfo - Просмотр информации о клетке с волками.\n" +
            "SnakeCageInfo - Просмотр информации о террариуме со змеями.\n" +
            "CagesInfo - Просмотр информации о всех клетках.\n\n" +
            "Львы:\n" +
            "CreateLion - Добавить рандомного льва в клетку.\n" +
            "DeleteLion - Удалить рандомного льва из клетки.\n\n" +
            "Волки:\n" +
            "CreateWolf - Добавить рандомного волка в клетку.\n" +
            "DeleteWolf - Удалить рандомного волка из клетки.\n\n" +
            "Змеи:\n" +
            "CreateSnake - Добавить рандомную змею в клетку.\n" +
            "DeleteSnake - Удалить рандомную змею из клетки.\n";

    public static String getCOMMANDLIST() {
        return COMMANDLIST;
    }

    private String command;

    public Command(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public boolean getHelp() {
        return this.command.equals("Help");
    }

    public boolean lionCageInfo() {
        return this.command.equals("LionCageInfo");
    }

    public boolean wolfCageInfo() {
        return this.command.equals("WolfCageInfo");
    }

    public boolean snakeCageInfo() {
        return this.command.equals("SnakeCageInfo");
    }

    public boolean cagesInfo() {
        return this.command.equals("CagesInfo");
    }

    public boolean createLion() {
        return this.command.equals("CreateLion");
    }

    public boolean deleteLion() {
        return this.command.equals("DeleteLion");
    }

    public boolean createWolf() {
        return this.command.equals("CreateWolf");
    }

    public boolean deleteWolf() {
        return this.command.equals("DeleteWolf");
    }

    public boolean createSnake() {
        return this.command.equals("CreateSnake");
    }

    public boolean deleteSnake() {
        return this.command.equals("DeleteSnake");
    }

}