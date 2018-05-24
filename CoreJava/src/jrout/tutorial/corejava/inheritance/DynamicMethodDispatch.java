package jrout.tutorial.corejava.inheritance;

public class DynamicMethodDispatch {


    public static void main(String[] args) {
        int result = add(2,3);
        System.out.println(result);
        result = add(2,3,4);
        System.out.println(result);

        DynamicMethodDispatch dmd = new DynamicMethodDispatch();
        dmd.add(2,3,4,5);


    }

    //Compile time polymorphism/Static polymorphism
    //(Method overloading)

    public static int add(int a , int b) {

        return a+b;
    }

    public static int add(int a , int b , int c) {
        return a+b+c;
    }

    public int add(int a , int b , int c , int d ){
        return 4;
    }


}
