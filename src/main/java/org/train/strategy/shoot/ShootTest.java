package org.train.strategy.shoot;

import org.train.strategy.shoot.behavior.impl.SingleShoot;
import org.train.strategy.shoot.model.Gun;
import org.train.strategy.shoot.model.impl.Colt;
import org.train.strategy.shoot.model.impl.M4;

public class ShootTest {
    public static void main(String[] args) {
        Gun m4 = new M4();
        m4.performShoot();

        Gun colt = new Colt();
        colt.performShoot();

        m4.setShootBehavior(new SingleShoot());
        m4.performShoot();
    }
}
