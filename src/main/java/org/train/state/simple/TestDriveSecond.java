package org.train.state.simple;

public class TestDriveSecond {
    public static void main(String[] args) {
        int count = 0;
        /*if(args.length <2){
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }*/

        count = Integer.parseInt("10");
        GumballMachine gumballMachine = new GumballMachine("New york", count);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

        gumballMonitor.report();
    }
}
