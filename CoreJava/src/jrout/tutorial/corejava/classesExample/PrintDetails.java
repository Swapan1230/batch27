package jrout.tutorial.corejava.classesExample;

import jrout.tutorial.corejava.pojo.Person;
import jrout.tutorial.corejava.pojo.Student;

public class PrintDetails {
    /**
     *
     * @param student
     */
    public void printDetails(Student student) {
        System.out.println("---------------");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        for(String course : student.getCourseTaken()){
            System.out.println("\t"+course);
        }

        System.out.println("=====Address=====");

        System.out.println(student.getAddress().getAddress1());
        System.out.println(student.getAddress().getAddress2());
        System.out.println(student.getAddress().getAddressCity());
        System.out.println(student.getAddress().getAddressZip());
    }


    public void printDetail(Person person) {
        // This should print all the information....
    }
}
