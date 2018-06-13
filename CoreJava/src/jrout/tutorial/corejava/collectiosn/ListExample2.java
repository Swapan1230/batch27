package jrout.tutorial.corejava.collectiosn;

import jrout.tutorial.corejava.inheritance.Animal;
import jrout.tutorial.corejava.inheritance.Bird;
import jrout.tutorial.corejava.inheritance.Lion;

import java.util.*;

public class ListExample2 {
    public static void main(String[] args) {
        List<String> alphabets = new ArrayList<>();

        alphabets.add("d");
        alphabets.add("a");
        alphabets.add("c");
        alphabets.add("b");
        alphabets.add("a");
        alphabets.add("d");

        System.out.println(alphabets);

        Collections.sort(alphabets);

        System.out.println(alphabets);





        Bird eagle = new Bird("Bird","Blue Finch");
        Bird pigeon = new Bird("Bird","Pigeon");
        Bird hawk = new Bird("Bird","Hawk");
        Bird hawk2 = new Bird("Bird","Hawk");

        List<Bird> birds = new ArrayList<>();
        birds.add(hawk2);
        birds.add(eagle);
        birds.add(pigeon);
        birds.add(hawk);

        System.out.println("Before "+birds);
//        Collections.sort(birds,Comparator.comparing(Bird::getName));

//        NameComparator comparator = new NameComparator();
//        Collections.sort(birds, comparator);

        //anonymous inner class...
        /*Collections.sort(birds, new Comparator<Bird>() {
            @Override
            public int compare(Bird o1, Bird o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/


//        Collections.sort(birds, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        Collections.sort(birds, Comparator.comparing(Animal::getName).reversed());
        System.out.println("After "+birds);
    }
}

class NameComparator implements Comparator<Bird>{
    @Override
    public int compare(Bird o1, Bird o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
