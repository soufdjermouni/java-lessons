package com.lessons.visibilité.otherpackge;

import com.lessons.visibilité.TestVisibility;

public class OtherPackage {

    void testVisibility (){

        TestVisibility test = new TestVisibility();
        System.out.println( test.attr1 );   // Tout le monde a accès à un membre public.
        //System.out.println( test.attr2 );   // KO, 'attr2' has protected access in 'com.lessons.visibilité.TestVisibility'
        // System.out.println( test.attr3 );   // pas dans le même package => KO.
        //System.out.println( test.attr4 ); // Pas possible, car privé.

    }
}
