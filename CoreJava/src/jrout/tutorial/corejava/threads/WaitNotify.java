package jrout.tutorial.corejava.threads;


public class WaitNotify {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        new Reader(calculator).start();
        new Reader(calculator).start();
        new Reader(calculator).start();

        calculator.start();


    }
}

class Reader extends Thread {
    Calculator calculator;

    public Reader(Calculator calculator) {
        this.calculator = calculator;
    }

    public void run() {
        synchronized (calculator) {
            try {
                System.out.println("Waiting for calculation...." + Thread.currentThread().getName());
                calculator.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Total is "+ calculator.total +" Thread Name "+ Thread.currentThread().getName());

        }
    }
}

class Calculator extends Thread {
    int total;
    public void run(){
        synchronized (this) {
            for(int i =0 ; i < 10 ; i ++) {
                total += i;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notifyAll();
        }
    }
}