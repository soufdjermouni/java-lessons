package com.lessons.interfacefonctionnelle.examples;

@FunctionalInterface
public interface Calculateur {

    //'une seule méthode abstraite,
    int calculer(int a, int b);
}
