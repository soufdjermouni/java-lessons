package com.lessons.designpattern.creation.factory;

public class USDollar implements Currency{
    @Override
    public String getSymbol() {
        return "USD";
    }
}
