package org.train.compositepatterns.srv;

import org.train.compositepatterns.domain.Observer;

public interface ShootObservable {
    void registerObserver (Observer observer);
    void notifyObservers();
}
