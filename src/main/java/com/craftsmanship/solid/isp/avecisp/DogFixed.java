package com.craftsmanship.solid.isp.avecisp;

public class DogFixed implements Edible,Soundable {
    @Override
    public void eat() {
        System.out.println("I'm eating!");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
