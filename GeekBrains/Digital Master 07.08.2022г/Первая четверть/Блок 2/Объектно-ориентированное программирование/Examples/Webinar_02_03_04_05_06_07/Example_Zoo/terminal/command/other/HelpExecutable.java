package Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.other;

import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.Command;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.CommandExecutable;
import Webinar_02_03_04_05_06_07.Example_Zoo.zoo.Zoo;

public class HelpExecutable implements CommandExecutable {
    private Zoo zoo;

    public HelpExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        System.out.println(Command.getCOMMANDLIST());
    }
}
