package org.train.observer.kotlin.diy

fun main() {
    //val weatherData = WeatherDataK()
    val wdt = WeatherData()
    /*var currentConditionDisplay = CurrentConditionDisplay(weatherData);
    var heatCondition = HeatIndexDisplay(weatherData)
    val testConDisp = TestConditionsDisplay(wdt)


    //weatherData.setMeasurements(25, 50)
    //weatherData.setMeasurements(33,750)
    println("______________________________________")
    //weatherData.setMeasurements(15,15)
    wdt.setMeasurements(10, 10, 10)
    wdt.setMeasurements(25, 25, 25)*/

    val foreCastDisplay = ForeCastDisplay(wdt)
    wdt.setMeasurements(12,12,12)


}