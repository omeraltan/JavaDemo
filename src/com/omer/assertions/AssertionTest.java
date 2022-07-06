package com.omer.assertions;

class User{
    String name;
    int age;

    public User(String name, int age) {
        assert (age > 0) : "Negatif Yaş olamaz!";
        this.name = name;
        this.age = age;
    }
}

public class AssertionTest {
    public static void main(String[] args) {
        User user = new User("Ömer", -4);
    }
}
