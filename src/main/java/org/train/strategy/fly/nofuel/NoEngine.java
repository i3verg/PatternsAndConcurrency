package org.train.strategy.fly.nofuel;

import org.train.strategy.fly.behaviour.EnginesBehavior;

public class NoEngine implements EnginesBehavior {
    @Override
    public void startEngine() {
        System.out.println("Flying on air");
    }
}
