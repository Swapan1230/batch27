package jrout.tutorial.corejava.classesExample;


import jrout.tutorial.corejava.pojo.Person;



class TajHotel {
    String name;
    int noOfRooms;

    class Security {
        boolean bestSecurity = true;
        int minNoOfSecurity = 10;
    }

    Person person;

    private void callHotelSecurity(){

    }

    public void danger(){
        callHotelSecurity();
        //

    }

    static class StafUniform{
        String color = "Black";
        ///
    }

}

public class InnerClassExample {
    String name;


    public static void main(String[] args) {
        TajHotel hotel = new TajHotel();
        hotel.danger();

        System.out.println(hotel.name);
        System.out.println(hotel.noOfRooms);

        Person person = new Person("Tom");
        hotel.person = person;

        /*Security security = new Security();
        hotel.security = security;*/

        InnerClassExample innerClassExample = new InnerClassExample();
        innerClassExample.callMe();


        InnerClassExample.sayHello();

        System.out.println(Math.abs(-4));
        ;


        TajHotel.Security jaySecure = new TajHotel().new Security();
        jaySecure.minNoOfSecurity = 20;

        TajHotel.Security ujwalSecure = new TajHotel().new Security();
        ujwalSecure.minNoOfSecurity = 40;

        TajHotel.StafUniform uniform = new TajHotel.StafUniform();


    }

    public void callMe() {

    }

    public static void sayHello() {
        System.out.println("Say Hello");
    }
}
