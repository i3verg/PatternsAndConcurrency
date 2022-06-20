package org.train.command.model;

import org.train.command.base.Command;
import org.train.command.impl.NoneCommand;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    List<Command> onCommandList;
    List<Command> offCommandList;

    public RemoteControl() {
        this.onCommandList = new ArrayList<>(7);
        this.offCommandList = new ArrayList<>(7);

        Command initCommand = new NoneCommand();

        for (int i = 0; i < 7; i++) {
            onCommandList.add(i, initCommand);
            offCommandList.add(i, initCommand);
        }
    }

    public void setCommand(int position, Command onCommand, Command offCommand) {
        onCommandList.set(position, onCommand);
        offCommandList.set(position, offCommand);
    }

    public void onCommandExecuted(int position) {
        onCommandList.get(position).execute();
    }

    public void offCommandExecuted(int position) {
        offCommandList.get(position).execute();
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n-----Remote control------\n");
        for (int i = 0; i < onCommandList.size(); i++) {
            stringBuffer.append("[Command slot ").append(i).append("] ")
                    .append(onCommandList.get(i).getClass().getName()).append("   ")
                    .append(offCommandList.get(i).getClass().getName()).append("\n");
        }
        return stringBuffer.toString();
    }
}
