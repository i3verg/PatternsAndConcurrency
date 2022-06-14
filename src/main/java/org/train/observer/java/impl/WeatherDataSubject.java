package org.train.observer.java.impl;

import org.train.observer.java.base.Observer;
import org.train.observer.java.base.Subject;

import java.util.ArrayList;

public class WeatherDataSubject implements Subject {

    private ArrayList<Observer> observers;
    private int temp;
    private int pressure;

    public WeatherDataSubject() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer obs){
            this.observers.add(obs);
    }

    public void removeObserver(Observer obs){
        this.observers.remove(obs);
    }

    public void notifyObservers(){
        observers.forEach(obs ->obs.update(temp, pressure));
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(int temp, int pressure){
        this.temp = temp;
        this.pressure = pressure;
        measurementsChanged();
    }
}
