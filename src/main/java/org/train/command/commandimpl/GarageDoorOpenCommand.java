package org.train.command.commandimpl;

import org.train.command.base.Command;
import org.train.command.model.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.upDoor();
    }

    /*@Override
    public void undo() {
    }*/
}
