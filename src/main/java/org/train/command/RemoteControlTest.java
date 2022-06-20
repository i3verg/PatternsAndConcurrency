package org.train.command;

import org.train.command.commandimpl.GarageDoorOpenCommand;
import org.train.command.commandimpl.LightOnCommand;
import org.train.command.model.receiver.GarageDoor;
import org.train.command.model.receiver.Light;
import org.train.command.model.SimpleRemoteControl;

//client
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light("kitchen");
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remoteControl.setCommandSlot(lightOnCommand);
        remoteControl.executeSlotCommand();
        remoteControl.setCommandSlot(garageDoorOpenCommand);
        remoteControl.executeSlotCommand();
    }
}
