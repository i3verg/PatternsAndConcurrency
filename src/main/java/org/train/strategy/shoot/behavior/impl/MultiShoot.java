package org.train.strategy.shoot.behavior.impl;

import org.train.strategy.shoot.behavior.ShootBehavior;

public class MultiShoot implements ShootBehavior {
    @Override
    public void shoot() {
        System.out.println("Multi shoot");
    }
}
