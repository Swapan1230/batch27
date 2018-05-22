package jrout.tutorial.corejava.inheritance;

public class DesertedAnimal extends Animal {
    public DesertedAnimal(){
        super("Deserted",false);
    }

    public DesertedAnimal(String name, String type){
        this();
        super.getLegs();
        getLegs();
    }
}
