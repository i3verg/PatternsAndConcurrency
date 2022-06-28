package org.train.proxy;

import org.train.proxy.domain.GumballMachineRemote;
import org.train.state.simple.GumballMonitor;

import java.rmi.Naming;
import java.util.Arrays;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {"rmi://localhost/Remote"};

        GumballMonitor[] gumballMonitors = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote gumballMachineRemote = (GumballMachineRemote) Naming.lookup(location[i]);
                gumballMonitors[i] = new GumballMonitor(gumballMachineRemote);
                System.out.println(gumballMonitors[i]);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        Arrays.stream(gumballMonitors).forEach(GumballMonitor::report);
    }
}
