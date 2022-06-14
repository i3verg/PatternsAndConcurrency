package org.train.observer.kotlin.diy

interface SubjectK {
    fun registerObserver(observerK: ObserverK)
    fun removeObserver(observerK: ObserverK)
    fun notifyObserver()
}