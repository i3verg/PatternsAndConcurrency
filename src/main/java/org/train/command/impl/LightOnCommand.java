package org.train.command.impl;

import org.train.command.base.Command;
import org.train.command.model.Light;

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
}
