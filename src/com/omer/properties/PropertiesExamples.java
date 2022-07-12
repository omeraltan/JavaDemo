package com.omer.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExamples {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("k1", "v1");
        p.setProperty("k2", "v2");
        p.list(System.out);
        try {
            FileOutputStream out = new FileOutputStream("test.properties");
            p.store(out, "test-comment");
            out.close();
        }catch (IOException e){
            System.out.println("exc 1");
        }
    }
}
