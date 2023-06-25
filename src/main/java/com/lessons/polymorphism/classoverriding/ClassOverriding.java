package com.lessons.polymorphism.classoverriding;

/**
 * The most common use-case of overriding is when we want to change the implementation of a method in a child class.
 */
public class ClassOverriding {

    public static void main(String[] args) {

        //Since FastCar class extends Car class, if we did not override the playSound(), the result when running
        // this: Playing car.mp3..
        Car fastCar = new FastCar();
        fastCar.playSound();//Playing fastCar.mp3...

        //@Override' not applicable to field : will print 200, which has been assigned as the value in the parent class.
        System.out.println(fastCar.maxSpeed); //200

        FastCar fastCar1 = new FastCar();
        System.out.println(fastCar1.maxSpeed);//350

    }
}
