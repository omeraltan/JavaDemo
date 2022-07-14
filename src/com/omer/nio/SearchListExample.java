package com.omer.nio;

import java.io.File;

public class SearchListExample {
    public static void main(String[] args) {
        String[] files = new String[100];
        File search = new File("searchThis");
        files = search.list();

        for (String fn : files) {
            System.out.println("found " + fn);
        }
    }
}
