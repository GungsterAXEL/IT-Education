package Webinar_02_03_04_05.terminal;

public interface CommandParser {
    static String[] parseCommand(String inputCommand){
        return inputCommand.split(" ");
    };

}
