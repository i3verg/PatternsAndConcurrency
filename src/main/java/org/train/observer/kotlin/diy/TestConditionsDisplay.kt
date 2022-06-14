package org.train.observer.kotlin.diy

import java.util.*

class TestConditionsDisplay(obse: Observable) : Observer, DisplayInfoK {
    init {
        obse.addObserver(this)
    }
    private var temperature = 0
    private var pressure = 0

    override fun update(obs: Observable?, arg: Any?) {
        if (obs is WeatherData) {
            val weatherData: WeatherData = obs
            this.temperature = weatherData.temperature
            this.pressure = weatherData.pressure
            display()
        }
    }
    override fun display() {
        println("Test conditions:  temp is $temperature, pressure is $pressure")
    }

}