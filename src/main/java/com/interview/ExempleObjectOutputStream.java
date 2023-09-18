package com.interview;

import java.io.*;

public class ExempleObjectOutputStream {

    public static void main(String[] args) throws IOException {

        File f = new File("C:/datas/tmp/myfile");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        MyObject myObject = new MyObject();
        myObject.setData("Hello, from Soufiane!");
        oos.writeObject(myObject);
        oos.close();
    }
}

class MyObject implements Serializable {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
