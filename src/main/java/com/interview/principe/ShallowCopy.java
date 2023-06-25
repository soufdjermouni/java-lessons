package com.interview.principe;

import java.util.Arrays;
import java.util.LinkedList;

public class ShallowCopy {

    public static void main(String[] args) {

        LinkedList<Integer> originalList = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<Integer> shallowCopy = (LinkedList<Integer>) originalList.clone();
        // Vérifier que les deux listes contiennent les mêmes éléments
        System.out.println("originalList: " + originalList); // [1, 2, 3]
        System.out.println("shallowCopy: " + shallowCopy);   // [1, 2, 3]

        //supprimer un elemenet
        originalList.remove(0);
        System.out.println("Apres suppression d'un element ...");
        System.out.println("originalList: " + originalList); // [ 2, 3]
        System.out.println("shallowCopy: " + shallowCopy);   // [1, 2, 3]

    }



}
