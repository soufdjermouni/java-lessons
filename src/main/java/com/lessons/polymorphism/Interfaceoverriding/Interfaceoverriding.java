package com.lessons.polymorphism.Interfaceoverriding;

public class Interfaceoverriding {

    public static void main(String[] args) {

        //We create a new Square object with Drawable as type, so when we call the printName() or printAreaFormula(),
        // the decision of which implementation of Drawable interface should be used is taken in run-time.
        Drawable square = new Square();
        square.printName();
        square.printAreaFormula();

        Drawable circle = new Circle();
        circle.printName();
        circle.printAreaFormula();
    }
}
