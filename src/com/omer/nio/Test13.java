package com.omer.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class Test13 {

    public static void main(String[] args) throws IOException {

        BiPredicate<Path, BasicFileAttributes> matcher = (path, attribute) -> attribute.isRegularFile() && path.toString().endsWith("class");

        try (Stream<Path> stream = Files.find(Paths.get("."), 5, matcher)){
            stream.forEach(System.out::println);
        }
    }
}
