package Webinar_02_03_04_05_06.Example_Zoo.terminal.command;

import Webinar_02_03_04_05_06.Example_Zoo.zoo.Zoo;

public class LoggingCommandExecutableFactory extends CommandExecutableFactoryImpl {
    public LoggingCommandExecutableFactory(Zoo zoo) {
        super(zoo);
    }

    @Override
    public CommandExecutable create(Command command, Zoo zoo) {
        System.out.println("Команда" + command.getCommand() + "принята.");
        CommandExecutable commandExecutable = super.create(command, zoo);
        System.out.println("Команда" + command.getCommand() + "выполнена.");
        return commandExecutable;
    }
}
