package org.train.compositepatterns.domain;

public class ShootCounter implements Shooting {
    Shooting weapon;
    static int numberOfShoots;

    public ShootCounter(Shooting weapon) {
        this.weapon = weapon;
    }

    @Override
    public void shoot() {
        weapon.shoot();
        numberOfShoots++;
    }

    public static int getShoots() {
        return numberOfShoots;
    }

    @Override
    public void registerObserver(Observer observer) {

        weapon.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {

        weapon.notifyObservers();
    }
}
