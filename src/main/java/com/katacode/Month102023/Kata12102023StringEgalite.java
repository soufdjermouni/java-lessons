package com.katacode.Month102023;

public class Kata12102023StringEgalite {
    public static void main(String[] args) {

        Integer int1 = Integer.valueOf(1);
        Integer int2 = Integer.valueOf(1);
        System.out.print((int1==int2) + " ");//true

        String m1 = "Hello";
        String m2 = "Hello";
        String m3 = new String("Hello");
        System.out.print((m1==m2) + " "); // true, car les deux références pointent vers le même objet en pool de chaînes
        System.out.print((m1.equals(m2)) + " ");//true
        System.out.print((m1==m3) + " "); // false
        System.out.println("###############################");

        //Pour comparer le contenu de deux chaînes String, vous devez utiliser la méthode equals() :
        System.out.print((m1.equals(m3)) + " "); // true



    }
}
