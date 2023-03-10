package Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command;

import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.create.CreateLionExecutable;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.create.CreateSnakeExecutable;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.create.CreateWolfExecutable;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.delete.DeleteLionExecutable;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.delete.DeleteSnakeExecutable;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.delete.DeleteWolfExecutable;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.other.BreakExecutable;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.other.HelpExecutable;
import Webinar_02_03_04_05_06_07.Example_Zoo.terminal.command.other.info.*;
import Webinar_02_03_04_05_06_07.Example_Zoo.zoo.Zoo;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {

    private Zoo zoo;

    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(Command command, Zoo zoo) {

        if (command.getHelp()) return new HelpExecutable(this.zoo);
        else if (command.getBreak()) return new BreakExecutable(this.zoo);

        else if (command.lionCageInfo()) return new LionCageInfoExecutable(this.zoo);
        else if (command.wolfCageInfo()) return new WolfCageInfoExecutable(this.zoo);
        else if (command.snakeCageInfo()) return new SnakeCageInfoExecutable(this.zoo);
        else if (command.cagesInfo()) return new CagesInfoExecutable(this.zoo);

        else if (command.createLion()) return new CreateLionExecutable(this.zoo);
        else if (command.deleteLion()) return new DeleteLionExecutable(this.zoo);

        else if (command.createWolf()) return new CreateWolfExecutable(this.zoo);
        else if (command.deleteWolf()) return new DeleteWolfExecutable(this.zoo);

        else if (command.createSnake()) return new CreateSnakeExecutable(this.zoo);
        else if (command.deleteSnake()) return new DeleteSnakeExecutable(this.zoo);

        return new UnknownCommandExecutable(this.zoo);
    }
}
