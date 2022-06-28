package org.train.proxy.domain;

import org.train.state.extended.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getMachineState() throws RemoteException;
}
