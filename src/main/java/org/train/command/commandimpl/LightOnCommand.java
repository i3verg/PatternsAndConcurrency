package org.train.command.commandimpl;

import org.train.command.base.Command;
import org.train.command.model.receiver.Light;

public class LightOnCommand implements Command {
    //Receiver
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }

   /* @Override
    public void undo() {
        light.lightOff();
    }*/
}
