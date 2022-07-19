package com.omer.generics;

class GenericClass<T>{
    public void genericMethod(T t){
        
    }
    
    public static <T> void genericStaticMethod(T[] array){
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Test11 {
    public static void main(String[] args) {
        Integer[] array1 = {1,2,3,4,5,6,7,8,9,10};
        Double[] array2 = {1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9};
        String[] array3 = {"key 1", "key 2", "key 3", "key 4", "key 5"};
        GenericClass.genericStaticMethod(array1);
        GenericClass.genericStaticMethod(array2);
        GenericClass.genericStaticMethod(array3);
    }
}
