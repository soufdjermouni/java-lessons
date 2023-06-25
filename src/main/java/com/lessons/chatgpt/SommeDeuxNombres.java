package com.lessons.chatgpt;

import java.util.Scanner;

public class SommeDeuxNombres {

    public static void main(String[] args){
        Scanner clavier = new Scanner(System.in); //on instancie un objet Scanner pour lire l'entrée clavier
        System.out.print("Entrez le premier nombre: ");
        int nombre1 = clavier.nextInt(); //on lit le premier nombre entré par l'utilisateur
        System.out.print("Entrez le deuxième nombre: ");
        int nombre2 = clavier.nextInt(); //on lit le deuxième nombre entré par l'utilisateur
        int somme = nombre1 + nombre2; //on calcule la somme des deux nombres
        System.out.print("La somme de " + nombre1 + " et " + nombre2 + " est: " + somme); //on affiche la somme
    }
}
