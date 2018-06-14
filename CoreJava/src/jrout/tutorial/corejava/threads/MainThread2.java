package jrout.tutorial.corejava.threads;

public class MainThread2 {

    public static void main(String[] args) {
        Printer printer = new Printer("Mona");


        Thread t1 = new Thread(printer,"Ram");
        Thread t2 = new Thread(printer,"Chitra");
        Thread t3 = new Thread(printer,"Kriti");
        Thread t4 = new Thread(printer,"Rohan");

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
