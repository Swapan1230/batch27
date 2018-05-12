package jrout.tutorial.corejava.controlstatement;

public class BreakContinue {


    public static void main(String[] args) {

        int ageTree[] = {12, 3, 4, 5, 67, 898, 23, 45, 77, 56, 233};

        int lookup = 3;
        for (int i = 0; i < ageTree.length; i++) {
            int age = ageTree[i];
//            if(ageTree[i] == lookup){
//                System.out.println("Lookup is Present "+ lookup);
//                break;
//            }

            if (age == lookup)
                continue; // break;
            System.out.println("Lookup is Present " + ageTree[i]);

        }
    }
}
