package arithemetic;

public class ArithemeticOperator {
    public static void main(String[] args) {
        int age = 32;
        int height = 6;
        String name = "Adif";
        char firstLetterOfYourName = 'J';
        // Compile time error
        // Runtime exception
        String firstName = "Mohan";
        String lastName = "Babu";

        System.out.println(age+height +" is for " + name);
        System.out.println("Details for " + name +" "+ (age+height));

        System.out.println(firstName + lastName);

        System.out.println("Modulus % = " + (age%height));

//        System.out.println("Jayram");
//        System.out.println("Jayram");
//        System.out.println("Jayram");
//        System.out.println("Jayram");
//        System.out.println("Jayram");
        /// age == 32
        System.out.println(age > 18);

        boolean isAKid = age < 18;
        System.out.println("is a Kid =" + isAKid);
        System.out.println(!isAKid);

//        if(age > 18) {
        if(!isAKid){
            System.out.println("You are a Grown up Kid");
        }else {
            System.out.println("You are still a KID");
        }

        // initilization ; condition check; increment
//        for(int i = 0; i < 5; i++) {
//            System.out.println("Jayram "+ i);
//        }


        for(int i = 0; i < 5; i+=4) {
            System.out.println("Jayram "+ i);
        }

//        for(int i = 0; i < 5;) {
//            System.out.println("Jayram"+ i);
//        }


        // Increment
        int year = 2018;

        year = year + 1;

    }
}