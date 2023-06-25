package com.lessons.polymorphism.classoverriding;

// Si on supprime extends Car, on aura l'erreur :  Method does not override method from its superclass
public class FastCar extends Car {

    protected final int speed = 350;
    @Override
    protected void playSound(){
        System.out.println("Playing fastCar.mp3...");
    }

}
