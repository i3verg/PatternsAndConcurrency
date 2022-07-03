package org.train.compositepatterns.factory;

import org.train.compositepatterns.domain.*;

public class GunFactory extends AbstractGunFactory {
    @Override
    public Shooting createAssaultWeapon() {
        return new MachineGun();
    }

    @Override
    public Shooting createDoomShootGun() {
        return new ShootGun();
    }

    @Override
    public Shooting createToyGun() {
        return new ToyGunAdapter(new ToyGun());
    }
}
