package com.interview.keyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class KeyTransient {

    public static String fileName = "C:\\messages\\tmp\\file-transient.txt";
    public static void main(String[] args) throws Exception {

        Book book = new Book();
        book.setBookName("Java Reference");
        book.setDescription("will not be saved");
        book.setCopies(25);

        //serialize the object into a file
        serialize(book);

        //deserialize the object now from the file:
        Book book1 = deserialize();


        //Here we see that bookName has been properly persisted. On the other hand, the copies field
        // has value 0 and the description is null
        // – the default values for their respective data types – instead of the original values.
        System.out.println(book1.getBookName());  //Java Reference
        System.out.println(book1.getDescription()); //null
        System.out.println(book1.getCopies());//0
        System.out.println(book1.getBookCategory());//Fiction
        System.out.println(book1.getBookCategoryNewOperator());//null
    }

    public static void serialize(Book book) throws Exception {
        FileOutputStream file = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(book);
        out.close();
        file.close();
    }

    public static Book deserialize() throws Exception {
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(file);
        Book book = (Book) in.readObject();
        in.close();
        file.close();
        return book;
    }
}
