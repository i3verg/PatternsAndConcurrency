package org.train.command;

import org.train.command.commandimpl.LightOffCommand;
import org.train.command.commandimpl.LightOnCommand;
import org.train.command.commandimpl.OffStereoCommand;
import org.train.command.commandimpl.OnStereoCommand;
import org.train.command.model.RemoteControl;
import org.train.command.model.receiver.Light;
import org.train.command.model.receiver.Stereo;

public class CommandLoader {
    public static void main(String[] args) {
        Light garageLight = new Light("Garage room");
        Light livingRoomLight = new Light("Living room");
        Stereo garageStereo = new Stereo("Garage stereo");
        Stereo livingStereo = new Stereo("Living stereo");

        LightOnCommand garageLightOn = new LightOnCommand(garageLight);
        LightOffCommand garageLightOff = new LightOffCommand(garageLight);
        LightOnCommand livingRoomOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomOff = new LightOffCommand(livingRoomLight);

        OnStereoCommand garageStereoOn = new OnStereoCommand(garageStereo);
        OffStereoCommand garageStereoOff = new OffStereoCommand(garageStereo);
        OnStereoCommand livingStereoOn = new OnStereoCommand(livingStereo);
        OffStereoCommand livingStereoOff = new OffStereoCommand(livingStereo);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(0, livingRoomOn, livingRoomOff);
        remoteControl.setCommand(1, livingStereoOn, livingStereoOff);
        remoteControl.setCommand(2, garageLightOn, garageLightOff);
        remoteControl.setCommand(3, garageStereoOn, garageStereoOff);

        System.out.println(remoteControl);

        remoteControl.onCommandExecuted(0);
        remoteControl.onCommandExecuted(1);


    }
}
