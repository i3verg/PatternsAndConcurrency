package org.train.state.extended;

import org.train.state.simple.GumballMachine;

public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("There is no gumballs");
    }

    @Override
    public void ejectQuarter() {
            System.out.println("there is no quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("There is no gumballs");
    }

    @Override
    public void dispence() {
        System.out.println("There is no gumballs");
    }
}
