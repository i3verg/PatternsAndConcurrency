package org.train.strategy.fly.fuel;

import org.train.strategy.fly.behaviour.EnginesBehavior;

public class JetEngine implements EnginesBehavior {
    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }
}
