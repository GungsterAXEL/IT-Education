package Webinar_02_03_04_05_06.Example_Zoo.terminal;

import Webinar_02_03_04_05_06.Example_Zoo.terminal.command.*;
import Webinar_02_03_04_05_06.Example_Zoo.zoo.Zoo;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;
    private CommandExecutableFactoryImpl commandExecutableFactory;

    public TerminalReader(CommandParser commandParser, CommandExecutableFactoryImpl commandExecutableFactory) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
    }

    public static void setTerminalReader(TerminalReader terminalReader) {
        TerminalReader.terminalReader = terminalReader;
    }

    public void runReader(Zoo zoo) {
        Scanner scan = new Scanner(System.in);

        boolean restart = true;
        while (restart) {
            System.out.println(Menu.getMENU());
            Command command = this.commandParser.parseCommand(scan.nextLine());
            CommandExecutable commandExecutable = this.commandExecutableFactory.create(command, zoo);
            switch (command.getCommand()) {
                case "Break" -> {
                    restart = false;
                }
                default -> {
                    commandExecutable.execute();
                }
            }
        }
        System.out.println("Всего хорошего!");
        scan.close();
    }
}
