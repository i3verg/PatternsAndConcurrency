package org.train.compositepatterns.domain;

import org.train.compositepatterns.srv.Observable;

public class ShootGun implements Shootable {

    Observable observable;

    public ShootGun() {
        observable = new Observable(this);
    }

    @Override
    public void shoot() {
        System.out.println("Shoot from shoot gun");
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
