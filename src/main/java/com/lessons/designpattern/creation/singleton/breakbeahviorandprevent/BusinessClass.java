package com.lessons.designpattern.creation.singleton.breakbeahviorandprevent;

public class BusinessClass implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
