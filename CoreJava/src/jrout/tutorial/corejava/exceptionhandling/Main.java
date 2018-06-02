package jrout.tutorial.corejava.exceptionhandling;

import jrout.tutorial.corejava.inheritance.Animal;
import jrout.tutorial.corejava.inheritance.Bird;

public class Main {
    public static void main(String[] args) {
        int age = 10;
        int value = 4;
        int discountArray[] = {1,3,4,5,6};
        String name = "Testing";

        System.out.println("I am starting my calculation....");

        int discount = 0;

        try{
            int val = age / value;
            discount = discountArray[val];
            System.out.println(name.toUpperCase());

        }catch (ArithmeticException ae) {
            System.err.print("This is an Exception in you code1\n");
            discount = 1;
        }catch (ArrayIndexOutOfBoundsException aiobe) {
            System.err.print("This is an Exception in you code2\n");
            discount = 2;
        }catch (NullPointerException npe) {
            System.err.print("This is an Exception in you code3\n");
            discount = 6;
        }catch (Exception ae) {
            System.err.print("This is an Exception in you code1\n");
            discount = 1;
            ae.printStackTrace();
        }finally {
            System.out.println("I am done with my functionaliy...");
        }




        try{
            int val = age / value;
            discount = discountArray[val];
            System.out.println(name.toUpperCase());
        }catch (Exception ae) {
            System.err.print("This is an Exception in you code1\n");
            discount = 1;
            ae.printStackTrace();
        }


        System.out.println("The discount I got was "+ discount);
        System.out.println("I am going out for shopping again....");
    }

}
