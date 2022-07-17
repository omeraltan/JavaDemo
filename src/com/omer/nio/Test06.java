package com.omer.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test06 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("folder");

        if (!Files.exists(path1)){
            Files.createDirectory(path1);
        }

        Path path2 = Paths.get("dir1/dir2");
        if (!Files.exists(path2)){
            //Files.createDirectory(path2);
            Files.createDirectories(path2);
        }
    }
}
