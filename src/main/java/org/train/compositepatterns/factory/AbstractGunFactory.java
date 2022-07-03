package org.train.compositepatterns.factory;

import org.train.compositepatterns.domain.Shootable;

public abstract class AbstractGunFactory {
    public abstract Shootable createAssaultWeapon();
    public abstract Shootable createDoomShootGun();
    public abstract Shootable createToyGun();

}