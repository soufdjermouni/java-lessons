package com.katacode;

public class Kata5GC {
        protected void finalize(){
            System.out.println("l'objet est nettoyé");
        }

        public static void main(String args[]){
            Kata5GC obj1 = new Kata5GC();
            Kata5GC obj2 = new Kata5GC();
            obj1 = null;
            obj2 = null;
            System.gc();
        }
}
