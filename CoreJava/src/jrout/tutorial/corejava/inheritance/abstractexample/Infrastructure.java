package jrout.tutorial.corejava.inheritance.abstractexample;

public class Infrastructure extends ITEngineer{
    public Infrastructure(String name, int empId) {
        super(name, empId,"Infrastructure");
    }

    @Override
    public void natureOfWork() {
        System.out.println("I am a Infra guy");
    }
}
