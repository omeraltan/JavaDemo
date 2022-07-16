package com.omer.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamExample {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("/users"); // for MAC
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            for (Path path: stream) {
                System.out.println(path.getFileName());
            }
        }
    }
}
