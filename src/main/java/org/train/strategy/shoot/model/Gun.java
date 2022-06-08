package org.train.strategy.shoot.model;

import org.train.strategy.shoot.behavior.ShootBehavior;

public abstract class Gun {
    public ShootBehavior shootBehavior;

    public void performShoot(){
        shootBehavior.shoot();
    }

    public void setShootBehavior(ShootBehavior sBehavior) {
        shootBehavior = sBehavior;
    }
}
