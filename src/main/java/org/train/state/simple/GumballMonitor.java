package org.train.state.simple;

public class GumballMonitor {
    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report(){
        System.out.println("Gumball Machine: " + gumballMachine.getLocation());
        System.out.println("Current Inventory: " + gumballMachine.getCount() + " Gumballs");
        System.out.println("Gumball Machine State: " + gumballMachine.getState());
    }



}
