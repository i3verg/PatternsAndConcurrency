package org.train.observer.java.base;

import org.train.observer.java.base.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
