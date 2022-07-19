package com.omer.generics;

import java.util.ArrayList;
import java.util.List;

class Animal{

}

class Dog extends Animal{

}

class  Cat extends Animal{

}

public class Test07 {
    public static void main(String[] args) {

        Animal animalRef = new Dog(); // Dog IS-A Animal
        List<Animal> listAnimal = new ArrayList<Animal>();
        List<Dog> listDog = new ArrayList<Dog>();

        //List<Animal> list1 = new ArrayList<Dog>(); // Dog IS-A Animal but give compile time error

        listRule(listAnimal); // success
        // listRule(listDog); // compile time error
    }

    public static void listRule(List<Animal> animalList){
        animalList.add(new Dog());
        animalList.add(new Cat());
    }
}
