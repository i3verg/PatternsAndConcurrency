package org.train.command.commandimpl;

import org.train.command.base.Command;
import org.train.command.model.receiver.Stereo;

public class OnStereoCommand implements Command {
    Stereo musik;

    public OnStereoCommand(Stereo musik) {
        this.musik = musik;
    }
    @Override
    public void execute() {
        musik.onStereo();
        musik.setArtist("Radio");
        musik.setVolume(10);
    }
}
