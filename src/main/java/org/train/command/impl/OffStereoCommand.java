package org.train.command.impl;

import org.train.command.base.Command;
import org.train.command.model.receiver.Musik;

public class OffStereoCommand implements Command {
    Musik musik;

    public OffStereoCommand(Musik musik) {
        this.musik = musik;
    }
    @Override
    public void execute() {
        musik.offStereo();
    }
}
