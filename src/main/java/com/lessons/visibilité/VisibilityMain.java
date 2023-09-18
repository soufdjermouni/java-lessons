package com.lessons.visibilité;

public class VisibilityMain {
    public static void main(String[] args) {

        TestVisibility test = new TestVisibility();
        System.out.println( test.attr1 );   // Tout le monde a accès à un membre public.
        System.out.println( test.attr2 );   // On est dans le même package => Ok.
        System.out.println( test.attr3 );   // On est dans le même package => Ok.
        //System.out.println( test.attr4 ); // Pas possible, car privé.
    }
}
