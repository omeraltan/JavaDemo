package com.omer.optional;

public class TernaryExample {
    public static void main(String[] args) {

        int leaders = 10 * (2 + (1 + 2 / 5));
        int followers = leaders * 2;
        System.out.print(leaders + followers < 10 ? "Too few" : "Too many");

        double movieRating = 5 <=4 ? 3 : 3 > 1 ? 2 : 1;
        System.out.print(movieRating);
    }
}
