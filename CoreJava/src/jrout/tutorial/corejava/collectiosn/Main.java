package jrout.tutorial.corejava.collectiosn;

import jrout.tutorial.corejava.inheritance.Bird;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int height[] = new int[10];
        height[0] = 89;
        height[9] = 90;

        System.out.println(height[0]);
        System.out.println(height[9]);

//        System.out.println(height[10]);
//        height[10] = 10;


        List listOfObjects = new ArrayList();
        listOfObjects.add("Preety");
        listOfObjects.add("Preety");
        listOfObjects.add("Tom");
        listOfObjects.add("Pragya");
        listOfObjects.add("Rat");
        listOfObjects.add("Suzen");

        Bird bird = new Bird("Bird","Blue Finch");
        listOfObjects.add(bird);

//        System.out.println(listOfObjects.size());
//        System.out.println(listOfObjects);

        listOfObjects.add("Rajesh");

//        System.out.println(listOfObjects);

        listOfObjects.add(1,"Montana");

//        System.out.println(listOfObjects);
//
//        System.out.println(listOfObjects.get(6));

        System.out.println(listOfObjects);
        Main main = new Main();

        main.printAllElements(listOfObjects);
    }


    public void printAllElements(List objects){

    }
}
