package com.omer.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Tes03 {
    public static void main(String[] args) {
        Path path3 = Paths.get("folder","home","zoodirector");
        System.out.println(path3);
        System.out.println(path3.isAbsolute());
        System.out.println(path3.toAbsolutePath());
    }
}
