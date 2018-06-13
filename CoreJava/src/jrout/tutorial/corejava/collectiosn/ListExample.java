package jrout.tutorial.corejava.collectiosn;

import jrout.tutorial.corejava.inheritance.Bird;
import jrout.tutorial.corejava.inheritance.Lion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExample {
    public static void main(String[] args) {

        List<Bird> listOfBirds = new ArrayList();

        Bird eagle = new Bird("Bird","Blue Finch");
        Bird pigeon = new Bird("Bird","Pigeon");
        Bird hawk = new Bird("Bird","Hawk");
        Lion lion = new Lion("Jungle","Lion");

        listOfBirds.add(eagle);
        listOfBirds.add(pigeon);
        listOfBirds.add(hawk);
//        listOfBirds.add(lion);
        ListExample example = new ListExample();
        example.printAllElementDetails(listOfBirds);











    }

    public void printAllElementDetails(List<Bird> birdList){
        for(int i = 0 ; i < birdList.size(); i++) {
            Bird bird =  birdList.get(i);
            System.out.println(bird.getName());
        }

        for(Bird bird : birdList) {
            System.out.println(bird.getName());
        }



    }
}
