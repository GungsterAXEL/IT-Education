package Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.create;

import Webinar_02_03_04_05_06_07.Example_Zoo.animal.Snake;
import Webinar_02_03_04_05_06_07.Example_Zoo.factory.SnakeFactory;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.CreateDeleteResult;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.CommandExecutable;
import Webinar_02_03_04_05_06_07.Example_Zoo.zoo.Zoo;

public class CreateSnakeExecutable implements CommandExecutable {

    private Zoo zoo;

    public CreateSnakeExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        Snake snake = SnakeFactory.createSnakes(1).get(0);
        this.zoo.createSnake(snake);
        CreateDeleteResult.income(snake);
    }
}
