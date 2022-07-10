package com.omer.assertions;

public class LegalAndIllegalAssertions {
    public static void main(String[] args) {

    }

    void noReturn(){}
    int aReturn(){return 1;}
    void go(){
        int x = 1;
        boolean b = true;
        //legal assert:
        assert (x == 1);
        assert (b);
        assert true;
        assert (x == 1) : x ;
        assert (x == 1) : aReturn();
        //illegal assert:
        //assert (x = 1);
        //assert (x);
        //assert 0;
        //assert (x == 1) : ;
        //assert (x == 1) : noReturn();
    }

    public void doStuff(int x){
        assert ( x > 0 ); // inappropriate!
    }

    private void doMore(int x){
        assert ( x > 0 ); // appropriate
    }
}
