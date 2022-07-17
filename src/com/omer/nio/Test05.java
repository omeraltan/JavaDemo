package com.omer.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test05 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("test.txt");
        if (Files.exists(path1)){
            Files.createFile(path1);
        }

        Path path2 = Paths.get("src/com/omer/nio/myFile.txt");
        if (Files.exists(path2)){
            Files.createFile(path2);
        }
    }
}
