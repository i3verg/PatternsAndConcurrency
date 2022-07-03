package org.train.compositepatterns.srv;

import org.train.compositepatterns.domain.Observer;

import java.util.ArrayList;


public class Observable implements ShootObservable {
    ArrayList<Observer> shootObservables = new ArrayList<>();
    ShootObservable shootObservable;
    public Observable(ShootObservable shootingObservable) {
        this.shootObservable = shootingObservable;
    }

    @Override
    public void registerObserver(Observer observer) {
        shootObservables.add(observer);
    }

    @Override
    public void notifyObservers() {
        shootObservables.forEach(el -> el.update(shootObservable)
        );
    }
}
