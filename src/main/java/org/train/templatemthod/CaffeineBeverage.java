package org.train.templatemthod;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }
    abstract void brew();
    abstract void addCondiments();

    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void pourInCup(){
        System.out.println("Pouring in cup");
    }

}
