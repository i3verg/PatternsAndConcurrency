package org.train.compositepatterns.domain;

import org.train.compositepatterns.srv.Observable;

public class MachineGun implements Shootable {

    Observable observable;

    public MachineGun() {
        observable = new Observable(this);
    }

    @Override
    public void shoot() {
        System.out.println("Shoot from Machine gun!!!");
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
