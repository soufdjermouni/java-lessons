package com.interview.list;

import java.util.ArrayList;
import java.util.List;

public class ListObject {

    public static void main(String[] args) {

        List obj = new ArrayList();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add(1, "D");

        // Output will be [A, D, B, C] as the add method adds the characters A, B, C to the ArrayList and the fourth method adds D at index 1
        // which tends to shift the characters B and C to index 2 and 3.
        System.out.println(obj);
        obj.stream().forEach(System.out::println);
        System.out.println("############");
        obj.forEach(System.out::print);


        Object [] tab = new Object [3];
        tab[0] = 1;
        tab[1] = "a";
        tab[2] = "a";
    }
}
