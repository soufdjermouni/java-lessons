package com.interview.algorithm.chaine;

/**
 * Écrivez une fonction Java qui prend une chaîne de caractères et un caractère en entrée, et renvoie le nombre
 * d'occurrences du caractère dans la chaîne. Par exemple, si la chaîne est "hello" et le caractère est 'l',
 * la fonction doit renvoyer 2.
 */
public class NbrOccurCharInChaine {
    public static void main(String[] args) {

        System.out.println(countOccurrences("saartagga",'a'));

    }

    public static int countOccurrences(String str, char ch) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                result++;
            }

        }

        return result;
    }
}