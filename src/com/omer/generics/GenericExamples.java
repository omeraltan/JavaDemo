package com.omer.generics;

import java.util.ArrayList;
import java.util.List;

class Animals{

}

class Dogs extends Animals{

}

public class GenericExamples {
    public static void main(String[] args) {

        Animals animalDog = new Dogs();
        // List<Animals> animalsDogsList = new ArrayList<Dog>(); // Dos is a Animal but
    }
}
