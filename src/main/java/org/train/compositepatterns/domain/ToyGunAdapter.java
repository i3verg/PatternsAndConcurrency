package org.train.compositepatterns.domain;

public class ToyGunAdapter implements Shooting {
    ToyGun toyGun;

    public ToyGunAdapter(ToyGun toyGun) {
        this.toyGun = toyGun;
    }

    @Override
    public void shoot() {
        toyGun.piu();
    }
}
