package com.interview.algorithm.forme;

/** Class 'SquareShape' must either be declared abstract or implement abstract
 * method 'height()' in 'Shape'
 */
public class SquareShape extends Shape{
    private final int size;

    public SquareShape(int size){
        super(); //Call to 'super()' must be first statement in constructor body
        this.size=size;
    }
    @Override
    protected int height() {
        return size;
    }

    @Override
    protected int width() {
        return size;
    }
}