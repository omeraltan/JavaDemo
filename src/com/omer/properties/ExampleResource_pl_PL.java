package com.omer.properties;

import java.math.BigDecimal;
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ExampleResource_pl_PL extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
            {"currency", "polish zloty"},
            {"toUsdRate", new BigDecimal("3.401")},
            {"cities", new String[] { "Warsaw", "Cracow" }}
        };
    }

    public static void main(String[] args) {
        Locale locale = new Locale("pl", "PL");
        ResourceBundle exampleBundle = ResourceBundle.getBundle("com.omer.properties.ExampleResource", locale);
        assertEquals(exampleBundle.getString("currency"), "polish zloty");
        assertEquals(exampleBundle.getObject("toUsdRate"), new BigDecimal("3.401"));
        assertArrayEquals(exampleBundle.getStringArray("cities"), new String[]{"Warsaw", "Cracow"});
    }
}
