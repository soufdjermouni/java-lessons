package com.lessons.designpattern.creation.singleton.breakbeahviorandprevent;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakingSingletonOrColonig  {

    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        //how to break beahvior sigleton

        //1- Clone
        LazySingleton inst1 = LazySingleton.getInstance();
        System.out.println(inst1.hashCode());
        LazySingleton inst2 = (LazySingleton) inst1.clone();//we break singleton behavior,voir la soltion
        //dans LazySingleton pour prévenir de ça (clone)
        System.out.println("Clone="+inst2.hashCode());

        //2- Refelxvity
        LazySingleton reflection = null;
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        /*for (Constructor con: constructors){
            con.setAccessible(true);
            reflection = (LazySingleton) con.newInstance();
        }
        System.out.println("reflection="+reflection.hashCode());
        */

        //3- Serilisation/deserilisation
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
        out.writeObject(inst1);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
        LazySingleton instaceTwo = (LazySingleton) in.readObject();//To prevent break beahavior, add methid : readResolve
        System.out.println("deserilisation="+instaceTwo.hashCode());


    }
}
