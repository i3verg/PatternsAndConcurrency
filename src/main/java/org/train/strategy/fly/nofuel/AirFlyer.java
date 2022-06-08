package org.train.strategy.fly.nofuel;

import org.train.strategy.fly.behaviour.FlyBehavior;

public class AirFlyer implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying without kerosene");
    }
}
