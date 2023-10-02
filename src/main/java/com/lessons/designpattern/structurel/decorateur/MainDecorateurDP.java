package com.lessons.designpattern.structurel.decorateur;

public class MainDecorateurDP {

    public static void main(String[] args) {
        // Créer une fenêtre de base
        Window simpleWindow = new SimpleWindow();
        System.out.println("Description de la fenêtre de base : " + simpleWindow.getDescription());

        // Decorateur : Ajouter une bordure à la fenêtre
        Window windowWithBorder = new BorderDecorator(simpleWindow);
        System.out.println("Description de la fenêtre avec bordure : " + windowWithBorder.getDescription());

        // Decorateur : Ajouter une barre de défilement à la fenêtre
        Window windowWithScrollBar = new ScrollBarDecorator(simpleWindow);
        System.out.println("Description de la fenêtre avec barre de défilement : " + windowWithScrollBar.getDescription());
    }
}
