package org.train.observer.kotlin.diy

import java.util.Observable

class WeatherData : Observable() {
    var temperature = 0
        private set
    var pressure = 0
        private set
    var humidity = 0
        private set

    private fun measureChanged() {
        setChanged()
        notifyObservers()
    }

    fun setMeasurements(temp: Int, press: Int, hum: Int) {
        temperature = temp
        pressure = press
        humidity = hum
        measureChanged()
    }
}