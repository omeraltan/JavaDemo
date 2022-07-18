package com.omer.collections;

class Moof {
    private int moofValue;
    Moof(int val){
        moofValue = val;
    }
    public int getMoofValue(){
        return moofValue;
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Moof) && ((Moof)o).getMoofValue() == this.moofValue){
            return true;
        }else {
            return false;
        }
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Moof one = new Moof(8);
        Moof two = new Moof(8);
        if (one.equals(two)){
            System.out.println("one of two are equal");
        }
    }
}
