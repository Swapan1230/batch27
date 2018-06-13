package jrout.tutorial.corejava.collectiosn;

import jrout.tutorial.corejava.inheritance.Bird;
import jrout.tutorial.corejava.inheritance.Lion;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // List Set Collections

        // Map
        // Person lived in how many contries
        // Person Name and List of Countries


        Map<String, List<String>> personToCountryMap = new HashMap<>();

        List<String> countries1 = new ArrayList<>();
        countries1.add("India");
        countries1.add("USA");
        countries1.add("Australia");

        List<String> countries2 = new ArrayList<>();
        countries2.add("India");
        countries2.add("Spain");
        countries2.add("Brazil");

        personToCountryMap.put("Tom",countries1);
        personToCountryMap.put("Mike",countries1);
        personToCountryMap.put("Peter",countries2);

//        System.out.println(personToCountryMap);
//
//        System.out.println(personToCountryMap.get("Peter"));
        Set<String> strings = personToCountryMap.keySet();

        for(String name : strings){
            List<String> countries = personToCountryMap.get(name);

            for(String country : countries) {
                System.out.println(country);
            }
//            System.out.println(personToCountryMap.get(name));
        }

//        personToCountryMap.entrySet().iterator()

    }
}
