package org.train.proxy.domain;

import org.train.state.extended.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getMachineState() throws RemoteException;
}
