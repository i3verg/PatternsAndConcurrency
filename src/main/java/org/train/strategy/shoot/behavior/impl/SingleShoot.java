package org.train.strategy.shoot.behavior.impl;

import org.train.strategy.shoot.behavior.ShootBehavior;

public class SingleShoot implements ShootBehavior {
    @Override
    public void shoot() {
        System.out.println("SingleShoot");
    }
}
