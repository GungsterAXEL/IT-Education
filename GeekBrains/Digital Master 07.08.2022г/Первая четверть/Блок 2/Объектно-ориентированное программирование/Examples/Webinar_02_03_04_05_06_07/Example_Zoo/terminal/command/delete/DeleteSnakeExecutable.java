package Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.delete;

import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.CommandExecutable;
import Webinar_02_03_04_05_06_07.Example_Zoo.zoo.Zoo;

public class DeleteSnakeExecutable implements CommandExecutable {

    private Zoo zoo;

    public DeleteSnakeExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.deleteSnake();
    }
}
