package com.omer.test;
// What is the output if this class is run with java Indexing cars carts?
public class Indexing {
    public static void main(String[] books) {
        StringBuilder sb = new StringBuilder();
        for (String book : books){
            sb.insert(sb.indexOf("c"), book);
        }
        System.out.println(sb);
    }
}
