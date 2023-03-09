package Webinar_02_03_04_05_06.Example_Zoo.terminal.command.create;

import Webinar_02_03_04_05_06.Example_Zoo.animal.Wolf;
import Webinar_02_03_04_05_06.Example_Zoo.factory.WolfFactory;
import Webinar_02_03_04_05_06.Example_Zoo.terminal.CreateDeleteResult;
import Webinar_02_03_04_05_06.Example_Zoo.terminal.command.CommandExecutable;
import Webinar_02_03_04_05_06.Example_Zoo.zoo.Zoo;

public class CreateWolfExecutable implements CommandExecutable {

    private Zoo zoo;

    public CreateWolfExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        Wolf wolf = WolfFactory.createWolfs(1).get(0);
        this.zoo.createWolf(wolf);
        CreateDeleteResult.income(wolf);
    }
}
