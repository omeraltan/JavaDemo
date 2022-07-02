package com.omer.test;

public class Legos {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("red");
        sb.deleteCharAt(0);
        sb.delete(1,1);
        System.out.println(sb);

        String [][] listing = new String[][] {{"Book","34.99"},{"Game","29.99"},{"Pen",".99"}};
        System.out.println(listing.length + " " + listing[0].length);
    }
}
