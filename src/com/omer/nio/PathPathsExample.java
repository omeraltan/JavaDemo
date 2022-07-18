package com.omer.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathPathsExample {
    public static void main(String[] args) {
        Path p1 = Paths.get("/tmp/file1.txt");
        Path p2 = Paths.get("c:\\temp\test");
        Path p3 = Paths.get("/tmp","file1.txt"); // same as p1
        Path p4 = Paths.get("c:", "temp", "test"); // same as p2
        Path p5 = Paths.get("c:\\temp", "test"); // also same as p2
    }
}
