package jrout.tutorial.corejava.controlstatement;

/**
 * Switch statement
 */
public class Main {
    public static void main(String[] args) {

//        int age = 10;
        for (int age = 0; age < 10; age++) {


        /*
            if(age  == 1) {
                System.out.println("Age is One");
            }else if (age == 2){
                System.out.println("Age is Two");
            }else if(age == 6){
                System.out.println("Age is Six");
            }else if(age == 9){
                System.out.println("Age is Nine");
            }else {
                System.out.println("Do not know the age..." + age);
            }*/

            /*switch (age) {
                case 1:
                    System.out.println("Age is One");
                    break;
                case 2:
                    System.out.println("Age is One");
                    break;
                case 6:
                    System.out.println("Age is One");
                    break;
                case 9:
                    System.out.println("Age is One");
                    break;
                default:
                    System.out.println("Do not know the age..." + age);
            }
*/
        }

        int height = 1;
        switch (height) {
            case 1:{
                System.out.println("Age is One");
                break;
            }
            case 2:
                System.out.println("Age is two");
                break;
            case 6:
                System.out.println("Age is six");
                break;
            case 9:
                System.out.println("Age is One");
                break;
            default:
                System.out.println("Do not know the Height..." + height);
        }
    }
}
