package com.lessons.collection;

import java.util.HashMap;

public class HashMapObjectExampleImmutable {

    public static void main(String[] args) {
        HashMap m = new HashMap();
        Object o1 = new Object();
        Object o2= o1;
        m.put(o1,1);
        m.put(o2,2);

        System.out.println(m.get(o1)); //2
        System.out.println(m.size()); //1
    }
}
