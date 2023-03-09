package Webinar_02_03_04_05_06.Example_Zoo.terminal.command.delete;

import Webinar_02_03_04_05_06.Example_Zoo.terminal.CreateDeleteResult;
import Webinar_02_03_04_05_06.Example_Zoo.terminal.command.CommandExecutable;
import Webinar_02_03_04_05_06.Example_Zoo.zoo.Zoo;

public class DeleteLionExecutable implements CommandExecutable {

    private Zoo zoo;

    public DeleteLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.deleteLion();
    }

}
