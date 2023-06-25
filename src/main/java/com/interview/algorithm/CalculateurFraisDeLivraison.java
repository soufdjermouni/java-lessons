package com.interview.algorithm;

import java.util.Scanner;

/**
 * Exercice 1: Calculateur de frais de livraison
 * Énoncé: Vous devez écrire un programme qui calcule les frais de livraison en fonction de la
 * distance et du poids de la commande. Les frais de livraison sont calculés comme suit:
 *
 * Pour les commandes de moins de 2 kg, le coût de livraison est de 5€ + 2€/km.
 * Pour les commandes de 2 kg ou plus, le coût de livraison est de 10€ + 1€/km.
 *
 */
public class CalculateurFraisDeLivraison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double distance = sc.nextDouble();

        double deliveryCost = 0;
        if (weight<2) {
            deliveryCost = 5 + 2 *distance;
        } else {
            deliveryCost = 10 + distance;
        }
    }
}
