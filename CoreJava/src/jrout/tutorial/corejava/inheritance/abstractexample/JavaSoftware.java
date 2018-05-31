package jrout.tutorial.corejava.inheritance.abstractexample;


import jrout.tutorial.corejava.inheritance.interfaceexample.Jumpable;

public class JavaSoftware extends Software implements Jumpable {
    public int totalTime = 9;
    int skillLevel = 6;
    public JavaSoftware(String name, int empId) {
        super(name, empId);
    }


    @Override
    public void natureOfWork() {

    }

    @Override
    public void jump() {
        System.out.println("I am good at jumping roaps...");
    }


}
