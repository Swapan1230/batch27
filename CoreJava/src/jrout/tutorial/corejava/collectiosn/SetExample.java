package jrout.tutorial.corejava.collectiosn;

import jrout.tutorial.corejava.inheritance.Bird;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        List<String> alphabetsA = new ArrayList<>();
        alphabetsA.add("a");
        alphabetsA.add("b");
        alphabetsA.add("c");
        alphabetsA.add("d");
        alphabetsA.add("a");
        alphabetsA.add("d");

        System.out.println(alphabetsA);


        Set<String> alphabetAA = new HashSet<>(alphabetsA);
        System.out.println(alphabetAA);

        /*Set<String> alphabets = new HashSet<>();
        alphabets.add("a");
        alphabets.add("b");
        alphabets.add("c");
        alphabets.add("d");
        alphabets.add("a");
        alphabets.add("d");

//        System.out.println(alphabets);


        Set<Bird> birds = new HashSet<>();

        Bird eagle = new Bird("Bird","Blue Finch");
        Bird pigeon = new Bird("Bird","Pigeon");
        Bird hawk = new Bird("Bird","Hawk");
        Bird hawk2 = new Bird("Bird","Hawk");


        birds.add(eagle);
        birds.add(pigeon);
        birds.add(hawk);
        birds.add(hawk2);*/

//        Collections.sort(birds,Comparator.comparing(Bird::getName));
//        System.out.println(birds);



    }


}
