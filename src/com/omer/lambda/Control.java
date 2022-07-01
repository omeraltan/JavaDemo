package com.omer.lambda;

interface Controllable{
    public boolean isBig(int a, int b);
}

public class Control implements Controllable{
    Controllable control = (a,b) -> a > b;
    boolean result = control.isBig(2, 5);

    public static void main(String[] args) {
        System.out.println(new Control().result);
    }

    @Override
    public boolean isBig(int a, int b) {
        return false;
    }
}
