package org.train.compositepatterns.domain;

import org.train.compositepatterns.srv.Observable;
import org.train.compositepatterns.srv.ShootObservable;

public class ToyGunAdapter implements Shootable {
    ToyGun toyGun;
    ShootObservable observable;

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
