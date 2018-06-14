package jrout.tutorial.corejava.threads;

public class Printer implements Runnable {

    String servingTo;
    public Printer(String name){
        this.servingTo = name;
    }


    @Override
    public void run() {
        synchronized(this){
            for(int i = 0 ; i < 5; i ++) {
                System.out.println("Serving ["+ servingTo+"]"+"["+Thread.currentThread().getName()+"]" + i);
            }
        }
    }
}
