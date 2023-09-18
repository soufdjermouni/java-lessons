package com.lessons.designpattern.comportemental.adapter;

public class MovableAdapterImpl implements MovableAdapter{
    private Movable luxuryCars;
    @Override
    public double getSpeed() {
        return convertPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
