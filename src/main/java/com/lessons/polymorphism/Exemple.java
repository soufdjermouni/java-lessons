package com.lessons.polymorphism;

class Animal {
    public void faireDesBruits() {
        System.out.println("Je fais des bruits d'animal !");
    }
}

class Chien extends Animal {
    @Override
    public void faireDesBruits() {
        System.out.println("J'aboie !");
    }
}

class Chat extends Animal {
    @Override
    public void faireDesBruits() {
        System.out.println("Je miaule !");
    }
}

public class Exemple {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Chien();
        Animal animal3 = new Chat();

        animal1.faireDesBruits(); // affiche "Je fais des bruits d'animal !"
        animal2.faireDesBruits(); // affiche "J'aboie !"
        animal3.faireDesBruits(); // affiche "Je miaule !"
    }
}
