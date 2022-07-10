package com.omer.singleton;

public class Singleton {
    private static Singleton uniqueInstance; // We have a static variable to hold  our one instance of the class Singleton
    private Singleton(){} // Our constructor is declared private; only Singleton can instantiate this class!

    public static Singleton getInstance(){ // The getInstance() method gives us a way to instantiate the class and also to return an instance of it.

        if (uniqueInstance == null){ // uniqueInstance holds our one instance; remember, it is a static variable.
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
