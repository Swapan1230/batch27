package jrout.tutorial.corejava.inheritance;

import jrout.tutorial.corejava.inheritance.abstractexample.Database;
import jrout.tutorial.corejava.inheritance.abstractexample.JavaSoftware;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        /*Bird eagle = new Bird("Bird", "Eagle");
//        main.printBirdDetails(eagle);
        main.printAnimal(eagle);

        DesertedAnimal desertedAnimal = new DesertedAnimal("Camel","Deserted");
//        main.printDesertedDetails(desertedAnimal);
        main.printAnimal(desertedAnimal);
        Lion lion = new Lion("Lion","LionName");
//        main.printLionDetails(lion);
        main.printAnimal(lion);*/

        Animal a = new Bird("Bird", "Eagle");
        main.printAnimal(a);

        a = new DesertedAnimal();
        main.printAnimal(a);

        a = new Lion("Lion","LionName");
        main.printAnimal(a);

//      Bird bb = new Lion("",false);

        Database db = new Database("test",232);



        // So, I am able to access total time because its public
        JavaSoftware software = new JavaSoftware("testSw",232);
        System.out.println(software.totalTime);
//        software.callProtected();
    }

    /*public void printBirdDetails(Bird bird){
        bird.makeNoise();
        System.out.println(bird.getSize());
        System.out.println(bird.getName());
    }

    public void printLionDetails(Lion lion){
        lion.makeNoise();
        System.out.println(lion.getSize());
        System.out.println(lion.getName());
    }

    public void printDesertedDetails(DesertedAnimal animal){
        animal.makeNoise();
        System.out.println(animal.getSize());
        System.out.println(animal.getName());
    }*/


    public void printAnimal(Animal animal) {
        animal.makeNoise();
        System.out.println(animal.getSize());
        System.out.println(animal.getName());
    }

}
