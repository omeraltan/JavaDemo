package com.omer.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writer3 {
    public static void main(String[] args) {
        byte[] in =  new byte[50];  // bytes, not chars!
        int size = 0;
        FileOutputStream fos = null;
        FileInputStream fis = null;
        File file = new File("fileWriter3.txt");
        try {
            fos = new FileOutputStream(file);   // create a FileOutputStream
            String s = "howdy\nfolks\n";
            fos.write(s.getBytes("UTF-8")); // write characters (bytes) to the files

            fos.flush();    // flush before closing
            fos.close();    // close file before done

            fis = new FileInputStream(file); // create a FileInputStream
            size = fis.read(in);    // read the file into in
            System.out.print(size + " "); // how many bytes read

            for (byte b : in) { // print the array
                System.out.print((char)b);
            }
            fis.close();    // again, always close
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
