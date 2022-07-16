package com.omer.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamExample2 {
    public static void main(String[] args) throws IOException {
        /*
         * The DirectoryStream interface lets you iterate through a directory.
         * But this is just the tip of the iceberg.
         * Let’s say we have hundreds of users and each day we want to only report on a few of them.
         * The first day, we only want the home directories of users whose names begin with either the letter v or the letter w.
         * */
        Path dir = Paths.get("/users");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "[vw]*")){
            for (Path path : stream) {
                System.out.println(path.getFileName());
            }
        }
    }
}
