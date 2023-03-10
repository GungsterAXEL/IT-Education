package Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.other;

import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.CommandExecutable;
import Webinar_02_03_04_05_06_07.Example_Zoo.zoo.Zoo;

public class BreakExecutable implements CommandExecutable {
    private Zoo zoo;

    public BreakExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        System.out.println("Всего хорошего!");
        System.exit(0);
    }
}
