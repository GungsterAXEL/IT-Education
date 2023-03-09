package Webinar_02_03_04_05_06.Example_Zoo.terminal.command.other.info;

import Webinar_02_03_04_05_06.Example_Zoo.terminal.command.CommandExecutable;
import Webinar_02_03_04_05_06.Example_Zoo.zoo.Zoo;

public class CagesInfoExecutable implements CommandExecutable {
    private Zoo zoo;

    public CagesInfoExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.checkStatus();
    }
}
