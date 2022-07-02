package com.omer.api;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class StringExample {
    public static void secret(String mystery){
        mystery = mystery.replace("1", "8");
        mystery.startsWith("paper");
        String s = mystery.toString();
        System.out.println(s);
    }
    public static void main(String[] args) {
        String b = "12";
        b += "3";
        b.replace("1", "5");// String is immutable :)
        System.out.println(b); // output: 123
        System.out.println("-------------------------------");
        String teams = new String("694");
        teams.concat(" 1155");
        teams.concat(" 2265");
        teams.concat(" 2869");
        System.out.println(teams);
        System.out.println("-------------------------------");
        secret("ÖmerAltan");
        System.out.println("-------------------------------");
        List balloons = new ArrayList();
        balloons.add("ÖMER");
        balloons.add("ALTAN");
        System.out.println(balloons);
        System.out.println("-------------------------------");
        String builder = "54321";
        builder = builder.substring(1);
        System.out.println(builder.charAt(2));
        System.out.println("-------------------------------");
        secret("Mystery Omer");
        System.out.println("-------------------------------");
        /* Which of the following types can pass as a parameter to the replace() method on the String class?*/
        String name = "Ömer ALTAN";
        char charTest = 'a';
        String nameTest = "Ebru";
        StringBuilder sbTest = new StringBuilder("Adil");
        System.out.println(name.replace('e', charTest));
        System.out.println(name.replace('e', nameTest.charAt(3)));
        System.out.println(name.replace('e', sbTest.charAt(2)));
        System.out.println("-------------------------------");

    }
    public static void secret(StringBuilder mystery){
        char ch = mystery.charAt(3);
        mystery = mystery.insert(1, "more");
        int num = mystery.length();
    }
}
