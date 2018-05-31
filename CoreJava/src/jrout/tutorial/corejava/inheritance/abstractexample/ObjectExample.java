package jrout.tutorial.corejava.inheritance.abstractexample;

public class ObjectExample {
    public static void main(String[] args) {
//        JavaSoftware itEngineer = new JavaSoftware("Sreedhar",333);
//            Software itEngineer = new JavaSoftware("Sreedhar",333);
        ITEngineer itEngineer = new JavaSoftware("Sreedhar",333);

        System.out.println(itEngineer.getDepartment());
        System.out.println(itEngineer.toString());
        
    }
}
