package com.interview.algorithm.forme;

public class ShapeMain {

    public static void main(String[] args) {

        //new Shape() : 'Shape' is abstract; cannot be instantiated
        Shape shape = new SquareShape(10);
        System.out.println(shape.getShapewidth()+", "+shape.getShapeHeight());//0, 0
    }
}
