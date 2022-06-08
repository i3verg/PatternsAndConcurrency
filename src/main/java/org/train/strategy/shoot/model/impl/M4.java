package org.train.strategy.shoot.model.impl;

import org.train.strategy.shoot.behavior.impl.MultiShoot;
import org.train.strategy.shoot.model.Gun;

public class M4 extends Gun {
    public M4() {
        shootBehavior = () -> System.out.println("Tra-ta-ta-ta");
    }
}
