package com.omer.assertions;

public class ReallySimpleAndSimpleAssertions {

    /* Really Simple Assertion */
    private void doStuffX(int x, int y){
        assert (y>x);
        // more code assuming y is greater than x
    }

    /* Simple Assertion */
    private void doStuffY(int x, int y){
        assert (y>x) : "Simple Assertions: y is " + y + " x is " + x ;
        // more code assuming y is greater than x
    }

    public static void main(String[] args) {
        new ReallySimpleAndSimpleAssertions().doStuffX(1,2);
        new ReallySimpleAndSimpleAssertions().doStuffY(2,1);
    }
}
