package Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.other.info;

import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.CommandExecutable;
import Webinar_02_03_04_05_06_07.Example_Zoo.zoo.Zoo;

public class LionCageInfoExecutable implements CommandExecutable {
    private Zoo zoo;

    public LionCageInfoExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.getLionCage().checkStatus();
    }
}
