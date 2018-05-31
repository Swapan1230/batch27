package jrout.tutorial.corejava.inheritance.interfaceexample;

import jrout.tutorial.corejava.inheritance.Lion;
import jrout.tutorial.corejava.inheritance.abstractexample.Database;

public class Main {
    /**
     * I am only interested about the swimming behavour..
     * @param args
     */
    public static void main(String[] args) {
        Swimming db = new Database("Tom",3456);
        printSwimmingDetails(db);

        Swimming lion = new Lion("Animal","Lion");
        printSwimmingDetails(lion);

        System.out.println(lion.getClass());
        System.out.println(lion.getClass().getName());
    }


    public static void printSwimmingDetails(Swimming swimming) {
        swimming.swim();
        swimming.swimmingSpeed();
    }











}
