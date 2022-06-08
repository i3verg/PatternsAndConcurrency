package org.train.strategy.shoot.model.impl;

import org.train.strategy.shoot.behavior.impl.SingleShoot;
import org.train.strategy.shoot.model.Gun;

public class Colt extends Gun {
    public Colt() {
        shootBehavior = new SingleShoot();
    }
}
