package org.train.observer.kotlin.diy

import java.util.function.Consumer

open class WeatherDataK(private val observers: ArrayList<ObserverK> = ArrayList()) : SubjectK {


    private var changed: Boolean = false
    private var temperature: Int = 0
    private var pressure: Int = 0


    override fun registerObserver(observerK: ObserverK) {
        observers.add(observerK)
    }

    override fun removeObserver(observerK: ObserverK) {
        observers.remove(observerK)
    }

    override fun notifyObserver() {
        if (changed) {
            observers.forEach(Consumer { observer: ObserverK -> observer.update(temperature, pressure) })
        }
        changed = false
    }

    private fun measurementsChanged() {
        setChanged(true)
        notifyObserver()
    }

    fun setMeasurements(temp: Int, pres: Int) {
        temperature = temp
        pressure = pres
        measurementsChanged()
    }

    fun setChanged(value: Boolean) {
        changed = value
    }
}