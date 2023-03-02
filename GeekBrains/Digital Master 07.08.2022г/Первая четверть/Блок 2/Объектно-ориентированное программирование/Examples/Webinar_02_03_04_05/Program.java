package Webinar_02_03_04_05;


import Webinar_02_03_04_05.cage.LionCage;
import Webinar_02_03_04_05.cage.SnakeTerrarium;
import Webinar_02_03_04_05.cage.WolfCage;
import Webinar_02_03_04_05.factory.LionsFactory;
import Webinar_02_03_04_05.factory.SnakeFactory;
import Webinar_02_03_04_05.factory.WolfFactory;
import Webinar_02_03_04_05.terminal.TerminalReader;
import Webinar_02_03_04_05.zoo.Zoo;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Zoo zoo = new Zoo(new WolfCage(0, WolfFactory.createWolfs(20)),
                new LionCage(0, LionsFactory.createLions(20)),
                new SnakeTerrarium(0, SnakeFactory.createSnakes(20)));

        TerminalReader.getTerminal().runReader(zoo);

    }
}