package jrout.tutorial.corejava.threads;

public class Horse implements Runnable { // extends Thread
    private String name;

    public Horse(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        startRunning();
    }

    public void startRunning() {
        String threadName = Thread.currentThread().getName();
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("["+threadName+"]Hourse "+ name +" Started running.."+i);
        }
    }
}
