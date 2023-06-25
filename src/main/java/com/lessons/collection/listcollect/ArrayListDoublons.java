package com.lessons.collection.listcollect;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDoublons {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
        l.add(1);
        l.add(1);
        l.add(1);
        System.out.println(l.size());
    }
}
