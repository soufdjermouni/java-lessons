package com.lessons.encapsulation;

/**
 * L'encapsulation consiste à cacher l'état interne d'un objet et d'imposer de passer par des méthodes permettant
 * un accès sécurisé à l'état de l'objet. Pour mettre en oeuvre l'encapsulation, la première étape consiste
 * à privatiser les attributs. Pour ce faire, un mot clé spécial vous est proposé : private.
 */
public class Rational {
    private int numerator;
    private int denominator;

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
}
