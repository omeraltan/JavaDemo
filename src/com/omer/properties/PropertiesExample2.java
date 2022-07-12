package com.omer.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample2 {
    public static void main(String[] args) {
        Properties p = new Properties();
        try {
            FileInputStream in = new FileInputStream("/Users/omeraltan/Desktop/JavaDemo/src/com/omer/properties/test.properties");
            p.load(in);
            p.list(System.out);
            p.setProperty("newProp", "newData");
            p.list(System.out);
            FileOutputStream out = new FileOutputStream("/Users/omeraltan/Desktop/JavaDemo/src/com/omer/properties/test2.properties");
            p.store(out, "myUpdate");
            in.close();
            out.close();
        }catch (IOException e){
            System.out.println("exc 2");
        }
    }
}
