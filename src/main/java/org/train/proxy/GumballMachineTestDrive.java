package org.train.proxy;

import org.train.proxy.domain.GumballMachineRemote;
import org.train.state.simple.GumballMachine;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachineRemote = null;
        int count;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            final Registry registry = LocateRegistry.createRegistry(1099);
            System.out.println("RMI registry ready.");
            count = Integer.parseInt("100");
            GumballMachine gumballMachine = new GumballMachine("Remote", count);
            System.out.println(args[0]);
            Naming.rebind("Remote", gumballMachine);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
