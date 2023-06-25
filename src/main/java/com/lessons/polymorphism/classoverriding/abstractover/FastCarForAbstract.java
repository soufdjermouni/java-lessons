package com.lessons.polymorphism.classoverriding.abstractover;


// Si on supprime extends Car, on aura l'erreur :  Method does not override method from its superclass
public class FastCarForAbstract extends Car {

    public  final int speed = 350;

    //Class 'FastCarForAbstract' must either be declared abstract or implement abstract method 'playSound()' in 'Car'
    @Override
    protected void playSound(){
        System.out.println("Playing fastCar.mp3...");
    }

}
