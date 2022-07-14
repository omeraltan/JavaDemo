package com.omer.nio;

import java.io.*;

public class DirectoryExample {
    public static void main(String[] args) throws IOException {
        File existingDir = new File("existingDir");
        existingDir.mkdir();
        System.out.println(existingDir.isDirectory());

        File existingDirFile = new File(existingDir, "existingDirFile.txt");
        existingDirFile.createNewFile();
        System.out.println(existingDirFile.isFile());

        FileReader fr = new FileReader(existingDirFile);
        BufferedReader br = new BufferedReader(fr);

        String s;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
        br.close();
    }
}
