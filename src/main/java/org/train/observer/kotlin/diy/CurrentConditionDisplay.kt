package org.train.observer.kotlin.diy

class CurrentConditionDisplay(private val subjectData: SubjectK) : ObserverK, DisplayInfoK {
    init {
        subjectData.registerObserver(this)
    }

    private var temperature = 0
    private var pressure = 0

    override fun display() {
        println("Current conditions: $temperature celcius and pressure is: $pressure")
    }

    override fun update(temp: Int, pressure: Int) {
        this.temperature = temp
        this.pressure = pressure
        display();
    }
}