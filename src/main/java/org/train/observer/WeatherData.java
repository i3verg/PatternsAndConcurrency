package org.train.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{

    private ArrayList<Observer> observers;
    private int temp;
    private int pressure;

    public WeatherData(ArrayList<Observer> observers) {
        this.observers = observers;
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
