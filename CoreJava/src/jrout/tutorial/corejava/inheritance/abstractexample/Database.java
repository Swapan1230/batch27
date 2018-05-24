package jrout.tutorial.corejava.inheritance.abstractexample;

public class Database extends ITEngineer{
    public Database(String name, int empId) {
        super(name, empId,"Database");
    }

    @Override
    public void natureOfWork() {
        System.out.println("I am a database guy");
    }
}
