package com.omer.exceptions;

import java.io.Closeable;
import java.io.IOException;

public class ClosableExample {
    class Lamb implements Closeable{

        @Override
        public void close() {
            throw new RuntimeException("a");
        }
    }

    public static void main(String[] args) {
        new ClosableExample().run();
    }

    public void run(){
        try (Lamb l = new Lamb();){
            throw new IOException();
        }catch (Exception e){
            throw new RuntimeException("c");
        }
    }
}
