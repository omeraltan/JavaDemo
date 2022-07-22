package com.omer.generics;

import java.util.ArrayList;
import java.util.List;

class Animals{

}

class Dogs extends Animals{

}

class Cats extends Animals{

}

public class GenericExamples {
    public static void main(String[] args) {

        Animals animalDog = new Dogs();
        // List<Animals> animalsDogsList = new ArrayList<Dog>(); // Dos is a Animal but compiler error

        Animal[] animalDogArray = new Dog[5];
        animalDogArray[0] = new Dog();
        animalDogArray[0] = new Cat();  // java.Land.ArrayStoreException
    }
}
