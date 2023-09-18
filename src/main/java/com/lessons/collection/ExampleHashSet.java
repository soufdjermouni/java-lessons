package com.lessons.collection;

import java.util.HashSet;

public class ExampleHashSet {

    public static void main(String[] args) {
        HashSet s = new HashSet();
        s.add(Integer.valueOf(1));
        s.add(Integer.valueOf(1));
        s.add(Integer.valueOf(2));

        System.out.println(s.size()); //2


    }
}
