package jrout.tutorial.corejava.classesExample;

import jrout.tutorial.corejava.util.Constant;

public class Main2 {
    public static void main(String[] args) {

        String messageOne  = new String("Hello World");
        String messageTwo = "Hello World";
        String messageThree = "Hello World";

        System.out.println("messageOne == messageTwo : "+ (messageOne == messageTwo));
        System.out.println("messageOne == messageTwo : "+ (messageOne.equals(messageTwo)));

//        TajHotel.TajSecurity security = new TajHotel().new TajSecurity();


//        final int height = 5;
//        height = 10;
        Constant  constant = new Constant();

        System.out.println("Today is "+ constant);


    }
}
