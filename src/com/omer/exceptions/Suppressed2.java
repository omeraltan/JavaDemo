package com.omer.exceptions;

import java.io.IOException;

class Bad implements AutoCloseable{
    String name;
    Bad(String n){
        name = n;
    }
    @Override
    public void close() throws Exception {
        throw  new IOException("Closing - " + name);
    }
}
public class Suppressed2 {
    public static void main(String[] args) {
        try(Bad b1 = new Bad("1"); Bad b2 = new Bad("2")) {
            // do stuff
        }catch (Exception e){
            System.err.println(e.getMessage());
            for (Throwable t : e.getSuppressed()){
                System.err.println("suppressed: " + t);
            }
        }
    }
}
