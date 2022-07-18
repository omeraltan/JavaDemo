package com.omer.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathPathsExample2 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("/java/source");
        Path path2 = Paths.get("/java/source/directory");
        Path file = Paths.get("/java/source/directory/Program.java");
        Files.createDirectory(path1);
        //Files.createDirectory(path2);
        Files.createDirectories(path2);
        Files.createFile(file);
    }
}
