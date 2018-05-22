package jrout.tutorial.corejava.util;

public enum Months {
    JAN(0),FEB(1),MAR(2);

    int val;
    Months(int val){
        this.val = val;
    }
    public int getValue(){
        return this.val;
    }
}
