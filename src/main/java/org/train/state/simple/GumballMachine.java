package org.train.state.simple;

import org.train.state.extended.*;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State state;
    int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = count;

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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getWinnerState() {
        return winnerState;
    }


}
