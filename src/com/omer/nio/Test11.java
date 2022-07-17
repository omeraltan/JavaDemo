package com.omer.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test11 {
    public static void main(String[] args) throws IOException {
        try (Stream<Path> entries = Files.list(Paths.get("."))){
            //entries.forEach(System.out::println);
            //entries.forEach(p -> System.out.println(p.getFileName()));
            entries.forEach(p -> System.out.println(p.toAbsolutePath().normalize()));

        }
    }
}
