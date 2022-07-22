package com.omer.generics;

import java.util.ArrayList;
import java.util.List;

class A{

}

class B extends A{

}

class C extends A{

}
class D extends  B{

}

public class GenericExamples2 {
    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        List<B> list1 = new ArrayList<>();
        List<C> list2 = new ArrayList<>();
        List<Object> list3 = new ArrayList<>();
        addElementGenericRule(list);
        addElementWildCard(list1);
        addElementWildCard(list2);
        addElementWildCardSuper(list1);
        addElementWildCardSuper(list);
        addElementWildCardSuper(list3);
    }
    public static void addElementGenericRule(List<A> a){

    }
    public static void addElementWildCard(List <? extends A> a){
        // a.add(new C());
        // a.add(new B());
        a.add(null);
    }
    public static void addElementWildCardSuper(List<? super B> a){
        a.add(new B());
        a.add(new D());
        // a.add(new A());
    }
}
