package Webinar_02_03_04_05_06.Example_Zoo;


import Webinar_02_03_04_05_06.Example_Zoo.cage.LionCage;
import Webinar_02_03_04_05_06.Example_Zoo.cage.SnakeTerrarium;
import Webinar_02_03_04_05_06.Example_Zoo.cage.WolfCage;
import Webinar_02_03_04_05_06.Example_Zoo.factory.LionsFactory;
import Webinar_02_03_04_05_06.Example_Zoo.factory.SnakeFactory;
import Webinar_02_03_04_05_06.Example_Zoo.factory.WolfFactory;
import Webinar_02_03_04_05_06.Example_Zoo.terminal.TerminalReader;
import Webinar_02_03_04_05_06.Example_Zoo.terminal.command.Command;
import Webinar_02_03_04_05_06.Example_Zoo.terminal.command.CommandExecutableFactoryImpl;
import Webinar_02_03_04_05_06.Example_Zoo.terminal.command.CommandParser;
import Webinar_02_03_04_05_06.Example_Zoo.zoo.Zoo;


public class Program {
    public static void main(String[] args) {

        Zoo zoo = new Zoo(new WolfCage(0, WolfFactory.createWolfs(20)), new LionCage(0, LionsFactory.createLions(20)), new SnakeTerrarium(0, SnakeFactory.createSnakes(20)));

        TerminalReader terminalReader = new TerminalReader(new CommandParser() {
            @Override
            public Command parseCommand(String inputCommand) {
                return new Command(inputCommand);
            }
        }, new CommandExecutableFactoryImpl(zoo));
        terminalReader.runReader(zoo);

    }
}