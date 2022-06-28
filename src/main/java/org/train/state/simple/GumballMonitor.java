package org.train.state.simple;

import org.train.proxy.domain.GumballMachineRemote;

import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report(){
        try {
            System.out.println("Gumball Machine: " + gumballMachine.getLocation());
            System.out.println("Current Inventory: " + gumballMachine.getCount() + " Gumballs");
            System.out.println("Gumball Machine State: " + gumballMachine.getMachineState());
        } catch (RemoteException ex){
            ex.printStackTrace();
        }
    }



}
