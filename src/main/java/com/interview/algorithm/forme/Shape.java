package com.interview.algorithm.forme;

import lombok.Getter;

@Getter
public abstract class Shape {

    // without constructor : Variable 'shapewidth' might not have been initialized
    private final int shapewidth;
    private final int shapeHeight;

    public Shape(){
        this.shapewidth= width();
        this.shapeHeight= height();
    }

    protected abstract int height();
    protected abstract int width();
}