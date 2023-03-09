package Webinar_02_03_04_05_06.Example_Zoo.terminal.command.other.info;

import Webinar_02_03_04_05_06.Example_Zoo.terminal.command.CommandExecutable;
import Webinar_02_03_04_05_06.Example_Zoo.zoo.Zoo;

public class UnknownCommandExecutable implements CommandExecutable {
    private Zoo zoo;

    public UnknownCommandExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        System.out.println("Команда не распознана.");
    }
}
