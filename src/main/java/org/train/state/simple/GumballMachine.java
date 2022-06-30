package org.train.state.simple;

import org.train.proxy.domain.GumballMachineRemote;
import org.train.state.extended.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    public static final long serialVersionUID = 2L;
    String location;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State state;
    int count = 0;

    public GumballMachine(String location, int count) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = count;
        this.location = location;

        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void releaseBall() {
        System.out.println("A gummball comes rolling out the slot...");
        if (count != 0) {
            count -= 1;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispence();
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    public State getMachineState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public String getLocation() {
        return location;
    }
}
