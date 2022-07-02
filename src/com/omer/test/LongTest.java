package com.omer.test;

public class LongTest {
    public static void main(String[] args) {
        long bigNum = 1234;
        //long bigNum2 = 1234.0;
        //long bigNum3 = 1234.0L;
        long bigNum4 = 1234l;
        long bigNum5 = 1234L;
        long bigNum6 = 1_234;
        System.out.println(bigNum);
        //System.out.println(bigNum3);
        System.out.println(bigNum4);
        System.out.println(bigNum5);
        System.out.println(bigNum6);
    }
}
