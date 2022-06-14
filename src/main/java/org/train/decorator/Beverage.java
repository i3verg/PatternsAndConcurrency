package org.train.decorator;

public abstract class Beverage {
    public enum Size {TAll,GRANDE, SMALL};

    Size size = Size.TAll;
    String desc = "Unknown beverage";


    public String getDesc() {
        return desc;
    }

    public abstract int cost();

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
