package org.train.compositepatterns.srv;

import org.train.compositepatterns.domain.Observer;

public interface ShootingObservable {
    void registerObserver (Observer observer);
    void notifyObservers();
}
