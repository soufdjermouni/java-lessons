package com.katacode;

public class Kata6ReferenceVsValue {

    public static void main(String[] args) {

        int i = 0; // type prémitif, à chaque fois c'est une nouvelle valeur
        String s = "s"; // Objet immuable, sa valeur ne change pas
        MyObjet o = new MyObjet(); // C'est une référence vers le m^mee objet déjà initialisé; docn modifiable partour dans le code
        o.i = 0;
        increment(i, s, o);
        System.out.println(i +" " + s + " " +o.i);//0 s 1

        increment(i, s, o);
        System.out.println(i +" " + s + " " +o.i);//0 s 2

        increment(i, s, o);
        System.out.println(i +" " + s + " " +o.i);//0 s 3
    }

    private static void increment(int i, String s, MyObjet o) {
        i++; // i c'est une type prémitif, donc une nouvelle valeur
        s+="y"; // le String s est un nouvel objet
        o.i++;  // C'est une référence vers le m^mee objet déjà initialisé
    }

}
class MyObjet{
    int i;

}