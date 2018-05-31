package jrout.tutorial.corejava.inheritance.abstractexample;

public abstract class Software extends ITEngineer {

    public Software(String name, int empId) {
        super(name, empId,"Software");
    }

    protected void callProtected(){
        System.out.println("This is protected method.");
    }
}
