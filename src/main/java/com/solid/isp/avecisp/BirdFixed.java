package com.solid.isp.avecisp;

public class BirdFixed implements Soundable, Edible, Flyable{
    @Override
    public void eat() {
        System.out.println("I'm eating!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet!");
    }
}
