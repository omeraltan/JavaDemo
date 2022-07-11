package com.omer.exceptions;

import java.io.IOException;

public class AutoCloseableExample {
    class Lamb2 implements AutoCloseable{

        @Override
        public void close() throws Exception {
            throw new RuntimeException("a");
        }
    }
    public static void main(String[] args) {

    }
    public void run() throws IOException{
        try (Lamb2 l = new Lamb2();){
            throw new IOException();
        }catch (Exception e){
            //throw e;
        }
    }
}
