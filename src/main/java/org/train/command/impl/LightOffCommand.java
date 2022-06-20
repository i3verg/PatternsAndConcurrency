package org.train.command.impl;

import org.train.command.base.Command;
import org.train.command.model.receiver.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }
}
