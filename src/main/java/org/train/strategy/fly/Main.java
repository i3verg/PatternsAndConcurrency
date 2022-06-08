package org.train.strategy.fly;

import org.train.strategy.fly.fuel.RocketFlyer;
import org.train.strategy.fly.ipml.Flyer;
import org.train.strategy.fly.ipml.ModelFlyer;
import org.train.strategy.fly.ipml.SuperJet;

public class Main {
    public static void main(String[] args) {

        Flyer flyer = new SuperJet();
        flyer.performEngineStart();
        flyer.performFlying();
        System.out.println("_______________");

        Flyer modelFlyer = new ModelFlyer();
        modelFlyer.performFlying();
        modelFlyer.setFlyBehavior(new RocketFlyer());
        modelFlyer.performEngineStart();
        modelFlyer.performFlying();
    }
}