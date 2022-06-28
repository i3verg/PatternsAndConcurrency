package org.train.state.extended;

import org.train.state.simple.GumballMachine;

public class DemoGumm {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(args[1], 5);

        System.out.println(gumballMachine.getState());

        gumballMachine.insertQuarter();
        System.out.println(gumballMachine.getState());
        gumballMachine.turnCrank();

        System.out.println(gumballMachine.getState());

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine.getState());
    }
}
