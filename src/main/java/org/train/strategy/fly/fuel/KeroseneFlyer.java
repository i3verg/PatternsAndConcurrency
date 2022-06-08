package org.train.strategy.fly.fuel;

import org.train.strategy.fly.behaviour.FlyBehavior;

public class KeroseneFlyer implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying on Kerosene");
    }

}
