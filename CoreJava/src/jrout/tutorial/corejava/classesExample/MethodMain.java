package jrout.tutorial.corejava.classesExample;

import jrout.tutorial.corejava.pojo.Student;

public class MethodMain {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Prem");

        Student student2 = new Student();
        student2.setName("Sagar");

        student1.setAge(-8);
        System.out.println("Name "+student1.getName() + " Age is " +student1.getAge());

        MethodMain mm = new MethodMain();
        String decoStrPrem = mm.printWithDecoration(student1.getName());
        System.out.println(decoStrPrem);

        String decoStrSagar = mm.printWithDecoration(student2.getName());
        System.out.println("%%%%"+decoStrSagar+"%%%%%");

        mm.printWithDecoration(student1.getName(), student1.getAge());


    }

    public void printName(String name){
        System.out.println("**************^^"+name+"^^****************");
        return;
    }

    /**
     *
     * @param name
     * @return
     */
    public String printWithDecoration(String name){
        return "**************^^"+name+"^^****************";
    }

    // I am method overloading the printNameWithDecoration method
    /**
     *
     * @param name
     * @param age
     */
    public void printWithDecoration(String name, int age) {
        System.out.println("\n\n");
        System.out.println("*******\t*******^^"+name+"^^****************");
        System.out.println("******\t\t********^^"+age+"^^****************");

    }

    /*
    public void print(){

    }

    public void print(String name){

    }

    public void print(String address, int age){

    }*/







}
