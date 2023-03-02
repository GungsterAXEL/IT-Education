package Webinar_02_03_04_05.terminal;

import Webinar_02_03_04_05.factory.WolfFactory;
import Webinar_02_03_04_05.zoo.Zoo;

public class CreateWolfExecutable implements CommandExecutable{

    private Zoo zoo;

    public CreateWolfExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.createWolf(WolfFactory.createWolfs(1).get(0));
    }
}
