package com.interview.math;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;

public class MathAbsExample {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        System.out.println(clavier.nextLine());

        System.out.print("Entrez le premier nombre: ");
        int taille = clavier.nextInt();
        int [] ts = new int [taille];
        for (int i = 0; i < taille; i++) {
            ts[i] = clavier.nextInt();
        }

        System.out.println(computeClosestToZero(ts));
    }

    private static int computeClosestToZero(int[] ts) {

        if(null == ts || ts.length ==0){
            return 0;
        }
        int result = ts[0];
        for (int i = 1; i < ts.length; i++) {
           /* if(Math.abs(ts[i]) < result) {
                result = ts[i];
            } */

            if (Math.abs(ts[i]) < Math.abs(result) || (Math.abs(ts[i]) == Math.abs(result) && ts[i] > result)    ) {
                result = ts[i];
            }
        }
        return result;
    }
}
