package com.lessons.designpattern.creation.singleton.breakbeahviorandprevent;

import java.io.Serializable;

public class LazySingleton extends BusinessClass implements Serializable {

    /**
     *  How to prevent breaking singleton : Reflextion
     *
     */
    private LazySingleton(){
        if(instance!=null) {
            throw  new IllegalArgumentException();
        }
    }

    /**
     * How to prevent breaking singleton : clone
     * @return
     * @throws CloneNotSupportedException
     */
   /* @Override
    protected  Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }*/


    /**
     *  How to prevent breaking singleton : Serialisation /deserialisation
     *  The readResolve method is called during deserialization to return the singleton instance
     *
     */
    private Object readResolve () {
        return instance;
    }


    private static LazySingleton instance;

    public static LazySingleton getInstance() {
        if(null == instance) {
           instance = new LazySingleton();
        }
        return instance;
    }
}
