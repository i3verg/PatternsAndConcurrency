package org.train.command.commandimpl;

import org.train.command.base.Command;
import org.train.command.model.receiver.Stereo;

public class OffStereoCommand implements Command {
    Stereo musik;

    public OffStereoCommand(Stereo musik) {
        this.musik = musik;
    }
    @Override
    public void execute() {
        musik.offStereo();
    }

    /*@Override
    public void undo() {
        musik.onStereo();
    }*/
}
