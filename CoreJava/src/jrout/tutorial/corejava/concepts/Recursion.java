package jrout.tutorial.corejava.concepts;

/**
 * 	Recursion is the process of defining something in terms of itself.
 */

class Factorial{

    int fact(int n){  // 1
        int result;
        if(n == 1) return 1;
        result = fact(n-1) * n; // 2
        return result;
    }
}



public class Recursion {
    public static void main(String[] args) {
        int number = 4;
        // 3* (3-1) * (2-1)
        // 4 --> 4*3*2

        Factorial factorial = new Factorial();
        int result = factorial.fact(number);
        System.out.println(result);

    }
}
