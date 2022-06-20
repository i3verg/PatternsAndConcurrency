package org.train.command.commandimpl;

import org.train.command.base.Command;
import org.train.command.model.receiver.Stereo;

public class OnStereoCommand implements Command {
    Stereo stereo;

    public OnStereoCommand(Stereo musik) {
        this.stereo = musik;
    }
    @Override
    public void execute() {
        stereo.onStereo();
        stereo.setArtist("Radio");
        stereo.setVolume(10);
    }

    /*@Override
    public void undo() {
        stereo.offStereo();
    }*/
}
