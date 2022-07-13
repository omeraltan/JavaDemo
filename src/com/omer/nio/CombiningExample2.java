package com.omer.nio;

import java.io.*;

public class CombiningExample2 {
    public static void main(String[] args) throws IOException {
        File file = new File("fileWriter4.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String data = br.readLine();
        System.out.println(data);
    }
}
