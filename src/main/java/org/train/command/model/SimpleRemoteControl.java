package org.train.command.model;

import org.train.command.base.Command;
//invoker
public class SimpleRemoteControl {

    Command commandSlot;

    public SimpleRemoteControl() {
    }

    public void setCommandSlot(Command commandSlot) {
        this.commandSlot = commandSlot;
    }

    public void executeSlotCommand(){
        commandSlot.execute();
    }
}
