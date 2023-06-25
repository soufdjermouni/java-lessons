package com.interview.algorithm;

import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez premier nombre : ");
        int x= input.nextInt();

        System.out.println("Entrez deuxième nombre : ");
        int y= input.nextInt();

        int sum = x+y;
        System.out.println("La somme de " + x + " et " + y + " est :" + sum);

    }
}
