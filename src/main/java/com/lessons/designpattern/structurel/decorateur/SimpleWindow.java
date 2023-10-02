package com.lessons.designpattern.structurel.decorateur;

public class SimpleWindow implements Window {
    @Override
    public void draw() {
        // Implémentation de dessin de la fenêtre simple
    }

    @Override
    public String getDescription() {
        return  "Fenêtre simple";
    }
}
