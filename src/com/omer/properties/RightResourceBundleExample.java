package com.omer.properties;

import java.util.Locale;
import java.util.ResourceBundle;

public class RightResourceBundleExample {
    public static void main(String[] args){
        Locale locale = new Locale("en", "UK");
        ResourceBundle rb = ResourceBundle.getBundle("RB", locale);
        System.out.println(rb.getString("ride.in") + " " + rb.getString("elevator"));
    }
}
