package jrout.tutorial.corejava.exceptionhandling;

public class MyOwnException extends Exception {

    private String message;
    public MyOwnException(String message) {
        super(message);
    }
}
