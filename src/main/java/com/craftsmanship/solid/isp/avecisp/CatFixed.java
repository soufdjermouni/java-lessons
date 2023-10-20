package com.craftsmanship.solid.isp.avecisp;

public class CatFixed implements Soundable, Edible{
    @Override
    public void eat() {
        System.out.println("I'm eating!");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
