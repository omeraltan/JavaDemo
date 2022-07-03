package com.omer.test;
/* What is the output of the following applicaiton ? */
public class Dance {
    public static void swing(int... beats) throws ClassCastException{
        try {
            System.out.println("1"+beats[2]);
        }catch (RuntimeException e){
            System.out.print("2");
        }catch (Exception e){
            System.out.print("3");
        }finally {
            System.out.print("4");
        }
    }
    public static void main(String[] args) {
        new Dance().swing(0,0);
        System.out.print("5");
    }
}
