package jrout.tutorial.corejava.inheritance;

import jrout.tutorial.corejava.inheritance.interfaceexample.Jumpable;
import jrout.tutorial.corejava.inheritance.interfaceexample.Swimming;

public class Lion extends  Animal implements Swimming , Jumpable {
    public Lion(String type, String name) {
        super(type, false);
        super.setName(name);
    }

    @Override
    public void swim() {
        System.out.println("I swim reasonalbly fast....");
    }

    @Override
    public void swimmingSpeed() {

    }

    @Override
    public void jump() {
        System.out.println("i am very good at jumping at others.....");
    }
}
