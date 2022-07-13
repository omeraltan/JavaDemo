package com.omer.properties;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Labels_en_CA extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
            {"hello", new StringBuilder("from Java")}
        };
    }

    public static void main(String[] args) {
        Locale locale = new Locale("en", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("Labels", locale);
        System.out.println(rb.getObject("hello"));
    }



}
