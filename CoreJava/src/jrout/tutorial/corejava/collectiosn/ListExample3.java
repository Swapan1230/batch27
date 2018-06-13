package jrout.tutorial.corejava.collectiosn;

import jrout.tutorial.corejava.inheritance.Animal;
import jrout.tutorial.corejava.inheritance.Bird;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("dog");
        names.add("anatalop");
        names.add("change");
        names.add("bat");
        names.add("antalist");
        names.add("dakar");

        /*List<String> newList = new ArrayList<>();
        for(String name : alphabets){
            if(name.startsWith("an")) {
                newList.add(name);
            }
        }

        System.out.println(newList);*/


        /*List<Name> newList = alphabets.stream()
                .filter(obj -> obj.startsWith("an"))
                .map(ListExample3::createName)
                .collect(Collectors.toList());*/


        List<Name> newList = new ArrayList<>();

        for(String name : names){
            if(name.startsWith("an")) {
                newList.add(createName(name));
            }
        }

        System.out.println(newList);

        newList = names.stream()
                .filter(obj -> obj.startsWith("an"))
                .filter(obj -> obj.contains("ata"))
//                .map(obj -> createName(obj))
                .map(ListExample3::createName)
                .collect(Collectors.toList());
        System.out.println(newList);
    }

    public static Name createName(String name){
        return new Name(name);
    }
}

class Name{
    private String name;
    public Name(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}


/*
*   Collections.sort inorder to order values in a List
*   Can you try doing the same operation for a SET.
*   Create Multiple Objects pass it on to the set and print the output.
*/
