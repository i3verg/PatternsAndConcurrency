package org.train.strategy.fly.ipml;

import org.train.strategy.fly.fuel.JetEngine;
import org.train.strategy.fly.nofuel.AirFlyer;

public class ModelFlyer extends Flyer{
    public ModelFlyer() {
        flyBehavior = new AirFlyer();
        enginesBehavior = new JetEngine();
    }

    void display(){
        System.out.println("I'm flyer model!");
    }
}
