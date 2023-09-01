package com.paradigme.cleancode;

public class P1NombresMagiques {

    public static void main(String[] args) {

        //Bad practice
        for(int i=0; i<50; i++) {
            //do something
        }

        //Good practice
        int NUMBER_OF_STUDENTS = 50;
        for(int i=0; i<NUMBER_OF_STUDENTS; i++) {
            //do something
        }
    }
}
