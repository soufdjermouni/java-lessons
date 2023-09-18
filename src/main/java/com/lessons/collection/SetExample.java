package com.lessons.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * A collection that contains no duplicate elements. More formally, sets contain no pair of elements e1 and e2 such
 * that e1.equals(e2), and at most one null element
 */
public class SetExample {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Toto");
        set.add("Toto");
        set.add(null);
        set.add("toto");
        set.add(null);
        set.add("1");
        System.out.println(set.size()); //4
        System.out.println(set); //[null, toto, Toto, 1]
    }

}
