package Webinar_02_03_04_05.terminal;

import Webinar_02_03_04_05.factory.LionsFactory;
import Webinar_02_03_04_05.zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable{

    private Zoo zoo;

    public CreateLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.createLion(LionsFactory.createLions(1).get(0));
    }

}
