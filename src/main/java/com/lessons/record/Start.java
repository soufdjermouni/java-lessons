package com.lessons.record;

public class Start {
    public static void main(String[] args) {

        // objet immuable ancienne façon
        PointOld pos = new PointOld(10,10);
        System.out.println(pos.toString());
        System.out.println(pos.getX());

        // objet immuable nouvelle façon JAVA >=15
        Point pt = new Point(4,4);
        System.out.println(pt.toString());
        System.out.println(pt.x());

    }
}
