package com.omer.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class RemoveClassFiles extends SimpleFileVisitor<Path> {

    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
        if (file.getFileName().toString().endsWith(".class"))
            Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        RemoveClassFiles dirs = new RemoveClassFiles();
        Files.walkFileTree(Paths.get("/home/src"), dirs);
    }
}
