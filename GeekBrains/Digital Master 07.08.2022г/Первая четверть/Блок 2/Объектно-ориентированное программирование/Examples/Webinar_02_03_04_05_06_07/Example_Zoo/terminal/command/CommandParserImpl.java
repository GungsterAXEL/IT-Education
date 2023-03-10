package Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command;

public class CommandParserImpl implements CommandParser {
    @Override
    public Command parseCommand(String inputCommand) {
        String[] newInputCommand = inputCommand.split("\\s+");
        Command command = new Command(newInputCommand[0]);
        return command;
    }
}
