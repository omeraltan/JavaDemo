package com.omer.nio;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateDirectoryExample {
    public static void main(String[] args) throws IOException {
        File myDir = new File("mydir");
        myDir.mkdir();

        File myFile = new File(myDir, "myFile.xtx");
        myFile.createNewFile();

        PrintWriter pw = new PrintWriter(myFile);
        pw.println("new stuff");
        pw.flush();
        pw.close();

    }
}
