package jrout.tutorial.corejava.classesExample;

public class MyStudents {
    // Object
    public static void main(String[] args) {

        StudentTemplate anish = new StudentTemplate();
        anish.name = "Anish";
        anish.address1 = "Cambridge";

        StudentTemplate raji = new StudentTemplate();
        raji.name = "Raji";

        StudentTemplate prakash = new StudentTemplate();
        prakash.name = "Prakash Raj";
        prakash.address1 = "Cambridge";

        StudentTemplate tom = anish;


        System.out.println("anish = " + anish.name);
        System.out.println("anish address1 =" + anish.address1);


        System.out.println("Raji =" + raji.name);
        System.out.println("Raji address =" + raji.address1);


//        System.out.println("Prakash =" + prakash);
        System.out.println("Tom =" + tom.name);


        System.out.println(anish.address1 == prakash.address1);


        System.out.println("anish  == prakash "+ (anish  == prakash) );

        Elephant elephant = new Elephant();
        elephant.address1 = "Cambridge";
        elephant.friend = "Raji";

        System.out.println(anish.address1 == elephant.address1);

        System.out.println(elephant.friend == raji.name);

        String messageOne  = "Hello World";
        String messageTwo = "Hello World";


        System.out.println("messageOne == messageTwo : "+messageOne == messageTwo);







    }
}
