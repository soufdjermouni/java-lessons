package com.lessons.interfacefonctionnelle.consumer;

import com.lessons.interfacefonctionnelle.consumer.myconsumer.Consumer;

public class PlayWithConsumer {

    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println("c1= "+s);
        Consumer<String> c2 = s -> System.out.println("c2= "+s);

        Consumer<String> c3 = s -> {
            c1.accept(s);
            c2.accept(s);
        };
        c3.accept("Bonjour"); //c1= Bonjour
                                //c2= Bonjour

        System.out.println("----------");
        //Avec le code ci-dessous : c1 c'est consumer dans la methode andThen (this) , ce consumer c2 , c'est le paramètre
        Consumer<String> c4 = c1.andThen(c2);
        c4.accept("Hello");

        Consumer<String> c5= c1.andThen(null);
        c5.accept("Hello");
    }
}
