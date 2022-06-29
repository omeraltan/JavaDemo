package com.omer.optional;

class Ship {
    protected int weight = 3;
    private int height = 5;

    public int getWeight(){ return weight; }
    public int getHeight(){ return height; }
}

public class Rcoket extends Ship{
    public int weight = 2;
    public int height = 4;
    public void printDetails(){
        System.out.print(super.weight + " " + super.getHeight());
    }
    public static void main(String[] args) {
        new Rcoket().printDetails();
    }
}
