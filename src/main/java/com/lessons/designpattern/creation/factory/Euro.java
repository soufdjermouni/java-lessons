package com.lessons.designpattern.creation.factory;

public class Euro implements Currency{
    @Override
    public String getSymbol() {
        return "EUR";
    }
}
