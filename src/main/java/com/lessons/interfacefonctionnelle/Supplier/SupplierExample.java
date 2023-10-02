package com.lessons.interfacefonctionnelle.Supplier;

import java.util.function.Supplier;

/**
 * @FunctionalInterface
 * public interface Supplier<T> {
 *
 * T get();
 *
 */
public class SupplierExample {

    public static void main(String[] args) {

        //Suplier ou Fournisseur : Créer de nouveaux objets ou retourner des objets existants avec un Supplier
        // uN constructor est une forme de Supplier
        Supplier<String> bonjour =
                () -> "Bonjour";
        System.out.println(bonjour.get());//Bonjour

        Supplier<Double> pi =
                () -> 3.14;  //Math.PI
        System.out.println(pi.get());//3.14
    }
}
