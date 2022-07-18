package com.omer.collections;

public class HasHash {

    public int x;

    HasHash(int xVal){
        x = xVal;
    }

    @Override
    public boolean equals(Object o) {
        HasHash h = (HasHash) o;

        if (h.x == this.x){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (x*17);
    }

    public static void main(String[] args) {
        HasHash one = new HasHash(12);
        HasHash two = new HasHash(12);
        System.out.println(one.equals(two));
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
    }
}
