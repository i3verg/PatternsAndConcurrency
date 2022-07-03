package org.train.compositepatterns.factory;

import org.train.compositepatterns.domain.*;

public class CountingShootingFactory extends AbstractGunFactory{
    @Override
    public Shootable createAssaultWeapon() {
        return new ShootCounter(new MachineGun());
    }

    @Override
    public Shootable createDoomShootGun() {
        return new ShootCounter(new ShootGun());
    }

    @Override
    public Shootable createToyGun() {
        return new ShootCounter(new ToyGunAdapter(new ToyGun()));
    }
}
