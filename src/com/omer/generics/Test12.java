package com.omer.generics;

public class Test12 {
    public static void main(String[] args) {
        boundedType(100);
        boundedType(100.05);
        // T extends Number -> T type subclass to Number
        // boundedType("compile error"); //String IS-A Number (not)
        unboundedType(100);
        unboundedType("key");
    }
    // Bounded Type Parameter
    public static <T extends Number> void  boundedType(T t){
        System.out.println(t.getClass());
    }

    public static <T> void  unboundedType(T t){
        System.out.println(t.getClass());
    }

}
