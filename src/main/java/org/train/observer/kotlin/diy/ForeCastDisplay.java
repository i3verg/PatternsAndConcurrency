package org.train.observer.kotlin.diy;

import org.train.observer.java.base.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForeCastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForeCastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Test conditions:  temp is " + currentPressure);

    }
}
