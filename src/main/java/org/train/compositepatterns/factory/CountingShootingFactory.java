package org.train.compositepatterns.factory;

import org.train.compositepatterns.domain.*;

public class CountingShootingFactory extends AbstractGunFactory{
    @Override
    public Shooting createAssaultWeapon() {
        return new ShootCounter(new MachineGun());
    }

    @Override
    public Shooting createDoomShootGun() {
        return new ShootCounter(new Shootgun());
    }

    @Override
    public Shooting createToyGun() {
        return new ShootCounter(new ToyGunAdapter(new ToyGun()));
    }
}
