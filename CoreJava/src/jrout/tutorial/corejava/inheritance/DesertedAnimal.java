package jrout.tutorial.corejava.inheritance;

public class DesertedAnimal extends Animal {
    public DesertedAnimal(){
        super("Deserted",false);
    }

    public DesertedAnimal(String name, String type){
        this();
        setName(name);

    }

    @Override
    public void makeNoise(){
        System.out.println(getType() + " I am going to make some loud noise...");
    }
}
