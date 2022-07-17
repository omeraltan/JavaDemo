package com.omer.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/folder1/folder");
        System.out.println(path1.getClass());
        System.out.println(path1);


    }
}
