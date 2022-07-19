package com.omer.generics;

import java.util.ArrayList;
import java.util.List;

class Animal2{

}

class Dog2 extends Animal2{

}

class  Cat2 extends Animal2{

}

interface Live {

}

public class Test08 {
    public static void main(String[] args) {
        List<Animal2> animalList = new ArrayList<Animal2>();
        List<Dog2> dogList = new ArrayList<Dog2>();
        List<Cat2> catList = new ArrayList<Cat2>();

        listRules(animalList);
        listRules(dogList);
        listRules(catList);
    }
    public static void listRules(List<? extends Animal2> animalList){
        // animalList.add(new Animal2());  // compile time error
        // animalList.add(new Dog2());     // compile time error
        // animalList.add(new Cat2());     // compile time error

        animalList.add(null);
    }

    public static void listRules2(List<? extends Live> lives){

    }


}
