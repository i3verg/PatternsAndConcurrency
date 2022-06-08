package org.train.strategy.fly.ipml;

import org.train.strategy.fly.behaviour.EnginesBehavior;
import org.train.strategy.fly.behaviour.FlyBehavior;

public abstract class Flyer {
    FlyBehavior flyBehavior;
    EnginesBehavior enginesBehavior;
    public Flyer() {
    }

    public void setFlyBehavior(FlyBehavior fBehavior) {
        flyBehavior = fBehavior;
    }

    public void setEnginesBehavior(EnginesBehavior eBehavior) {
        enginesBehavior = eBehavior;
    }

    public void performFlying(){
        flyBehavior.fly();
    }

    public void performEngineStart(){
        enginesBehavior.startEngine();
    }
}
