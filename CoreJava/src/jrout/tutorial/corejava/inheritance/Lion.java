package jrout.tutorial.corejava.inheritance;

public class Lion extends  Animal {
    public Lion(String type, String name) {
        super(type, false);
        super.setName(name);
    }

}
