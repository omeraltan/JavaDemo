package com.omer.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test09 {
    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("myfolder");

        if (!Files.exists(p1)){
            Files.createDirectory(p1);
        }

        Path p2 = Paths.get("renameFolder");
        Files.move(p1,p2);
    }
}
