package com.codinggame.desingpattern;

/**
 * Singleton
 * Singleton Pattern
 */
public class SingletonExample {

    private SingletonExample(){}

    //classe interne
    private static class AHolder{
        private static final SingletonExample INSTANCE = new SingletonExample();
    }

    public static SingletonExample getInstance(){
        return AHolder.INSTANCE;
    }

}
