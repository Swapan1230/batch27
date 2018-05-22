package jrout.tutorial.corejava.inheritance;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird("Bird", "Eagle");

        System.out.println("Type is :"+eagle.getType() +" Name is "+ eagle.getName());
        System.out.println("Wing size = "+eagle.getWingSize());



    }
}
