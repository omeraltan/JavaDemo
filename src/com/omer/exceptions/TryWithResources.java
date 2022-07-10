package com.omer.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {

        try (Reader reader = new BufferedReader(new FileReader("Text.file"))){
            assert (reader.read() <= 0) : "Okuma başarısız!";
            reader.read();
        }catch (IOException e){
            throw e;
        }


    }
}
