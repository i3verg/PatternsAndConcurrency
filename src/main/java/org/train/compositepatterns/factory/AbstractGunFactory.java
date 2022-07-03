package org.train.compositepatterns.factory;

import org.train.compositepatterns.domain.Shooting;

public abstract class AbstractGunFactory {
    public abstract Shooting createAssaultWeapon();
    public abstract Shooting createDoomShootGun();
    public abstract Shooting createToyGun();

}