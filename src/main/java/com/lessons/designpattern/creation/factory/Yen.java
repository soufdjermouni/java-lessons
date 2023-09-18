package com.lessons.designpattern.creation.factory;

public class Yen implements Currency{
    @Override
    public String getSymbol() {
        return "JPY";
    }
}
