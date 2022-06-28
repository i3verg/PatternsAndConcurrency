package org.train.proxy.impl;

import org.train.proxy.domain.MyTestRemote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyTestRemoteImpl extends UnicastRemoteObject implements MyTestRemote {

    private static final long serialVersionUID = 1L;

    public MyTestRemoteImpl() throws RemoteException {

    }
    @Override
    public String sayHello() throws RemoteException {
        return "Server sya hi";
    }

    public static void main(String[] args) {
        try {
            MyTestRemote service = new MyTestRemoteImpl();
            Naming.rebind("RemoteService", service);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
