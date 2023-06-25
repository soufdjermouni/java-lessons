package com.lessons.collection;

import java.util.TreeMap;

/**
 * TreeMap : ordonné , HashMap : non ordoné
 */
public class ExempleTreeMap {

    public static void main(String[] args) {
        TreeMap t = new TreeMap ();
        t.put(2, 3);
        t.put(1, 1);
        t.put(3, 2);

        System.out.println(t.values());  //1 3 2
    }
}
