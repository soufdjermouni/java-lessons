package com.lessons.lombok;

public class StartLombok {

    public static void main(String[] args) {
        //privéliger la classe record dans ce cas
        ImmuableObjectLombok iol = new ImmuableObjectLombok();
        System.out.println(iol.getRed());


        ImmuableObjectLombokAccessLevel iolal = new ImmuableObjectLombokAccessLevel();
        //System.out.println(iolal.getRed()); //java: cannot find symbol       symbol:   method getRed()
    }
}
