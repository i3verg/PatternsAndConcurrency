package org.train.observer.kotlin.diy

class HeatIndexDisplay(private val subjectK: SubjectK): ObserverK, DisplayInfoK {
    init {
        subjectK.registerObserver(this)
    }

    private var heatIndex = ""

    override fun display() {
        println("Current HEAT index is  $heatIndex")
    }

    override fun update(temp: Int, pressure: Int) {
        this.heatIndex = (temp + pressure).toString()
        display()
    }
}