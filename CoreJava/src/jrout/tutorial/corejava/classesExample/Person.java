package jrout.tutorial.corejava.classesExample;

import com.sun.corba.se.impl.orb.PropertyOnlyDataCollector;

public class Person {
    private String name;
    private String type; // Father // Husband // Child //
    private String gender; // male  female

    Person father;
    Person mother;
    Person siblings[];

    Address address;


    public static void main(String[] args) {
        Person tom = new Person();
        tom.name = "Tom";
        tom.type = "Child";
        tom.gender ="Male";

        Person father = new Person();
        father.name  ="Peter Tom";
        father.type = "Father";
        father.gender = "Male";

        tom.father = father;

        Address address = new Address();

        tom.address = address;

        PrintDetails pd = new PrintDetails();
        pd.printDetail(tom);

    }
}
