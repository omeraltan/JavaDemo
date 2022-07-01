package com.omer.api;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder b = new StringBuilder("12");
        b = b.append("3");
        b.reverse();
        System.out.println(b.toString());
        System.out.println("--------------------");
        //StringBuilder sb = new StringBuilder("radical").insert(sb.length(), "robots"); // doesn't compile
        StringBuilder sb = new StringBuilder("radical ");
        //sb = new StringBuilder("radical ").append("robots");
        //sb = new StringBuilder("radical ").delete(1,100).append("obots").insert(1,"adical r");
        //sb = new StringBuilder("radical ").insert(7,"robots");
        sb = new StringBuilder("radical ").insert(sb.length(), "robots");
        System.out.print(sb);
    }
}
