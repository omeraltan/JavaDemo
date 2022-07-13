package com.omer.nio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer2 {
    public static void main(String[] args) {
        char[] in = new char[50]; // to store input
        int size = 0;
        try {
            File file = new File("fileWriter2.txt"); // just an object
            FileWriter fw = new FileWriter(file); // create an actual file & a fileWriter obj
            fw.write("howdy\nfolks\n"); // write characters to the file
            fw.flush(); // flush before closing
            fw.close(); // close file when done
            FileReader fr = new FileReader(file); // create a fileReader object
            size = fr.read(in); // read the whole file!
            System.out.print(size + " "); // how many characters read
            for (char c : in) { // print the array
                System.out.print(c);
            }
            fr.close(); // again, always close
        }catch (IOException e){

        }
    }
}
