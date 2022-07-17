package com.omer.collections;

class Bob {
    int shoeSize;
    String nickName;

    public Bob(String nickName, int shoeSize) {
        this.shoeSize = shoeSize;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return ("I am a Bob, but you can call me " + nickName + ". My shoe size is " + shoeSize);
    }
}

public class BobTest {
    public static void main(String[] args) {
        Bob f = new Bob("GoBobGo", 19);
        System.out.println(f);
    }
}
