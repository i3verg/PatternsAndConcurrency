package org.train.command.model.receiver;

public class Light {

    String name;
    public Light(String s) {
        this.name = s;
    }

    public void lightOn(){
        System.out.println("Light on!!");
    }

    public void lightOff(){
        System.out.println("Light off!!!");
    }
}
