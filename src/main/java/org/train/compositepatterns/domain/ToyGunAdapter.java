package org.train.compositepatterns.domain;

import org.train.compositepatterns.srv.Observable;
import org.train.compositepatterns.srv.ShootingObservable;

public class ToyGunAdapter implements Shooting {
    ToyGun toyGun;
    ShootingObservable observable;

    public ToyGunAdapter(ToyGun toyGun) {
        this.toyGun = toyGun;
        observable = new Observable(this);
    }

    @Override
    public void shoot() {
        toyGun.piu();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
