package Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command;

import Webinar_02_03_04_05_06_07.Example_Zoo.zoo.Zoo;

public interface CommandExecutableFactory{
    CommandExecutable create(Command command, Zoo zoo);
}
