package jrout.tutorial.corejava.util;

public class Constant {
    public final static String monday = "MON";
    public static final String tue = "TUE";
    public static final String wed = "WED";

    public static final String jan = "JAN";
    public static final String feb = "FEB";
    public static final String mar = "MAR";
    public static final String apr = "ARP";

    public static final String ind = "INDIA";


    public static void main(String[] args) {
        System.out.println(monday); //class a
        System.out.println(monday); // class b
        System.out.println(monday); // class c
    }

}

class MyUtil {
    public static int calculateSum(int a , int b){
        return a+b;
    }
}