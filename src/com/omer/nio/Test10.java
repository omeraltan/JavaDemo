package com.omer.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test10 {
    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("buffered.txt");
        try (BufferedWriter bw = Files.newBufferedWriter(p1)){
            bw.write("line1\nline2\nline3");
        }
        try (BufferedReader br = Files.newBufferedReader(p1)){
            String line = null;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        }
    }
}
