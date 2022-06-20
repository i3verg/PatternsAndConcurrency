package org.train.command.impl;

import org.train.command.base.Command;
import org.train.command.model.receiver.Musik;

public class OnStereoCommand implements Command {
    Musik musik;

    public OnStereoCommand(Musik musik) {
        this.musik = musik;
    }
    @Override
    public void execute() {
        musik.onStereo();
        musik.setArtist("Radio");
        musik.setVolume(10);
    }
}
