package com.lessons.designpattern.structurel.decorateur;

// Exemple de décorateur : ajout d'une barre de défilement
public class ScrollBarDecorator extends WindowDecorator {
    public ScrollBarDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }

    public void draw() {
        super.draw();
        // Ajouter une barre de défilement
    }

    public String getDescription() {
        return super.getDescription() + ", avec barre de défilement";
    }
}
