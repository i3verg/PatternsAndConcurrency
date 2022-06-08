package org.train.strategy.fly.fuel;

import org.train.strategy.fly.behaviour.FlyBehavior;

public class RocketFlyer implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i'm flying like a rocket");
    }
}
