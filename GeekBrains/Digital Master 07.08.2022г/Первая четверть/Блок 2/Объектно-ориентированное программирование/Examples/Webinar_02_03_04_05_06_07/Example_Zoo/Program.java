package Webinar_02_03_04_05_06_07.Example_Zoo;

import Webinar_02_03_04_05_06_07.Example_Zoo.cage.LionCage;
import Webinar_02_03_04_05_06_07.Example_Zoo.cage.SnakeTerrarium;
import Webinar_02_03_04_05_06_07.Example_Zoo.cage.WolfCage;
import Webinar_02_03_04_05_06_07.Example_Zoo.factory.LionsFactory;
import Webinar_02_03_04_05_06_07.Example_Zoo.factory.SnakeFactory;
import Webinar_02_03_04_05_06_07.Example_Zoo.factory.WolfFactory;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.TerminalReader;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.CommandExecutableFactoryImpl;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.CommandParserImpl;
import Webinar_02_03_04_05_06_07.Example_Zoo.zoo.Zoo;

public class Program {
    public static void main(String[] args) {

        int animalsCount = 10;
        Zoo zoo = new Zoo(new WolfCage(0, WolfFactory.createWolfs(animalsCount)), new LionCage(0, LionsFactory.createLions(animalsCount)), new SnakeTerrarium(0, SnakeFactory.createSnakes(animalsCount)));

        TerminalReader terminalReader = new TerminalReader(new CommandParserImpl(), new CommandExecutableFactoryImpl(zoo));
        terminalReader.runReader(zoo);

    }
}