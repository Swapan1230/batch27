package jrout.tutorial.corejava.inheritance.abstractexample;

import jrout.tutorial.corejava.inheritance.interfaceexample.Jumpable;
import jrout.tutorial.corejava.inheritance.interfaceexample.Swimming;

/**
 * If you extend an abstract class and if that abstract class has a abstract method,
 * then you have to override the method.
 *
 */
public class Database extends ITEngineer implements Swimming , Jumpable {
    public Database(String name, int empId) {
        super(name, empId,"Database");
    }

    @Override
    public void natureOfWork() {
        System.out.println("I am a database guy");
    }

    @Override
    public void swim() {
        System.out.println("Being a human I would swim Fast");
    }

    @Override
    public void swimmingSpeed() {

    }


    @Override
    public void jump() {
        System.out.println("I am not good at jumping...");
    }
}
