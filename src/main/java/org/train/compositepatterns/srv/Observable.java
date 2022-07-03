package org.train.compositepatterns.srv;

import org.train.compositepatterns.domain.Observer;

import java.util.ArrayList;


public class Observable implements ShootingObservable {
    ArrayList<Observer> shootingObservables = new ArrayList<>();
    ShootingObservable shootingObservable;
    public Observable(ShootingObservable shootingObservable) {
        this.shootingObservable = shootingObservable;
    }

    @Override
    public void registerObserver(Observer observer) {
        shootingObservables.add(observer);
    }

    @Override
    public void notifyObservers() {
        shootingObservables.forEach(el -> el.update(shootingObservable)
        );
    }
}
