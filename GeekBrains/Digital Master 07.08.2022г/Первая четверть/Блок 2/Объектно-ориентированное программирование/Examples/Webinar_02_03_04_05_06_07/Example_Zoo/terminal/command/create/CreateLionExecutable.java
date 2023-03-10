package Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.create;

import Webinar_02_03_04_05_06_07.Example_Zoo.animal.Lion;
import Webinar_02_03_04_05_06_07.Example_Zoo.factory.LionsFactory;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.CreateDeleteResult;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.CommandExecutable;
import Webinar_02_03_04_05_06_07.Example_Zoo.zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable {

    private Zoo zoo;

    public CreateLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        Lion lion = LionsFactory.createLions(1).get(0);
        this.zoo.createLion(lion);
        CreateDeleteResult.income(lion);
    }

}
