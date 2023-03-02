package Webinar_02_03_04_05.terminal;

import Webinar_02_03_04_05.zoo.Zoo;

import java.util.Scanner;

public class TerminalReader {

    private static TerminalReader terminalReader;
    private CommandParser commandParser;

    private TerminalReader() {
//        this.commandParser = commandParser;
    }

    public static TerminalReader getTerminal() {
        if (terminalReader == null) {
            terminalReader = new TerminalReader();
        }
        return terminalReader;
    }

    public void runReader(Zoo zoo) {
        Scanner scan = new Scanner(System.in);

        boolean restart = true;
        while (restart) {
            System.out.println("Для получения справки по командам введите 'Help'.");
            String input = scan.nextLine();
            switch (input) {
                case "Break" -> {
                    restart = false;
                }
                default -> {
                    String[] inputCommand = CommandParser.parseCommand(input);
                    CommandExecutableFactory command = new CommandExecutableFactory(zoo);
                    command.create(inputCommand);
                }
            }
        }
        System.out.println("Всего хорошего!");
        scan.close();
    }

}
