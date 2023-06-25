package com.lessons.polymorphism.classoverriding.abstractover;

public abstract class Car {

    protected final int maxSpeed = 200;

    //Abstract methods cannot have a body : it has no implementation.
    abstract protected void playSound();
}
