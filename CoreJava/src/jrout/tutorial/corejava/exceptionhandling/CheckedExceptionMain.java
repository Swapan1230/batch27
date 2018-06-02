package jrout.tutorial.corejava.exceptionhandling;

public class CheckedExceptionMain {
    public static void main(String[] args) {
        int age = 10;
        int value = 0;
        CheckedExceptionMain main = new CheckedExceptionMain();

//        main.calculateDiscount(age,value);


        /*try {
            main.calculateDiscountAgain(age,value);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("I am giving .3 discount...");
        }*/

        /*try{
            main.calculateDiscount(age,value);
        }catch (Exception exp) {
            System.out.println("Something went wrong...");
        }*/


        try {
            main.calculateExerciseHours(3);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

        }

        System.out.println("I am at the end of the program...");
    }



    private void calculateDiscount(int age , int value) throws RuntimeException {
        int discountArray[] = {1,3,4,5,6};
        String name = null;
        System.out.println("I am starting my calculation....");

        int val = age / value;
        int discount = 0;

        discount = discountArray[val];
        System.out.println(name.toUpperCase());
    }

    private void calculateDiscountAgain(int age , int value) throws Exception {
        int discountArray[] = {1,3,4,5,6};
        String name = null;
        System.out.println("I am starting my calculation....");

        int val = age / value;
        int discount = 0;

        discount = discountArray[val];
        System.out.println(name.toUpperCase());


    }


    private void calculateExerciseHours(int age) throws MyOwnException {
        if(age < 5) {
//            throw new IllegalArgumentException("Please pass a legal Age. "+ age +" Is not a legal age..");
            throw new MyOwnException("Please pass a legal Age. "+ age +" Is not a legal age..");
        }
        int exerciseHours = age/8;

        System.out.println("Exercise Hours is "+ exerciseHours);
    }


    
}
