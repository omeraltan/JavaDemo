package com.omer.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.*;

public class EasyWay {
    public static void main(String[] args) throws IOException {
        ZonedDateTime janFistDateTime = ZonedDateTime.of(LocalDate.of(2017,1,1), LocalTime.of(10,0), ZoneId.of("US/Pacific")); // create a date
        Instant januaryFirst = janFistDateTime.toInstant();

        // old way
        File file = new File("c://temp/file");
        file.createNewFile(); // create the file
        file.setLastModified(januaryFirst.getEpochSecond()*1000); // set time
        System.out.println(file.lastModified()); // get time
        file.delete();  // delete the file

        // new way
        Path path = Paths.get("c://temp/file2");
        Files.createFile(path); // create another file
        FileTime fileTime = FileTime.fromMillis(januaryFirst.getEpochSecond()*1000); // convert to the new FileTime object
        Files.setLastModifiedTime(path, fileTime); // set time
        System.out.println(Files.getLastModifiedTime(path)); // get time
        Files.delete(path);

        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));

        BasicFileAttributes basic = Files.readAttributes(path,BasicFileAttributes.class);
        System.out.println("create: " + basic.creationTime());
        System.out.println("access: " + basic.lastAccessTime());
        System.out.println("modify: " + basic.lastModifiedTime());
        System.out.println("directory: " + basic.isDirectory());

    }
}
