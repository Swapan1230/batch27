package jrout.tutorial.corejava.inheritance.abstractexample;

public class Main {
    public static void main(String[] args) {
        ITEngineer itEngineer = null;

        itEngineer = new Infrastructure("Sam",123);
        printDetails(itEngineer);
        itEngineer = new Software("Tom",334);
        printDetails(itEngineer);
        itEngineer = new Database("Peter",287);
        printDetails(itEngineer);


//        itEngineer = new ITEngineer("Ben",3444,"No Department");
        itEngineer = new JavaSoftware("Sreedhar",333);



    }

    public static void printDetails(ITEngineer itEngineer) {
        System.out.println("Name is ["+itEngineer.getName()+"]");
        System.out.println("EmpId ["+itEngineer.getEmpId()+"]");
        System.out.println("I belong to ["+itEngineer.getDepartment()+"]");
        itEngineer.companyName();
        itEngineer.natureOfWork();
        System.out.println(System.lineSeparator());
    }
}
