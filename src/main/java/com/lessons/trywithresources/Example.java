package com.lessons.trywithresources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The try-with-resources statement is a try statement that declares one or more resources. A resource is an object that
 * must be closed after the program is finished with it. The try-with-resources statement ensures that each resource is
 * closed at the end of the statement.
 * 		 Any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable,
 * 		 can be used as a resource
 */
public class Example {

    public static void main(String[] args) {

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("test.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        //And here's the new super succinct solution using try-with-resources:
        //public final class Scanner implements Iterator<String>, Closeable {  : Scanner implements Closeable
        try (Scanner scanner2 = new Scanner(new File("test.txt"))) {
            while (scanner2.hasNext()) {
                System.out.println(scanner2.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }


    }
}
