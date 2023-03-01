package Webinar_02_03_04_05.terminal;

import Webinar_02_03_04_05.zoo.Zoo;

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
