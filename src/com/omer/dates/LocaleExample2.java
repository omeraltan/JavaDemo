package com.omer.dates;

import java.util.Locale;

public class LocaleExample2 {
    public static void main(String[] args) {
        Locale locBR = new Locale("pt", "BR"); //Brazil
        Locale locDK = new Locale("da", "DK"); //Denmark
        Locale locIT = new Locale("it", "IT"); //Italy
        Locale locTK = new Locale("tr", "TR"); //Turkey

        System.out.println("Denmark, country: " + locDK.getDisplayCountry());
        System.out.println("Denmark, country, local: " + locDK.getDisplayCountry(locDK));
        System.out.println("Denmark, language: " + locDK.getDisplayLanguage());
        System.out.println("Denmark, language, local: " + locDK.getDisplayLanguage(locDK));
        System.out.println("Brazil, country: " + locBR.getDisplayCountry());
        System.out.println("Brazil, country, local: " + locBR.getDisplayCountry(locBR));
        System.out.println("Brazil, language: " + locBR.getDisplayLanguage());
        System.out.println("Brazil, language, local: " + locBR.getDisplayLanguage(locBR));
        System.out.println("Italy, Danish language is: " + locDK.getDisplayLanguage(locIT));
        System.out.println("Turkey, Danish language is: " + locDK.getDisplayLanguage(locTK));
        System.out.println("Turkey, Italy language is: " + locIT.getDisplayLanguage(locTK));
        System.out.println("Turkey, Brazil language is: " + locBR.getDisplayLanguage(locTK));
    }
}
