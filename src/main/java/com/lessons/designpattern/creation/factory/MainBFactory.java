package com.lessons.designpattern.creation.factory;

public class MainBFactory {

    public static void main(String[] args) {
        BFactory bf = new BFactory() {
            @Override
            public Babst createB() {
                return new Babst();
            }
        };

    }
}
