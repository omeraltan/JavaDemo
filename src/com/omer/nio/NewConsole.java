package com.omer.nio;

import java.io.Console;

class MyUtility{
    String doStuff(String arg1){
        //stub code
        return "result is " + arg1;
    }
}

public class NewConsole {
    public static void main(String[] args) {
        String name = "";
        Console c = System.console();
        char[] pw;
        pw = c.readPassword("%s", "pw: ");
        for (char ch: pw) {
            c.format("%c", ch);
        }
        c.format("\n");

        MyUtility mu = new MyUtility();
        while (true){
            name = c.readLine("%s", "input?: ");
            c.format("output: %s \n", mu.doStuff(name));
        }
    }
}
