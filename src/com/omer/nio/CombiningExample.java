package com.omer.nio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CombiningExample {
    public static void main(String[] args) throws IOException {
        File file = new File("fileWriter4.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("howdy");
        pw.println("folks");
    }
}
