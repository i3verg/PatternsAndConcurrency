package org.train.compositepatterns.factory;

import org.train.compositepatterns.domain.*;

public class GunFactory extends AbstractGunFactory {
    @Override
    public Shootable createAssaultWeapon() {
        return new MachineGun();
    }

    @Override
    public Shootable createDoomShootGun() {
        return new ShootGun();
    }

    @Override
    public Shootable createToyGun() {
        return new ToyGunAdapter(new ToyGun());
    }
}
