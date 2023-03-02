package Webinar_02_03_04_05.terminal;

import Webinar_02_03_04_05.factory.SnakeFactory;
import Webinar_02_03_04_05.zoo.Zoo;

public class CreateSnakeExecutable implements CommandExecutable{

    private Zoo zoo;

    public CreateSnakeExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.createSnake(SnakeFactory.createSnakes(1).get(0));
    }
}
