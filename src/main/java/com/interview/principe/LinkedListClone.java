package com.interview.principe;

import java.util.LinkedList;

/**
 * The Java.util.LinkedList.clone() method is used to create a shallow copy of the mentioned linked list. It just
 * creates a copy of the list.
 */
public class LinkedListClone {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");

        System.out.println("First LinkedList:" + list);

        LinkedList sec_list = new LinkedList();
        sec_list = (LinkedList) list.clone();
        System.out.println("Second LinkedList is:" + sec_list);

        System.out.println("First LinkedList afterupdate:" + list.toString());
        System.out.println("Second LinkedList afterupdate is:" + sec_list.toString());
    }
}
