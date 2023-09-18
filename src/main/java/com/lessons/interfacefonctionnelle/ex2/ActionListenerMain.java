package com.lessons.interfacefonctionnelle.ex2;

import java.awt.event.ActionEvent;

public class ActionListenerMain {
    public static void main(String[] args) {

        //Avant
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(String e) {
                System.out.println("Button clicked!");
            }
        };
        listener.actionPerformed("ff");

        //Remplacé par :
        ActionListener listener1 = e -> System.out.println("Button clicked.");
        listener1.actionPerformed("ff");
    }
}
