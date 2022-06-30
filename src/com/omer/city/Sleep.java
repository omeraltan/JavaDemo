package com.omer.city;

public class Sleep {

    public static void snore() { try {
        String sheep[] = new String[3];
        System.out.print(sheep[3]); } catch (RuntimeException e) { System.out.print("Awake!");
    } finally {
        throw new Exception(); // need try - catch block
    } }

    public static void main(String[] args){
        new Sleep().snore();
    }
}
