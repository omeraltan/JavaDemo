package com.omer.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyingMovingDeletingFiles {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("/temp/test1.txt");
        Path target = Paths.get("/temp/test2.txt");
        Files.copy(source,target);
        Files.delete(target);
        Files.move(source, target);
    }
}
