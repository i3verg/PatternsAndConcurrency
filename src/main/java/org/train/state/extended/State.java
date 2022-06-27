package org.train.state.extended;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispence();
}
