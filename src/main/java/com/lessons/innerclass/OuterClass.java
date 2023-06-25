package com.lessons.innerclass;

public class OuterClass {

    private String str = "Hello, world!";
    class InnerClass{
        public InnerClass (){
            System.out.println(str);// une instance de la classe interne (inner class) peut accéder aux membres privés
            // de la classe externe (outer class), y compris les variables d'instance privées
        }
    }
}

