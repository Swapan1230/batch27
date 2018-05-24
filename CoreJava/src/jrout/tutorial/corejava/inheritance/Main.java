package jrout.tutorial.corejava.inheritance;

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
