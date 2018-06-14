package jrout.tutorial.corejava.threads;

public class MainThread {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();

        String threadName = Thread.currentThread().getName();
        System.out.println("Main Thread Name :"+threadName);

        Horse cheeta = new Horse("Cheeta");
        Horse saka = new Horse("Saka");
        Horse rakka = new Horse("Rakka");

        Thread t1 = new Thread(cheeta,"Cheeta");
        Thread t2 = new Thread(saka,"Saka");
        Thread t3 = new Thread(rakka,"Rakka");

        t1.start();
        t2.start();
        t3.start();

//        cheeta.start(); // start()
//        saka.start();
//        rakka.start();

        long endTime = System.currentTimeMillis();

//        System.out.println("All the Horse finished running... in "+ (endTime-starTime)/1000);

    }
}
