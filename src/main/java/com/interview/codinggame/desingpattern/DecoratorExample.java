package com.interview.codinggame.desingpattern;


interface Window{
    public void draw();
}
class SimpleWindow implements Window{
    @Override
    public void draw() {
    }
}

abstract class WindowEnhancement implements Window{
    protected Window window;
    public WindowEnhancement(Window window){
        this.window = window;
    }
}
 class ScrollBarEnhancement extends WindowEnhancement {

    public ScrollBarEnhancement(Window window){
        super(window);
    }

     @Override
     public void draw() {
         drawSxrollBars();
         window.draw();
     }

     private void drawSxrollBars() {
     }
 }

public class DecoratorExample {
     public static void main(String[] args) {
        Window w = new ScrollBarEnhancement(new SimpleWindow());
        w.draw();

    }
}
