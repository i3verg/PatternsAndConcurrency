package org.train.proxy;

import org.train.proxy.domain.GumballMachineRemote;
import org.train.state.simple.GumballMachine;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachineRemote = null;
        int count;

        try {
            LocateRegistry.createRegistry(1099);
            System.out.println("RMI registry ready.");
            count = Integer.parseInt("10");
            GumballMachine gumballMachine = new GumballMachine("New york", count);
            Naming.rebind("//New_york/gumballmachine",gumballMachine);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
