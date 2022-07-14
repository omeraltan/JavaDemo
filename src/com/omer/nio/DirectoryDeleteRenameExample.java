package com.omer.nio;

import java.io.File;
import java.io.IOException;

public class DirectoryDeleteRenameExample {
    public static void main(String[] args) throws IOException {
        File delDir = new File("deldir"); //make a directory
        delDir.mkdir();

        File delFile1 = new File(delDir, "delFile1.txt"); // add file to directory
        delFile1.createNewFile();

        File delFile2 = new File(delDir, "delFile2.txt"); // add file to directory
        delFile2.createNewFile();
        delFile1.delete();  // delete a file
        System.out.println("delDir is " + delDir.delete()); // attempt to delete the directory

        File newName = new File(delDir, "newName.txt"); // a new object
        delFile2.renameTo(newName); // rename file

        File newDir = new File("newDir"); // rename directory
        delDir.renameTo(newDir);
    }
}
