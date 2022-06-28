package org.train.proxy.domain;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyTestRemote extends Remote {
    public String sayHello() throws RemoteException;
}
