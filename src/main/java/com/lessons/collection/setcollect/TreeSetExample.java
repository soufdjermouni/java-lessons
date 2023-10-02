package com.lessons.collection.setcollect;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {

    static class A implements Comparable<A> {
        private Integer ordre ;
        public A(Integer ordre){
            this.ordre=ordre;
        }

        @Override
        public int compareTo(A other) {

            if(this.ordre > other.ordre) {
                return 1;
            } else if(this.ordre.equals(other.ordre)) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {

        //si A n'implemente Comparable<A> , nous aurons l'erreur suivante : Construction of sorted collection with non-comparable elements
        TreeSet<A> set = new TreeSet<>();
        set.add(new A(3));
        set.add(new A(5));
        set.add(new A(1));
        System.out.println(set); //1,3,5  dans l'ordre
    }


}
