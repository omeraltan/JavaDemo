package com.omer.properties;

import java.util.Locale;
import java.util.ResourceBundle;

public class ChooChoo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle rb = ResourceBundle.getBundle("com.omer.properties.Train", new Locale("en", "US"));
        System.out.println(rb.getString("ride") + " " + rb.getString("train"));
    }
}
