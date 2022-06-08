package org.train.strategy.fly.ipml;

import org.train.strategy.fly.fuel.JetEngine;
import org.train.strategy.fly.fuel.KeroseneFlyer;

public class SuperJet extends Flyer {
    public SuperJet() {
        flyBehavior = new KeroseneFlyer();
        enginesBehavior = new JetEngine();
    }

    public void display(){
        System.out.println("I'm a superJet");
    }
}
