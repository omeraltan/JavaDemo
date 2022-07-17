package com.omer.nio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test02 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/folder/folder2/folder3/test.txt");
        System.out.println(path1.getFileName());
        System.out.println(path1.getRoot());
        System.out.println(path1.getParent());
        System.out.println(path1.getNameCount());
        System.out.println(path1.getName(2));
        System.out.println(path1.getClass());
        System.out.println(path1.isAbsolute());
        System.out.println(path1.subpath(1,3));
        System.out.println(path1.getFileSystem());

        File file1 = path1.toFile();
        Path pathToPath = file1.toPath();

    }
}
