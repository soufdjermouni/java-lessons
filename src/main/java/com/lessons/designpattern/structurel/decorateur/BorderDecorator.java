package com.lessons.designpattern.structurel.decorateur;

// Exemple de décorateur : ajout d'une bordure
public class BorderDecorator extends WindowDecorator {
    public BorderDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }

    public void draw() {
        super.draw();
        // Ajouter une bordure
    }

    public String getDescription() {
        return super.getDescription() + ", avec bordure";
    }
}
