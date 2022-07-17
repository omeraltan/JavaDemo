package com.omer.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test04 {
    public static void main(String[] args) {
        Path path = Paths.get("../../test/sub/a/b.txt");
        System.out.println(path.toAbsolutePath());
        System.out.println(path.toAbsolutePath().normalize());
    }
}
