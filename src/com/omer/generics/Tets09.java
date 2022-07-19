package com.omer.generics;

import java.util.ArrayList;
import java.util.List;

class Animal3{

}

class Dog3 extends Animal3{

}

class  Cat3 extends Animal3{

}

class  Kangal extends Dog3{

}

public class Tets09 {
    public static void main(String[] args) {
        List<Animal3> animalList = new ArrayList<Animal3>();
        List<Dog3> dogList = new ArrayList<Dog3>();
        List<Kangal> kangalList = new ArrayList<Kangal>();
        List<Cat3> catList = new ArrayList<Cat3>();

        listRules(animalList);
        listRules(dogList);
        listRules(kangalList);
        // listRules(catList); // compile time error

        System.out.println(dogList.size());
        System.out.println(animalList.size());
        System.out.println(kangalList.size());

        System.out.println(animalList);
        System.out.println(dogList);
        System.out.println(kangalList);
    }

    public static void listRules(List<? super Kangal> list){
        list.add(new Kangal());
        // list.add(new Animal3()); // compile time error
    }
}
